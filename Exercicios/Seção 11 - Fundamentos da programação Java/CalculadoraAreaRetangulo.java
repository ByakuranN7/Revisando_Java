import java.util.Scanner;
import java.util.Locale; //tava dando erro quando eu digitava com . os double, tipo 2.15cm. Dentro do código também tem que definir que o local é USA.

public class CalculadoraAreaRetangulo{
	public static void main(String[] args){

		double largura, altura;

		Scanner inputUsuario = new Scanner(System.in); //Criando o objeto que lê e armazena a info do teclado
		inputUsuario.useLocale(Locale.US);

		int escolhaUsuario = 0;

		while(escolhaUsuario != 2){
			System.out.println("\n\nDeseja realizar o cálculo da área de um retângulo?");
			System.out.println("Digite 1 para calcular");
			System.out.println("Digite 2 para sair");
			escolhaUsuario = inputUsuario.nextInt();

			if(escolhaUsuario==1){
				System.out.println("Digite a largura do retângulo em cm:");
				largura = inputUsuario.nextDouble();
				System.out.println("Digite a altura do retângulo em cm:");
				altura = inputUsuario.nextDouble();
				System.out.println("\nA área de um retângulo de " + largura + "cm de largura e " + altura + "cm de altura é: " + (altura*largura));
			}
			else if(escolhaUsuario != 2){
				System.out.println("Comando inválido");
			}
		}

		inputUsuario.close();
	}
}