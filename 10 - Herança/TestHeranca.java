class Animal { 
    public String nome;
    public void fazerSom() { 
        System.out.println("O animal faz um som"); 
    } 
} 


class Cachorro extends Animal { 
    public void fazerSom() { 
        super.fazerSom();
        System.out.println("O cachorro late"); 
    }  
} 


public class TestHeranca {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro ();
        dog.nome = "Rex";
        System.out.println("O nome do animal: " +  dog.nome);
        
        //dog.fazerSom();

    }
}