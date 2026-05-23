class MinhaClasse{
	public int calcularSoma(int a, int b){
		return a+b;
	}

	@Deprecated
	public int calcularProduto(int a, int b){
	return a*b; //vai funcionar, apesar de mostrar na tela. Deprecated não bloqueia o código, apenas avisa de sua utilização.
	}
}


public class TesteDeprecated{
	public static void main(String[] args){
	
		MinhaClasse myClass = new MinhaClasse();
		System.out.println("O resultado da soma de 5 + 5 é: " + myClass.calcularSoma(5, 5));
		System.out.println("O resultado do produto de 5 * 5 é: " + myClass.calcularProduto(5, 5));
	}
}