//Este exercício envolve a criação de um programa em Java que calcula a soma dos números de 1 a 10 usando um loop for.

public class SomaNumeros{
	public static void main(String[] args){

		int soma = 0;

		for(int i = 1; i<11; i++){
			soma = soma + i;
		}

		System.out.println("A soma de todos os numeros de 1 a 10 é: " + soma);
	}
	
}