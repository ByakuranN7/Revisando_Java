/*Importante

O tipo da referência limita o que pode ser acessado.

Exemplo:

Animal a = new Cachorro();

a.fazerSom(); // ok

a.buscarBola(); // erro se existir só em Cachorro
*/

abstract class Animal{ // Superclasse
    public abstract void fazerSom();

    public void tipoObjeto(){

    }
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


public class TestePolimorfismo {

    public static void main(String[] args) {

        // Criando objetos polimórficos 

        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom();
        meuGato.fazerSom();

        meuCachorro.tipoObjeto();
        meuGato.tipoObjeto();

    }
}