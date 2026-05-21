//Escrever um programa Java que calcule a soma de todos os números inteiros positivos menores ou iguais a esse número utilizando while.

import java.util.Scanner;

public class SomaWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= numero) {
            soma += i; // soma = soma + i
            i++;
        }

        System.out.println("A soma de 1 até " + numero + " é: " + soma);
    }
}