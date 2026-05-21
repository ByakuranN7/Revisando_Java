import java.util.Scanner;
import java.util.Locale; //tava dando erro quando eu digitava com . os double, tipo 2.15. Dentro do código também tem que definir que o local é USA.

public class CalculadoraAreaRetanguloVER2{
	public static void main(String[] args){

		double largura, altura;

		Scanner inputUsuario = new Scanner(System.in); //Criando o objeto que lê e armazena a info do teclado
		inputUsuario.useLocale(Locale.US); //definindo que é pra usar . e não , nos numeros decimais

		int escolhaUsuario = 0;

		while(escolhaUsuario != 2){
			System.out.println("\n\nDeseja realizar o cálculo da área de um retângulo?");
			System.out.println("Digite 1 para calcular");
			System.out.println("Digite 2 para sair");
			escolhaUsuario = inputUsuario.nextInt();

			if(escolhaUsuario==1){
				System.out.println("Digite a largura do retângulo em cm:");

				String entradaLargura = inputUsuario.next();//pegando primeiro como string para mudar a , para . caso o usuario tenha utilizado ,
				entradaLargura = entradaLargura.replace(",", ".");
				largura = Double.parseDouble(entradaLargura);

				System.out.println("Digite a altura do retângulo em cm:");

				String entradaAltura = inputUsuario.next(); //pegando primeiro como string para mudar a , para . caso o usuario tenha utilizado ,
				entradaAltura = entradaAltura.replace(",", ".");
				altura = Double.parseDouble(entradaAltura);

				System.out.println("\nA área de um retângulo de " + largura + "cm de largura e " + altura + "cm de altura é: " + (altura*largura) + "cm²");
			}
			else if(escolhaUsuario != 2){
				System.out.println("Comando inválido");
			}
		}

		inputUsuario.close();
	}
}