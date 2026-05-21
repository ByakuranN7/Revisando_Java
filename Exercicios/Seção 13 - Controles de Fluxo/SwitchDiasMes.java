//Número de Dias no Mês: Se mes for "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" ou "Dezembro", o número de dias é 31.
//Se mes for "Abril", "Junho", "Setembro" ou "Novembro", o número de dias é 30.
//Se mes for "Fevereiro", o número de dias é 28 (considerando um ano não bissexto).

public class SwitchDiasMes{
	public static void main(String[] args){

		String mes = "fevereiro";

		switch(mes){
		    case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 
		        System.out.println("O mês de " + mes + " possui 31 dias.");

		    case "Abril", "Junho", "Setembro", "Novembro" -> 
		        System.out.println("O mês de " + mes + " possui 30 dias.");

		    case "Fevereiro" -> 
		        System.out.println("O mês de " + mes + " possui 28 dias (considerando um ano não bissexto.");

		    default -> 
		        System.out.println("mês inválido, cheque a grafia");
		}
	}
}