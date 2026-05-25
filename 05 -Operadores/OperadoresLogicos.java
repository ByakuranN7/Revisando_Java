public class OperadoresLogicos{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		boolean c = true;

		System.out.println(a < b && c); //operador "E", ambos tem que ser true para resultado=true
		System.out.println(a > b || c); //operador "OU", um deles tem que ser true resultado=true
		System.out.println(!c); //NÃO lógico, inverte
	}
}