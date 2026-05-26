interface SerVivo {
    public void respirar(); // método abstrato
}

interface Animal extends SerVivo{
    String DESCRICAO = "Animal é um ser vivo importante!";
    void fazerSom(); // método abstrato
}


class Cachorro implements Animal {
    public void respirar() {}

    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

// Classe Gato que implementa a interface Animal
class Gato implements Animal {
    public void respirar() {}
    public void fazerSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}


public class TestInterface {
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.fazerSom(); // Deve imprimir "O gato faz: Miau Miau!"

        System.out.println("Descricao da interface: " + Animal.DESCRICAO);
    }
}