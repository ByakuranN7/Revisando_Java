public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("Valor inicial: " + numero);

        numero += 3;
        System.out.println("Após += 3: " + numero);

        numero -= 2;
        System.out.println("Após -= 2: " + numero);

        numero *= 4;
        System.out.println("Após *= 4: " + numero);

        numero /= 2;
        System.out.println("Após /= 2: " + numero);
    }
}