abstract class Loja{
	public String cnpj;
	public String razaoSocial;
	public boolean aberta; 

	abstract void abrir();
	abstract void fechar();
}

class LojaComercial extends Loja{

	LojaComercial(String cnpj, String razaoSocial, boolean aberta){
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = aberta;
	}

	public void abrir(){
		aberta = true;
		System.out.println("Informações da loja:\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial);
		System.out.println("A loja está aberta.\n");
	}

	public void fechar(){
		aberta = false;
		System.out.println("Informações da loja:\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial);
		System.out.println("A loja está fechada.\n");
	}
	}	

public class Lojas{
	public static void main(String[] args){

		LojaComercial store = new LojaComercial("12.345.678/0001-90", "Umbrella Corporation", false);
		store.abrir();
		store.fechar();
	}
}