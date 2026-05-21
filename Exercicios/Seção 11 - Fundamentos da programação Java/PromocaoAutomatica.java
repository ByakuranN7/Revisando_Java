//import java.util.Locale; //tava dando erro quando eu digitava com . os double, tipo 2.15. Dentro do código também tem que definir que o local é USA.

public class PromocaoAutomatica{
	public static void main(String[] args){

		byte BYTEbits8 = 10; //-128 a 127
		short SHORTbits16 = 20; //-32768 a 32767
		int INTbits32 = 30; //-2147483648 a 2147483647
		long LONGbits64 = 40L; //-9223372036854775808 a 9223372036854775807

		float FLOATbits32 = 3.5f; //ponto flutuante de aproximadamente ±1.4E-45 a ±3.4028235E38
		double DOUBLEbits64 = 2.5; //ponto flutuante de aproximadamente ±4.9E-324 a ±1.7976931348623157E308

		char CHARbits16 = 'B'; //caracteres únicos, como 'a' ou 'A'. (65535)


		//Exemplo de promoção automática: byte e short são promovidos para int
		int resultadoINT = BYTEbits8 + SHORTbits16;
		System.out.println("O resultado da soma de " + BYTEbits8 + " do tipo byte e " + SHORTbits16 + " do tipo short é: " + resultadoINT + " do tipo int");

		//Exemplo de promoção automática: int para long
		long resultadoLONG = INTbits32 + LONGbits64;
		System.out.println("O resultado da soma de " + INTbits32 + " do tipo int e " + LONGbits64 + " do tipo long é: " + resultadoLONG + " do tipo long");

		//Exemplo de promoção automática: int para float
		float resultadoFLOAT = INTbits32 * FLOATbits32;
		System.out.println("O resultado da multiplicação de " + INTbits32 + " do tipo int e " + FLOATbits32 + " do tipo float é: " + resultadoFLOAT + " do tipo float");

		//Exemplo de promoção automática: int para double
		double resultadoDOUBLE = INTbits32 + DOUBLEbits64;
		System.out.println("O resultado da soma de " + INTbits32 + " do tipo int e " + DOUBLEbits64 + " do tipo double é: " + resultadoDOUBLE + " do tipo double");

		System.out.println("O valor do char é: " + CHARbits16);


	}
}