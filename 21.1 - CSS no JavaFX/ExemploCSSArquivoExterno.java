//Esse código utiliza o "ExemploControles.java" como base,
//mas refaz ele de uma forma que utilize CSS em um arquivo separado.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;

public class ExemploCSSArquivoExterno extends Application {

    @Override
    public void start(Stage palco) {
        Label label = new Label("Olá, mundo! Sou uma etiqueta (label).");
        label.getStyleClass().add("etiqueta");

        Button botao = new Button("Clique aqui");
        botao.getStyleClass().add("botao");

        TextField campoTexto = new TextField();
        campoTexto.getStyleClass().add("campoTexto");

        VBox layout = new VBox(label, botao, campoTexto);

        Scene cena = new Scene(layout, 300, 200);
        cena.getStylesheets().add(new File("styles.css").toURI().toString());

        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}