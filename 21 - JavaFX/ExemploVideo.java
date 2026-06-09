import java.io.File;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideo extends Application {

    @Override
    public void start(Stage palcoPrincipal) {

        File arquivo = new File("Happy-Feet-2.mp4");

        Media media = new Media(arquivo.toURI().toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        HBox hbox = new HBox();
        hbox.getChildren().add(mediaView);

        Scene scene = new Scene(hbox, 800, 600);

        palcoPrincipal.setTitle("Exemplo de Vídeo");
        palcoPrincipal.setScene(scene);
        palcoPrincipal.show();

        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// O construtor de Media espera uma URI válida.
// Por isso usamos:
// arquivo.toURI().toString()
//
// Apenas passar:
// "Happy-Feet-2.mp4"
// gera erro.

//Podemos utilizar na forma de URL como: "file:///E:/Revisando_Java/21%20-%20JavaFX/Happy-Feet-2.mp4" mas se mudar o projeto de pasta, daria erro