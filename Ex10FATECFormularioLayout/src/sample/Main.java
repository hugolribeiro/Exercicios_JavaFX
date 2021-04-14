package sample;

//Author Hugo Leça Ribeiro
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.setVgap(15);
        gridPane.setHgap(15);

        Scene scn = new Scene(gridPane, 650, 250);

        // Criando label ID
        Label labelId = new Label("Id");
        gridPane.add(labelId,2,2);

        // Criando campo de texto pra ID
        TextField textId = new TextField();
        textId.setPromptText("Insira o ID");
        textId.setPrefColumnCount(35);
        gridPane.add(textId,3,2);

        //Criando label para Nome
        Label labelNome = new Label("Nome");
        gridPane.add(labelNome,2,3);

        // Campo de texto para nome
        TextField textNome = new TextField();
        textNome.setPromptText("Insira seu nome");
        textNome.setPrefColumnCount(35);
        gridPane.add(textNome,3,3);

        // Criando label para Telefone
        Label labelTelefone = new Label("Telefone");
        gridPane.add(labelTelefone,2,4);

        // Criando campo de texto para telefone
        TextField textTelefone = new TextField();
        textTelefone.setPromptText("Insira seu telefone");
        textTelefone.setPrefColumnCount(35);
        gridPane.add(textTelefone,3,4);

        // Criando botões
        Button btnSalvar = new Button("Salvar");
        gridPane.add(btnSalvar,2,5);
        Button btnPesquisar = new Button("Pesquisar");
        gridPane.add(btnPesquisar,3,5);


        primaryStage.setTitle("Formulário");
        primaryStage.setScene(scn);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
