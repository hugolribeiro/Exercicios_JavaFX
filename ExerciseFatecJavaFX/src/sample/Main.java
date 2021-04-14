// Author: Hugo Leça Ribeiro

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane panel = new Pane();
        Scene scn = new Scene(panel, 700, 200);
        primaryStage.setTitle("Formulário");


        // Creating labels
        Label labelId = new Label("Id");
        Label labelNome = new Label("Nome");
        Label labelTelefone = new Label("Telefone");

        // Creating Buttons
        Button buttonSalvar = new Button("Salvar");
        Button buttonPesquisar = new Button("Pesquisar");

        // Creating text fields
        TextField txtId = new TextField();
//        txtId.setPrefColumnCount(45);
//        txtId.setPrefHeight(20);
        txtId.setPrefSize(580, 30);
        TextField txtNome = new TextField();
//        txtNome.setPrefColumnCount(45);
//        txtNome.setPrefHeight(20);
        txtNome.setPrefSize(580, 30);
        TextField txtTelefone = new TextField();
//        txtTelefone.setPrefColumnCount(45);
//        txtTelefone.setPrefHeight(20);
        txtTelefone.setPrefSize(580, 30);

        // Relocate all labels, buttons and text fields
        labelId.relocate(20, 45);
        labelNome.relocate(20, 85);
        labelTelefone.relocate(20, 125);
        buttonSalvar.relocate(20, 160);
        buttonPesquisar.relocate(80, 160);
        txtId.relocate(85, 40);
        txtNome.relocate(85, 80);
        txtTelefone.relocate(85, 120);


        // Putting all labels and buttons into the panel
        panel.getChildren().addAll(labelId, labelNome, labelTelefone,
                buttonPesquisar, buttonSalvar, txtId, txtNome, txtTelefone);

        primaryStage.setScene(scn);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
