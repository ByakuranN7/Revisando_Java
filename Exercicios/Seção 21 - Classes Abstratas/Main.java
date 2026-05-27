abstract class FiguraGeometrica{
	abstract double calcularArea();
	abstract double calcularPerimetro();
}

class Retangulo extends FiguraGeometrica{
	double base;
	double altura;

	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea(){
		return base*altura;
	}

	public double calcularPerimetro(){
		return (2*base) + (2*altura);
	}
	
}

public class Main{
	public static void main(String[] args){

		Retangulo retangulo = new Retangulo(2, 5);

		System.out.println("O calculo da área do retangulo é: " + retangulo.calcularArea());
		System.out.println("O calculo do perímetro do retangulo é: " + retangulo.calcularPerimetro());

	}
}