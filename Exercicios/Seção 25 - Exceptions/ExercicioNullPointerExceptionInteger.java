public class ExercicioNullPointerExceptionInteger{

	public static void main(String[] args){
		try{
			Integer numero = null;
			System.out.println(numero.toString()); 
		}catch (NullPointerException e){
			System.out.println("Erro: " + e.getMessage());
		} finally{
			System.out.println("O programa continua...");
		}
	}
}