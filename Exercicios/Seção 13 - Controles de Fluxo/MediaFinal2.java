public class MediaFinal2{
	public static void main(String[] args){

		double nota1 = 10;
		double nota2 = 5.14;
		double frequencia = 76.7;

		double media = (nota1+nota2)/2;

		if(media >= 6 && frequencia >= 75){
			System.out.println("Sua média foi de " + media + "! e sua frequência foi de " + frequencia + "%. Aprovado!");
		}else{
			System.out.println("Sua média foi de " + media + "! e sua frequência foi de " + frequencia + "%. Reprovado!");
		}
	}
}