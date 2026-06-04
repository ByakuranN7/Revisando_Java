@FunctionalInterface
interface OperacaoMatematica{
	double executar(double a, double b);
}

public class CalculadoraExercicio{
	public static void main(String[] args){
		
		OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
		System.out.println("A potência de 5 elevado a 2 é: " + potencia.executar(5,2));

		OperacaoMatematica raizQuadrada = (a,b) -> Math.sqrt(a + b);
		System.out.println("A raiz quadrada da soma de dois numeros (8 e 8) é: " + raizQuadrada.executar(8,8));
	}
}