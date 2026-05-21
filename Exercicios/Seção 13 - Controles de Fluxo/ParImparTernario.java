import java.util.Scanner;

public class ParImparTernario{
	public static void main(String[] args){

		int numero = 0;
		Scanner inputDoUsuario = new Scanner(System.in);

		System.out.println("\nBem-vindo à ferramenta de classificação: Par-Impar!");
		System.out.println("Digite o número que deseja classificar.");

		numero = inputDoUsuario.nextInt(); 

		System.out.println("\nO número " + numero + (numero % 2 == 0 ? " é par." : " é ímpar."));

		/*
		ou mais legível que seria algo tipo:

		String resultado = (numero % 2 == 0) ? "é par." : "é ímpar.";
		System.out.println("\nO número " + numero + " " + resultado);
		*/
	}
}