package sample;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LongStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlunoBoundary  extends Application {

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");
    private Button btnLimpar = new Button("Limpar");

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private AlunoController control = new AlunoController();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        Scene scn = new Scene(gp, 600, 400);

        gp.add(new Label("Id"), 0, 0);
        gp.add(txtId,1, 0);
        gp.add(new Label("Ra"), 0, 1);
        gp.add(txtRa,1, 1);
        gp.add(new Label("Nome"), 0, 2);
        gp.add(txtNome,1, 2);
        gp.add(new Label("Nascimento"), 0, 4);
        gp.add(txtNascimento,1, 4);

        GridPane gpButtons = new GridPane();
        gpButtons.add(btnAdicionar, 0, 5);
        gpButtons.add(btnPesquisar, 1, 5);
        gpButtons.add(btnLimpar, 2, 5);


        gp.add(gpButtons, 1, 5);

        btnAdicionar.setOnAction((e)->{control.adicionar();});
        btnPesquisar.setOnAction((e)->{control.pesquisarPorNome();});
        btnLimpar.setOnAction((e)->{control.limpar();});

        StringConverter longToStringConverter = new LongStringConverter();
        StringConverter localDateToStringConverter = new LocalDateStringConverter();

        Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(), longToStringConverter);
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(), localDateToStringConverter);
        Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());

        stage.setScene(scn);
        stage.setTitle("CRUD Aluno");
        stage.show();
    }

    public Aluno boundaryToEntity() {
        Aluno aluno = new Aluno();
        aluno.setRa(txtRa.getText());
        aluno.setNome(txtNome.getText());
        try {
            aluno.setId(Long.parseLong(txtId.getText()));
            aluno.setNascimento(LocalDate.parse(txtNascimento.getText(), dtf) );
        } catch(Exception e) {
            e.printStackTrace();
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