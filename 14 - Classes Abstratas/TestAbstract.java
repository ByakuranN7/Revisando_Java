abstract class Carro {
	int codigo = 10;

	Carro (int cod) {
		codigo = cod;
	}

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando...");
    }
}

class Caminhao extends Carro {
	Caminhao (int codigo) {
		super (codigo);
	}

    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente...");
    }
}

public class TestAbstract {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(1000);
		System.out.println("Codigo " + caminhao.codigo);
    }
}