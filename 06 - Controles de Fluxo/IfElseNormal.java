public class IfElseNormal {
    public static void main(String[] args) {
        int numero = 10;
        String resultado;
 
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }
 
        System.out.println("O número é: " + resultado);
    }
}