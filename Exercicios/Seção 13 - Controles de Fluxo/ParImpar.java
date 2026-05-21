import java.util.Scanner;

public class ParImpar{
	public static void main(String[] args){

		int numero = 0;
		Scanner inputDoUsuario = new Scanner(System.in);

		System.out.println("\nBem-vindo à ferramenta de classificação: Par-Impar!");
		System.out.println("Digite o número que deseja classificar.");

		numero = inputDoUsuario.nextInt(); 

		if(numero % 2 == 0){
			System.out.println("\nO número " + numero + " é par.");
		}else{
			System.out.println("\nO número " + numero + " é ímpar.");
		}
	}
}