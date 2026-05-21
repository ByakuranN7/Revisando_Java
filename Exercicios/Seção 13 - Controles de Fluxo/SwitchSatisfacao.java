//O objetivo deste exercício é criar um programa em Java que, com base em um número fornecido pelo usuário (representando o nível de satisfação), determine e exiba o feedback correspondente.

import java.util.Scanner;

public class SwitchSatisfacao{
	public static void main(String[] args){
		int numero=0;
		Scanner inputDoUsuario = new Scanner(System.in);
		
		do{
		System.out.println("\n**Pesquisa de safistação**");
		System.out.println("Por favor, digite seu nível de satisfação com o serviço prestado (de 1 a 5, com 1 sendo muito insatisfeito e 5 sendo muito satisfeito):");

		numero = inputDoUsuario.nextInt();

			switch(numero){
				case 1 -> System.out.println("Seu feedback foi: " + numero + " - Muito insatisfeito");
				case 2 -> System.out.println("Seu feedback foi: " + numero + " - Insatisfeito");
				case 3 -> System.out.println("Seu feedback foi: " + numero + " - Neutro");
				case 4 -> System.out.println("Seu feedback foi: " + numero + " - Satisfeito");
				case 5 -> System.out.println("Seu feedback foi: " + numero + " - Muito Satisfeito");
				default -> System.out.println("Seu feedback foi: " + numero + " - Opção inválida (deve estar entre 1 e 5)");
			}

		}while(numero < 1 || numero > 5);
	}
}