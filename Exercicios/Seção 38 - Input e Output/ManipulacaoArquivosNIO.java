import java.nio.file.*;
import java.io.IOException;

public class ManipulacaoArquivosNIO {

    static void escreverNoArquivo (Path pathArquivo, String conteudo) throws IOException {
         // Escrevendo em um arquivo
            Files.write(pathArquivo, conteudo.getBytes());
    }

    static void lerDoArquivo (Path pathArquivo) throws IOException {
            // Lendo de um arquivo
            byte[] conteudoArquivo = Files.readAllBytes(pathArquivo);
            String content = new String(conteudoArquivo);
            System.out.println(content);
    }



    public static void main(String[] args) {

        Path pathArquivo = Paths.get("E:\\Revisando_Java\\Exercicios\\Seção 38 - Input e Output\\meuArquivoNIO.txt");
        String conteudo = "Olá, mundo!";

        try {
            escreverNoArquivo(pathArquivo, conteudo);
            lerDoArquivo(pathArquivo);
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
        
    }
}