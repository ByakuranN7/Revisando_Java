
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExemploControles extends Application {

    @Override
    public void start(Stage palco) {
        Label label = new Label("Olá, mundo! Sou uma etiqueta (label).");
        label.setStyle("-fx-background-color: blue; -fx-text-fill: pink;   -fx-font-family: 'Arial'; -fx-font-size: 14px; -fx-font-style: italic; -fx-font-weight: bold;");
        //label.setStyle("-fx-background-color: blue; -fx-text-fill: pink;");
        
        Button botao = new Button("Clique aqui");
        botao.setStyle("-fx-background-color: rgba(255, 0, 0, 0.5); -fx-text-fill: white;  -fx-font-family: 'Verdana'; -fx-font-size: 12px;");
        //botao.setStyle("-fx-background-color: rgba(255, 0, 0, 0.5); -fx-text-fill: white;");

        TextField campoTexto = new TextField();
        campoTexto.setStyle("-fx-background-color: green; -fx-text-fill: red;  -fx-font-family: 'Courier New'; -fx-font-size: 16px;");
        //campoTexto.setStyle("-fx-background-color: green; -fx-text-fill: red;");

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}