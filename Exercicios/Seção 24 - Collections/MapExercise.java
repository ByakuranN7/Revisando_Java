import java.util.Map;
import java.util.HashMap;

public class MapExercise{
	public static void main(String[] args){

		Map<String, Integer> estoqueProdutos = new HashMap<>(); // string = codigo, integer = quantidade

		estoqueProdutos.put("Path of Exile 2", 25);
		estoqueProdutos.put("Persona 3: Reload", 10);
		estoqueProdutos.put("Baldur's Gate 3", 5);
		estoqueProdutos.put("Resident Evil Requiem", 12);

		System.out.println("O produto 'Persona 3: Reload' possui: " + estoqueProdutos.get("Persona 3: Reload") + " unidades em estoque.\n");
		System.out.println("Conjunto Map completo:" + estoqueProdutos);
		System.out.println("\nTentando remover 10 unidades de 'Path of Exile 2':");

		if(estoqueProdutos.get("Path of Exile 2") < 10){
			System.out.println("Não é possível remover 10 unidades, pois o produto possui apenas " + estoqueProdutos.get("Path of Exile 2"));
		}else{
			estoqueProdutos.put("Path of Exile 2", estoqueProdutos.get("Path of Exile 2") - 10);
			System.out.println("O produto 'Path of Exile 2' possui: " + estoqueProdutos.get("Path of Exile 2") + " unidades em estoque.");
		}


	}
}