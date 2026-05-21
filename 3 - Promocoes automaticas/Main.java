public class Main{
	public static void main(String[] args){
		byte a = 10;
		int b = a + 5; // o a é promovido para int antes do cálculo
						//se mudar de int para byte nesse cálculo, vai dar erro pq o resultado n cabe em byte

		System.out.println("Valor de a = " + a);

	}
}