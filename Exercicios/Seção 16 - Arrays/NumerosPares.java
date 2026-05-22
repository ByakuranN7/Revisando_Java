import java.util.Scanner;

public class NumerosPares{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numerosPares = new int[10];

        int contador = 0;

        while (contador < numerosPares.length){

            System.out.print("Digite um número par inteiro: ");

            // Verifica se o usuário digitou um inteiro
            if (scanner.hasNextInt()){

                int numero = scanner.nextInt();

                // Verifica se o número é par
                if (numero % 2 == 0){

                    numerosPares[contador] = numero;

                    System.out.println("Número par armazenado na posição " + contador);

                    contador++;

                }else{

                    System.out.println("Erro: o número digitado é ímpar.");
                }

            }else{

                // Captura entrada inválida
                System.out.println("Erro: você deve digitar um número inteiro.");

                scanner.next(); // Limpa a entrada inválida
            }

            System.out.println();
        }

        System.out.println("Array completo:");

        for (int i = 0; i < numerosPares.length; i++){

            System.out.println("Posição " + i + ": " + numerosPares[i]);
        }

        scanner.close();
    }
}