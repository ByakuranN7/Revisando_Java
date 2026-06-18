public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Valor inicial: " + numero);

        int resultado = ++numero;
        System.out.println("\nPré-incremento:");
        System.out.println("Resultado da expressão: " + resultado);
        System.out.println("Valor de numero: " + numero);

        resultado = numero++;
        System.out.println("\nPós-incremento:");
        System.out.println("Resultado da expressão: " + resultado);
        System.out.println("Valor de numero: " + numero);

        resultado = --numero;
        System.out.println("\nPré-decremento:");
        System.out.println("Resultado da expressão: " + resultado);
        System.out.println("Valor de numero: " + numero);

        resultado = numero--;
        System.out.println("\nPós-decremento:");
        System.out.println("Resultado da expressão: " + resultado);
        System.out.println("Valor de numero: " + numero);
    }
}