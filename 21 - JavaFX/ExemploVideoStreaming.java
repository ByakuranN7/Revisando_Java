// Observação:
// O WebView consegue carregar páginas do YouTube e outros sites de vídeo,
// porém alguns conteúdos podem apresentar avisos, erros de compatibilidade
// ou limitações de reprodução devido às tecnologias web suportadas pela
// versão do JavaFX WebView.
//
// Em aplicações reais, geralmente é recomendado utilizar APIs oficiais
// dos serviços de streaming (quando disponíveis) ou bibliotecas específicas
// para reprodução de mídia, pois elas costumam oferecer maior compatibilidade,
// estabilidade e controle sobre a reprodução do conteúdo.
//
// Este exemplo tem apenas fins de estudo do componente WebView.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.web.WebView;

public class ExemploVideoStreaming extends Application {
    
    @Override
    public void start(Stage palco) {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo de Vídeo de Streaming");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}