/*
O operador ternário (ternary) é uma forma concisa de escrever uma instrução if-else em uma única linha. Ele é útil para simplificar expressões condicionais curtas.

condição ? valorSeVerdadeiro : valorSeFalso;

*/


public class OperadorTernario {
    public static void main(String[] args) {
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
 
        System.out.println("O número é: " + resultado);
    }
}