//O exercício pede para preencher 1000 espaços de um array com numeros de 1 até 1000 e calcular a soma.
//Obivamente tem formas muito mais simples e rápidas de se fazer isso, mas é um exercicio focado em arrays então segui o que foi pedido.

public class SomaNumeros{
	public static void main(String[] args){

		int[] arrayAteMil;
		int resultadoFinal = 0;

		arrayAteMil = new int[1000];

		for(int i = 0; i<arrayAteMil.length; i++){
			arrayAteMil[i] = i+1;
		}

		for(int j = 0; j<arrayAteMil.length; j++){
			resultadoFinal += arrayAteMil[j];
		}

		System.out.println("O resultado final da soma de todos os número de 1 até 1000 é: " + resultadoFinal);
	}
}


/*
Versão simples

public class SomaNumeros {
    public static void main(String[] args) {

        int soma = (1000 * 1001) / 2;

        System.out.println(soma);
    }
}
*/