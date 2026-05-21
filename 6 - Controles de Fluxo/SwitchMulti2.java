//Exemplo de Switch-case Expession
//jeito moderno de fazer switch-case com opções que realizam a mesma ação

public class SwitchMulti2{
	public static void main(String[] args){

		String dia = "quarta";

		switch(dia){
		    case "segunda", "terca", "quarta", "quinta", "sexta" -> 
		        System.out.println("dia útil");

		    case "sabado", "domingo" -> 
		        System.out.println("fim de semana");

		    default -> 
		        System.out.println("dia inválido");
		}
	}
}