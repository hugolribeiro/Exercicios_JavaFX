package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField txtfield = new TextField();
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();

        gp.setHgap(10.0);
        gp.setVgap(10.0);
        txtfield.setPrefSize(80, 40);
//        root.setTop(txtfield);
//        txtfield.setPrefWidth(105);
//        txtfield.setPrefHeight(35);
//        gp.add(txtfield, 0, 0);

        Button buttonCE = new Button("CE");
        setButtonSize(buttonCE);
        gp.add(buttonCE, 0, 4);

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
        Button buttonComma = new Button(".");
        Button buttonDiv = new Button("/");
        Button buttonMul = new Button("*");
        Button buttonSub = new Button("-");
        Button buttonAdd = new Button("+");
        Button buttonEqual = new Button("=");
        setButtonSize(buttonOne);
        setButtonSize(buttonTwo);
        setButtonSize(buttonThree);
        setButtonSize(buttonFour);
        setButtonSize(buttonFive);
        setButtonSize(buttonSix);
        setButtonSize(buttonSeven);
        setButtonSize(buttonEight);
        setButtonSize(buttonNine);
        setButtonSize(buttonZero);
        setButtonSize(buttonComma);
        setButtonSize(buttonDiv);
        setButtonSize(buttonMul);
        setButtonSize(buttonSub);
        setButtonSize(buttonAdd);
        setButtonSize(buttonEqual);

        gp.add(buttonOne, 0, 1);
        gp.add(buttonTwo, 1, 1);
        gp.add(buttonThree, 2, 1);
        gp.add(buttonAdd, 3, 1);

        gp.add(buttonFour, 0, 2);
        gp.add(buttonFive, 1, 2);
        gp.add(buttonSix, 2, 2);
        gp.add(buttonSub, 3, 2);

        gp.add(buttonSeven, 0, 3);
        gp.add(buttonEight, 1, 3);
        gp.add(buttonNine, 2, 3);
        gp.add(buttonMul, 3, 3);

        gp.add(buttonComma, 1, 4);
        gp.add(buttonZero, 2, 4);
        gp.add(buttonEqual, 3, 4);
        gp.add(buttonDiv, 4, 4);

        root.setCenter(gp);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public void setButtonSize(Button button){
        button.setPrefHeight(35.0);
        button.setPrefWidth(35.0);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
