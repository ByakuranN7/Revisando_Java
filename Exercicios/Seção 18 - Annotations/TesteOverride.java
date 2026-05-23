class SuperClasse{
	//esse método vai ser sobreescrito na classe filha
	public void imprime(){
		System.out.println("Imprime.");
	}
}


class MinhaClasse extends SuperClasse{
	
	@Override
	public void imprime(){
		System.out.println("Imprime DIFERENTE.");
	}
}

public class TesteOverride{
	public static void main(String[] args){

		MinhaClasse classe = new MinhaClasse();
		classe.imprime();
	}
}