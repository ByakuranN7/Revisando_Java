class Calculadora {

    public final int somar(int a, int b) {
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora {

    @Override
    public int somar(int a, int b) { // erro
        return a + b;
    }
}

public class TesteFinalMetodo {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(5, 5));
    }
}