
@FunctionalInterface
interface Calculadora {
    double calcular(double a, double b);
}

public class CalculadoraComInterfaceFuncional {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        System.out.println("Soma: " + soma.calcular(10, 5));

        Calculadora subtracao = (a, b) -> a - b;
        System.out.println("Subtração: " + subtracao.calcular(10, 5));

        Calculadora multiplicacao = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.calcular(10, 5));

        Calculadora divisao = (a, b) -> a / b;
        System.out.println("Divisão: " + divisao.calcular(10, 5));
    }
}