//Exemplo de Switch-case Expession
//jeito clássico de fazer switch-case

public class SwitchCase1{
	public static void main(String[] args){

		int dia = 3;

		switch (dia){

		case 1:
			System.out.println("Segunda-Feira.");
			break;

		case 2:
			System.out.println("Terça-Feira.");
			break;

		case 3:
			System.out.println("Quarta-Feira.");
			break;

		case 4:
			System.out.println("Quinta-Feira.");
			break;

		case 5:
			System.out.println("Sexta-Feira.");
			break;

		case 6:
			System.out.println("Sábado.");
			break;

		case 7:
			System.out.println("Domingo.");
			break;

		default:
			System.out.println("Erro: Dia inválido.");

		}
	}
}