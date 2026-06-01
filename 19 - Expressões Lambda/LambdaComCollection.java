
import java.util.Arrays;
import java.util.*;

public class LambdaComCollection {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 100);
        List<Integer> numerosPares = new ArrayList<>();

        int i = 10;


        listaDeNumeros.forEach( (Integer numero) -> {
            int y = 200;
            y++;
            System.out.println("Valor de Y: " + y);
            
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
            
        } );

        System.out.println("Numeros pares: " + numerosPares);
    }
}