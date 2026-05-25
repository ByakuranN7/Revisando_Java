public class Main3{
	public static void main(String[] args){
		int a = 10;
		double b = 1.5;
		double c = a * b; // o a é promovido para double antes do cálculo
		                  // se mudar o C para int, vai dar erro de tipo incompatível, double é muito maior (64 bits), além de ser decimal
					

		System.out.println("Valor de c = " + c);

	}
}