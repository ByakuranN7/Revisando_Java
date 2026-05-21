public class OperadoresUnitarios{
	public static void main(String[] args){

		int a = 10;
		a++; //Equivale: a = a + 1;
		System.out.println(a);//Saída: 11

		a--; //Equivale: "a = a - 1;"
		System.out.println(a); //Saída: 10

		//Muita ATENÇÃO para a precedencia, pois a++ e ++a podem resultar em valores diferentes

		System.out.println("\nValor de a: " + a);

		int b = a--;
		System.out.println("\nPós-decremento: b = a--;");
		System.out.println("Valor de a = " + a);//valor de a será 9 pois fez 10-1
		System.out.println("Valor de b = " + b);//valor de b será 10, pois pegou o valor de a ANTES da subtração

		a = 10;
		b = --a;

		System.out.println("\nPré-decremento: b = --a;");
		System.out.println("Valor de a = " + a);//valor de a será 9 pois fez 10-1
		System.out.println("Valor de b = " + b);//valor de b será 9, pois pegou o valor de a APÓS a subtração

	}
}