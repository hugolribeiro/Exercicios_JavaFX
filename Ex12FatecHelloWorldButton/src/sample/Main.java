package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    class ManipuladorMouse implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            System.out.println("Hello World");
        }
    }

    @Override
    public void start(Stage stage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button button = new Button("Clique aqui");
        GridPane gridPane = new GridPane();
        gridPane.setVgap(15);
        gridPane.setHgap(15);
        gridPane.add(button, 18, 12);
        EventHandler<ActionEvent> manipulador = new ManipuladorMouse();
        stage.addEventFilter(ActionEvent.ACTION, manipulador);
        Scene scn = new Scene(gridPane, 600, 275);
        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
