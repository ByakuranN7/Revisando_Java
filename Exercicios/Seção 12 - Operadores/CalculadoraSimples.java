import java.util.Scanner;


public class CalculadoraSimples{
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		int escolhaDoUsuario = 0;
		int[] numeros; //utilizado no método para pedir os dois operadores

		Scanner inputDoUsuario = new Scanner(System.in); //Criando o objeto que lê e armazena a info do teclado

		while(escolhaDoUsuario!=6){
			System.out.println("\nBem-vindo a calculadora simples, selecione qual operação deseja realizar:");
			System.out.println("1 - Soma de dois números");
			System.out.println("2 - Subtração de dois números");
			System.out.println("3 - Multiplicação de dois números");
			System.out.println("4 - Divisão de dois números");
			System.out.println("5 - Resto da divisão (módulo) de dois números");
			System.out.println("6 - Sair");
			escolhaDoUsuario = inputDoUsuario.nextInt();

			//poderia botar um if pedindo os valores antes de entrar no switch, mas modularidade é mais importante

			switch(escolhaDoUsuario){
				case 1:
					numeros = lerOperadores(inputDoUsuario);
    				a = numeros[0];
    				b = numeros[1];
					System.out.println("\nO resultado de " + a + " + " + b + " é " + (a+b));
					break;

				case 2:
					numeros = lerOperadores(inputDoUsuario);
    				a = numeros[0];
    				b = numeros[1];
					System.out.println("\nO resultado de " + a + " - " + b + " é " + (a-b));
					break;

				case 3:
					numeros = lerOperadores(inputDoUsuario);
    				a = numeros[0];
    				b = numeros[1];
					System.out.println("\nO resultado de " + a + " * " + b + " é " + (a*b));
					break;

				case 4:
					numeros = lerOperadores(inputDoUsuario);
    				a = numeros[0];
    				b = numeros[1];
					if(b!=0){
					System.out.println("\nO resultado de " + a + " / " + b + " é " + ((double) a / b));
					}else{
						System.out.println("\nErro: não é possível dividir por 0");
					}
					break;

				case 5:
					numeros = lerOperadores(inputDoUsuario);
    				a = numeros[0];
    				b = numeros[1];
					System.out.println("\nO resultado do resto da divisão (módulo) de " + a + " % " + b + " é " + (a%b));
					break;

				case 6:
					System.out.println("\nEncerrando aplicação...");
					inputDoUsuario.close();
					break;

				default:
					System.out.println("\nOpção inválida");
					
			}
		}
	}


	static int[] lerOperadores(Scanner input) {
	//criei um método ao invés de separar em arquivos, já que é um projeto pequeno
    System.out.println("\nDigite o valor do primeiro número:");
    int a = input.nextInt();

    System.out.println("\nDigite o valor do segundo número:");
    int b = input.nextInt();

    return new int[]{a, b};
	}


}