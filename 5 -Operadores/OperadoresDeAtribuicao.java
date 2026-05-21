public class OperadoresDeAtribuicao{
	public static void main(String[] args){

		int a = 10;

		a += 2; //Equivale a: "a = a + 2;"
		System.out.println(a); //Saída: 12

		a -= 2; //Equivale a: "a = a - 2;"
		System.out.println(a); //Saída: 10 (12-2)

		a *= 2; //Equivale a: "a = a * 2;"
		System.out.println(a); //Saída: 20 (10*2)

		a /= 2; //Equivale a: "a = a / 2;"
		System.out.println(a); //Saída: 10 (20/2)

		a %= 2; //Equivale a: "a = a % 2;"
		System.out.println(a); //Saída: 0 (10 % 2, o resto é 0 pois divisão perfeita)

	}
}