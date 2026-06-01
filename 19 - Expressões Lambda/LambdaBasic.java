import java.util.Arrays;
import java.util.List;

public class LambdaBasic{
	public static void main(String[] args){
		List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

		/* sem lambda seria assim o codigo
		for (Integer elemento : listaDeNumeros){
			System.out.println(elemento);
		}
		*/
		listaDeNumeros.forEach( (Integer numero) -> System.out.println(numero) ); //pode remover o 'Integer' dessa linha que vai funcionar ainda assim, pois o compilador sabe que a lista é de Integer
	}
}