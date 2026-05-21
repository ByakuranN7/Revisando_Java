public class MediaFinal{
	public static void main(String[] args){

		double nota1 = 10;
		double nota2 = 5.14;

		double media = (nota1+nota2)/2;

		if(media >= 6){
			System.out.println("Sua média foi de " + media + "! Aprovado!");
		}else{
			System.out.println("Sua média foi de " + media + "! Reprovado.");
		}
	}
}