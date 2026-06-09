
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.stage.FileChooser;
import java.io.File;

public class ExemploFileChooser extends Application {

    @Override
    public void start(Stage palco) {
        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");

        Button botaoAbrir = new Button("Abrir Arquivo");
        botaoAbrir.setOnAction( e -> {
            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);
            if (arquivoSelecionado != null) {
                exibirImagem(arquivoSelecionado, palco);
            }
        });

        VBox layout = new VBox(botaoAbrir);
        Scene cena = new Scene(layout, 800, 600);
        palco.setTitle("Testando FileChooser");
        palco.setScene(cena);
        palco.show();
    }

    private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado) {
        Image imagem = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(imagem);

        VBox layout; //a linha abaixo faz com que o layout do método exibirImagem tenha a mesma referencia do layout do método start

        //A linha abaixo obtém o layout atual
        layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

        // A linha abaixo adiciona a imagem ao layout
        layout.getChildren().add(imageView);

        // Ajustar tamanho da imagem
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos");
    }

    public static void main(String[] args) {
        launch(args);
    }
}