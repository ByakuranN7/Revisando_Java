import java.io.*;

public class ManipulacaoArquivos {

    static void escreverNoArquivo (String pathArquivo, String conteudo) throws IOException {
         // Escrevendo em um arquivo
            FileWriter writer = new FileWriter(pathArquivo);

            writer.write(conteudo); // Grava os Dados

            writer.close();
    }

    static void lerDoArquivo (String pathArquivo) throws IOException {
            // Lendo de um arquivo
            FileReader reader = new FileReader(pathArquivo);

            int data = reader.read();

            while (data != -1) {

                System.out.print((char)data); // Casting
                //System.out.println(data); // No casting

                data = reader.read();
            }

            reader.close();
    }



    public static void main(String[] args) {

        String pathArquivo = "E:\\Revisando_Java\\Exercicios\\Seção 38 - Input e Output\\meuArquivo.txt";
        String conteudo = "Olá, mundo!";

        try {
            escreverNoArquivo(pathArquivo, conteudo);
            lerDoArquivo(pathArquivo);
        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }

    }
}