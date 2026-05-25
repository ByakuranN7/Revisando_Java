public class Main{
	public static void main(String[] args){
		var numero = 10; // inferência int
		int numero2 = numero; //se oq foi inferindo em var numero nao for int, o compilador vai dar erro
							  //é um teste para provar que é int. Mas se mudar para um tipo maior, vai dar certo por conta da promoção automatica

		System.out.println("Valor de numero2 = " + numero2);

	}

}