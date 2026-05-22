class Animal{
	public void fazerSom(){
		System.out.println("O animal faz um som.");
	}
}

class Cachorro extends Animal{
	public void fazerSom(){
		System.out.println("O cachorro Late.");
	}
}

public class testOverrideHeranca{
	public static void main(String[] args){
		Cachorro dog = new Cachorro();

		dog.fazerSom();
	}
}
