abstract class Animal extends Object{ // Superclasse
    public abstract void fazerSom();
}

class Cachorro extends Animal { // Subclasse Cachorro 
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal { // Subclasse Gato 
    public void fazerSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}


public class TestPolimorfismo {

    public static void main(String[] args) {

        // Criando objetos polimórficos 

        Object meuCachorro = new Cachorro();
        Object meuGato = new Gato();

       // meuCachorro.fazerSom(); // Imprime: O cachorro faz: Au Au! 
        Cachorro objConvertido = (Cachorro) meuCachorro; //Casting Object
        objConvertido.fazerSom();

        ((Cachorro) meuCachorro).fazerSom(); //outra forma de fazer conversão


    }
}