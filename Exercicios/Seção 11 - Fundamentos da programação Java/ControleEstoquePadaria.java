import java.util.Scanner;

public class ControleEstoquePadaria{
	public static void main(String[] args){

		Scanner inputDoUsuario = new Scanner(System.in); //Criando o objeto que lê e armazena a info do teclado

		int quantidadeFarinha = 10;
		int quantidadeAcucar = 10;

		int escolhaDoUsuario = 0; //variavel que armazena a opção que o usuario escolheu

		while(escolhaDoUsuario != 3){

			System.out.println("\n--- ESTOQUE ---");
			System.out.println("Farinha: " + quantidadeFarinha);
			System.out.println("Açúcar: " + quantidadeAcucar);

			System.out.println("\nDigite 1 para alterar a quantia de farinha");
			System.out.println("Digite 2 para alterar a quantia de açúcar");
			System.out.println("Digite 3 para sair");

			escolhaDoUsuario = inputDoUsuario.nextInt();

			switch(escolhaDoUsuario){
				case 1:
					System.out.println("Digite a nova quantidade de farinha:");
					quantidadeFarinha = inputDoUsuario.nextInt();
					break;

				case 2:
					System.out.println("Digite a nova quantidade de açúcar:");
					quantidadeAcucar = inputDoUsuario.nextInt();
					break;

				case 3:
					System.out.println("Encerrando...");
					break;

				default:
					System.out.println("Opção inválida.");
			}
		}

		inputDoUsuario.close();
		System.out.println("\n\n--- ESTOQUE ---");
		System.out.println("Farinha: " + quantidadeFarinha);
		System.out.println("Açúcar: " + quantidadeAcucar);
		System.out.println("Tenha um bom dia!");
	}
}