public class FinalVariables{

    final int NUMERO_MAXIMO = 100;

    final String MENSAGEM = "Bem-vindo ao mundo da programação!";

    public void imprimirValoresFinais(){

        System.out.println(NUMERO_MAXIMO);
        System.out.println(MENSAGEM);
    }

    public static void main(String[] args){

        FinalVariables objeto = new FinalVariables();

        objeto.imprimirValoresFinais();

        // objeto.NUMERO_MAXIMO = 200; // erro
        // objeto.MENSAGEM = "Nova mensagem"; // erro
    }
}