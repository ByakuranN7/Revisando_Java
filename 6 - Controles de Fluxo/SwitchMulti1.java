//Exemplo de Switch-case Expession
//jeito clássico de fazer switch-case com opções que realizam a mesma ação

public class SwitchMulti1{
	public static void main(String[] args){

		String dia = "quarta";

		switch(dia){
		    case "segunda":
		    case "terca":
		    case "quarta":
		    case "quinta":
		    case "sexta":
		        System.out.println("dia útil");
		        break;

		    case "sabado":
		    case "domingo":
		        System.out.println("fim de semana");
		        break;

		    default:
		        System.out.println("dia inválido");
		}
	}
}