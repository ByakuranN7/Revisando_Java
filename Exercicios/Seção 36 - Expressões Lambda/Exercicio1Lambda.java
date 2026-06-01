import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Exercicio1Lambda{
	public static void main(String[] args){

		Set<Integer> numeros = new HashSet<>(Arrays.asList(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		//n pode utilizar forEach ou você estará modificando o conjunto enquanto tenta percorrer ele, o que causa uma exception
        //numeros.removeIf((Integer elemento) -> elemento % 2 == 0);
        numeros.removeIf(elemento -> elemento % 2 == 0);

        System.out.println("HashSet apenas com numeros impares: " + numeros);
	}
}