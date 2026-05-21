//Exemplo de Switch-case Inicialization

public class SwitchInicialization{
	public static void main(String[] args){

		String dia = "Terça";

		String tipoDeDia = switch(dia){
			case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia Util";
			case "Sábado", "Domingo" -> "Fim de semana";
			default -> "Erro: Dia desconhecido, cheque a grafia";
		};

		System.out.println(tipoDeDia);
	}
}