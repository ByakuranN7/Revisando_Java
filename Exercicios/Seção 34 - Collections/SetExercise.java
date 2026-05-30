import java.util.Set;
import java.util.HashSet;

public class SetExercise{
	public static void main(String[] args){
		Set<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(0);
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(2);
		conjuntoNumeros.add(3);
		conjuntoNumeros.add(4);

		System.out.println("O conjunto possui o número 0? " + conjuntoNumeros.contains(0));
		System.out.println("Conjunto impresso: " + conjuntoNumeros);

		conjuntoNumeros.remove(4);

		System.out.println("Conjunto impresso após remover o número 4: " + conjuntoNumeros);
	}
}