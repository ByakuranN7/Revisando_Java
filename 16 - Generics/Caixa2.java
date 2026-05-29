
public class Caixa2<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa) {
        coisaNaCaixa = coisa;
    }

    public T pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        // Criando uma caixa para guardar Strings
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Oi, mundo!");
        String texto = caixaDeTexto.pegar();
        System.out.println(texto);  // Imprime: Oi, mundo!

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        Integer numero = Integer.valueOf(5);
        caixaDeNumero.guardar(numero);
        Integer valorResgatado = caixaDeNumero.pegar();
        System.out.println(valorResgatado);
    }
}