import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio2Lambda{
	public static void main(String[] args){

		/*List<String> fruitList = new ArrayList<>();
		fruitList.add("Bergamota");*/
		List<String> fruitList = new ArrayList<>(Arrays.asList(
		"Bergamota", "Laranja", "Uva", "Banana", "Kiwi"));

		System.out.println("Lista completa: " + fruitList);
		fruitList.removeIf(x -> x.length() > 5); //percorre a lista e remove os elementos que possuem mais do que 5 letras.
		System.out.println("Lista após remoção de palavras com mais de 5 letras: " + fruitList);

		fruitList.add(0, "Abacate"); //esse comando não substitui o elemento 0, ele insere na posição 0 e move uma casa todos os outros.
		System.out.println("\nA palavra 'Abacate' foi adicionada ao começo da lista...");

		//fruitList.forEach(y -> System.out.println(y));
		fruitList.forEach(System.out::println); //percorre a lista inteira e printa cada elemento separadamente
	}
}