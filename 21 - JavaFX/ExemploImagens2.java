
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ExemploImagens2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {
        // Caminho absoluto para a imagem no Windows
        String caminhoImagem = "cachorro-correndo.gif";

        Image imagem = new Image(caminhoImagem);
        ImageView imageView = new ImageView(imagem);

        // Configuração para ajustar o tamanho da imagem
        imageView.setFitWidth(376); // largura desejada em pixels
        imageView.setFitHeight(282); // altura desejada em pixels
        imageView.setPreserveRatio(true); // Mantém a proporção original da imagem

        VBox layout = new VBox(imageView);
        Scene cena = new Scene(layout, 400, 400);

        palco.setScene(cena);
        palco.show();
    }
}