class Caixa<T>{
	private T[] elementos;

	Caixa(int capacidade){
		elementos = (T[]) new Object[capacidade];
	}

	public void adicionar(T elemento, int indice){
		elementos[indice] = elemento;
	}

	public T obter(int indice){
	return elementos[indice];
	}
}


public class ExercicioDois{
	public static void main(String[] args){

		Caixa<Double> caixaDePrecos = new Caixa<>(10);
			for(int i=0; i<10; i++){
				caixaDePrecos.adicionar((double) i, i);
			}

			for(int j=0; j<10; j++){
				System.out.println("O preço salvo na posição " + j + " é: " +caixaDePrecos.obter(j));
			}


		Caixa<Character> caixaDeLetras = new Caixa<>(2);
			caixaDeLetras.adicionar('O', 0);
			caixaDeLetras.adicionar('i', 1);
			System.out.println("A letra salva na posição 0 é " + caixaDeLetras.obter(0) + " enquanto que a letra salva na posição 1 é " + caixaDeLetras.obter(1) + " ou seja: " + caixaDeLetras.obter(0) + caixaDeLetras.obter(1));
	}
}