package exercise14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlunoBoundary extends Application {

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar Por Nome");
    private Button btnPesquisarId = new Button("Pesquisar Por ID");
    private Button btnLimpar = new Button("Limpar campos");

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 450, 200);

        gp.add(new Label("Id"), 0, 0);
        gp.add(txtId,1, 0);
        gp.add(new Label("Ra"), 0, 1);
        gp.add(txtRa,1, 1);
        gp.add(new Label("Nome"), 0, 2);
        gp.add(txtNome,1, 2);
        gp.add(new Label("Nascimento"), 0, 4);
        gp.add(txtNascimento,1, 4);
        gp.add(new Label("Formato dd/mm/aaaa"), 2, 4);
        gp.add(btnAdicionar, 0, 5);
        gp.add(btnPesquisar, 1, 5);
        gp.add(btnPesquisarId, 2, 5);
        gp.add(btnLimpar, 3, 5);


        btnAdicionar.setOnAction((e)->{
            if (boundaryToEntity().nascimento != null){
                control.adicionar(boundaryToEntity());
                this.entityToBoundary(new Aluno());
                limparMethod();
            }
        });

        btnPesquisar.setOnAction((e)->{
            Aluno aluno = control.pesquisarPorNome(txtNome.getText());
            this.entityToBoundary(aluno);
        });

        btnPesquisarId.setOnAction((e)->{
            Aluno aluno = control.pesquisarPorId(Long.parseLong(txtId.getText()));
            this.entityToBoundary(aluno);
        });

        btnLimpar.setOnAction((e)->{
            limparMethod();
        });

        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();
    }

    private void limparMethod(){
        txtId.setText("");
        txtNome.setText("");
        txtRa.setText("");
        txtNascimento.setText("");
    }

    public Aluno boundaryToEntity() {
        Aluno aluno = new Aluno();
        try{
            aluno.setRa(txtRa.getText());
            aluno.setNome(txtNome.getText());
            aluno.setId(Long.parseLong(txtId.getText()));
            aluno.setNascimento(LocalDate.parse(txtNascimento.getText(), dtf) );
            if ((aluno.getRa() == null) || (aluno.getId() < 0) || (aluno.getNome() == null)){
                return null;
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(control.getAlunos());
            return null;
        }
        return aluno;
    }

    public void entityToBoundary(Aluno aluno) {
        if (aluno != null) {
            txtId.setText(String.valueOf(aluno.getId()));
            txtRa.setText(aluno.getRa());
            txtNome.setText(aluno.getNome());
            txtNascimento.setText(aluno.getNascimento().format(dtf));
        }
    }

    public static void main(String[] args) {
        Application.launch(AlunoBoundary.class, args);
    }
}
