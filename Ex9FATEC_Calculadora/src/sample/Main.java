// Author: Hugo Leça Ribeiro
package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane panel = new Pane();
        Scene scn = new Scene(panel, 300, 320);

        // Making the text field to show the current value
        TextField txtCurrValues = new TextField();

        // Making all buttons
        Button buttonOne = new Button("1");
        Button buttonTwo = new Button("2");
        Button buttonThree = new Button("3");
        Button buttonFour = new Button("4");
        Button buttonFive = new Button("5");
        Button buttonSix = new Button("6");
        Button buttonSeven = new Button("7");
        Button buttonEight = new Button("8");
        Button buttonNine = new Button("9");
        Button buttonZero = new Button("0");
        Button buttonCe = new Button("CE");
        Button buttonComma = new Button(",");
        Button buttonEqual = new Button("=");
        Button buttonMultiplication = new Button("*");
        Button buttonDivision = new Button("/");
        Button buttonSubtraction = new Button("-");
        Button buttonAddiction = new Button("+");

        // Relocating all buttons and text files
        txtCurrValues.setPrefSize(220, 30);
        txtCurrValues.relocate(20, 40);

        buttonCe.setPrefSize(50, 50);
        buttonCe.relocate(240, 25);

        buttonOne.setPrefSize(50, 50);
        buttonOne.relocate(20, 80);

        buttonFour.setPrefSize(50, 50);
        buttonFour.relocate(20, 140);

        buttonSeven.setPrefSize(50, 50);
        buttonSeven.relocate(20, 200);

        buttonComma.setPrefSize(50, 50);
        buttonComma.relocate(20, 260);

        buttonTwo.setPrefSize(50, 50);
        buttonTwo.relocate(80, 80);

        buttonFive.setPrefSize(50, 50);
        buttonFive.relocate(80, 140);

        buttonEight.setPrefSize(50, 50);
        buttonEight.relocate(80, 200);

        buttonZero.setPrefSize(50, 50);
        buttonZero.relocate(80, 260);

        buttonThree.setPrefSize(50, 50);
        buttonThree.relocate(140, 80);

        buttonSix.setPrefSize(50, 50);
        buttonSix.relocate(140, 140);

        buttonNine.setPrefSize(50, 50);
        buttonNine.relocate(140, 200);

        buttonEqual.setPrefSize(50, 50);
        buttonEqual.relocate(140, 260);

        buttonAddiction.setPrefSize(50, 50);
        buttonAddiction.relocate(200, 80);

        buttonSubtraction.setPrefSize(50, 50);
        buttonSubtraction.relocate(200, 140);

        buttonMultiplication.setPrefSize(50, 50);
        buttonMultiplication.relocate(200, 200);

        buttonDivision.setPrefSize(50, 50);
        buttonDivision.relocate(200, 260);

        // Putting all buttons and text field into the panel
        panel.getChildren().addAll(txtCurrValues, buttonCe, buttonOne, buttonFour,
                                   buttonSeven, buttonComma, buttonTwo, buttonFive,
                                   buttonEight, buttonZero, buttonThree, buttonSix,
                                   buttonNine, buttonEqual, buttonAddiction,
                                   buttonSubtraction, buttonMultiplication, buttonDivision);

        primaryStage.setTitle("Calculadora");

        primaryStage.setScene(scn);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
