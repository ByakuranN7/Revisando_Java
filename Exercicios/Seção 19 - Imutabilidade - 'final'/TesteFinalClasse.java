final class Veiculo {

    public void ligarMotor() {
        System.out.println("Motor ligado");
    }
}

class Carro extends Veiculo { // erro

}

public class TesteFinalClasse{

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        veiculo.ligarMotor();
    }
}