abstract class Operacao{
	abstract double calcular(double number1, double number2);
}

class Soma extends Operacao{
	@Override
	public double calcular(double number1, double number2){
		return number1 + number2;
	}
}

class Subtracao extends Operacao{
	@Override
	public double calcular(double number1, double number2){
		return number1 - number2;
	}
}

class Multiplicacao extends Operacao{
	@Override
	public double calcular(double number1, double number2){
		return number1 * number2;
	}
}

class Divisao extends Operacao{
	@Override
	public double calcular(double number1, double number2){
		if(number2!=0){
		return number1 / number2;
		}else{
			System.out.println("ERRO! Não é possivel realizar divisão por 0.");
			return Double.NaN; //NaN = Not-a-Number = erro.
		}
	}
}





public class Calculadora{
	public static void main(String[] args){

		double numero1 = 10;
		double numero2 = 5;

		Operacao soma = new Soma();
		Operacao subtracao = new Subtracao();
		Operacao multiplicacao = new Multiplicacao();
		Operacao divisao = new Divisao();

		System.out.println("\nA soma de " + numero1 + " e " + numero2 + " é: " + soma.calcular(numero1, numero2));
		System.out.println("A subtração de " + numero1 + " e " + numero2 + " é: " + subtracao.calcular(numero1, numero2));
		System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é: " + multiplicacao.calcular(numero1, numero2));
		System.out.println("A divisão de " + numero1 + " e " + numero2 + " é: " + divisao.calcular(numero1, numero2));
	}
}