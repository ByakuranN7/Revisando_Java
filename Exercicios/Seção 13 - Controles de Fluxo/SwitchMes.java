//Criar um programa em Java que verifica o valor de uma variável representando um mês do ano e exibe o nome desse mês.

import java.util.Scanner;

public class SwitchMes{
	public static void main(String[] args){
		int numeroMes=0;
		Scanner inputDoUsuario = new Scanner(System.in);
		
		do{
		System.out.println("\nDigite um valor entre 1 e 12 para saber o mês correspondente:");

		numeroMes = inputDoUsuario.nextInt();

			switch(numeroMes){
				case 1 -> System.out.println("O mês de número " + numeroMes + " é Janeiro.");
				case 2 -> System.out.println("O mês de número " + numeroMes + " é Fevereiro.");
				case 3 -> System.out.println("O mês de número " + numeroMes + " é Março.");
				case 4 -> System.out.println("O mês de número " + numeroMes + " é Abril.");
				case 5 -> System.out.println("O mês de número " + numeroMes + " é Maio.");
				case 6 -> System.out.println("O mês de número " + numeroMes + " é Junho.");
				case 7 -> System.out.println("O mês de número " + numeroMes + " é Julho.");
				case 8 -> System.out.println("O mês de número " + numeroMes + " é Agosto.");
				case 9 -> System.out.println("O mês de número " + numeroMes + " é Setembro.");
				case 10 -> System.out.println("O mês de número " + numeroMes + " é Outubro.");
				case 11 -> System.out.println("O mês de número " + numeroMes + " é Novembro.");
				case 12 -> System.out.println("O mês de número " + numeroMes + " é Dezembro.");
				default -> System.out.println("O mês de número " + numeroMes + " não existe, digite outro valor.");
			}

		}while(numeroMes < 1 || numeroMes > 12);
	}
}