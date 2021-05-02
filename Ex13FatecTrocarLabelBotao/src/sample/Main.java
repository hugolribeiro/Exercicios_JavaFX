// Programmer: Hugo Leça Ribeiro
package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button button = new Button("Clique aqui");
        GridPane gridPane = new GridPane();
        gridPane.setVgap(15);
        gridPane.setHgap(15);
        gridPane.add(button, 18, 12);

        // Criando label
        Label labelTexto = new Label("Texto antigo");
        gridPane.add(labelTexto,17,4);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (labelTexto.getText() == "Texto antigo"){
                    labelTexto.setText("Botão apertado");
                }
            }
        });



        Scene scn = new Scene(gridPane, 600, 275);
        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
