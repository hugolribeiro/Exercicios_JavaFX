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

public class StudentBoundary  extends Application {

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private StudentControl control = new StudentControl();

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
        gp.add(new Label("Formato dd/mm/aaaa"), 2, 4);
        gp.add(btnAdicionar, 0, 5);
        gp.add(btnPesquisar, 1, 5);

        btnAdicionar.setOnAction((e)->{
            control.adicionar(boundaryToEntity());
            this.entityToBoundary(new Student());
        });

        btnPesquisar.setOnAction((e)->{
            Student student = control.pesquisarPorTitulo(txtNome.getText());
            this.entityToBoundary(student);
        });

        stage.setScene(scn);
        stage.setTitle("CRUD Aluno");
        stage.show();
    }

    public Student boundaryToEntity() {
        Student student = new Student();
        student.setRa(txtRa.getText());
        student.setNome(txtNome.getText());
        try {
            student.setId(Long.parseLong(txtId.getText()));
            student.setNascimento(LocalDate.parse(txtNascimento.getText(), dtf) );
        } catch(Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public void entityToBoundary(Student student) {
        if (student != null) {
            txtId.setText(String.valueOf(student.getId()));
            txtRa.setText(student.getRa());
            txtNome.setText(student.getNome());
            txtNascimento.setText(student.getNascimento().format(dtf));
        }
    }

    public static void main(String[] args) {
        Application.launch(StudentBoundary.class, args);
    }
}
