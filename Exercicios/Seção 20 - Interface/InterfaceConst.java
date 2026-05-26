interface Produto{
	String getNome();
	int getQuantidade();
	void adicionarQuantidade(int quantidade);
	void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto{

	private String nome;
	private int quantidade;
	
	ProdutoImpl(String nome, int quantidade){
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public void adicionarQuantidade(int quantidade){
		System.out.println("Adicionando " + quantidade + " unidades à quantidade em estoque de " + this.quantidade);
		this.quantidade += quantidade;
	}

	public void removerQuantidade(int quantidade){
		if(this.quantidade>quantidade){
			System.out.println("Removendo " + quantidade + " unidades à quantidade em estoque de " + this.quantidade);
			this.quantidade -= quantidade;
		}else{
			System.out.println("Não é possível remover " + quantidade + ", pois possuimos apenas " + this.quantidade + " em estoque.");
		}
	}

	public String getNome(){
		return nome;
	}

	public int getQuantidade(){
		return quantidade;
	}
}



public class InterfaceConst{
	public static void main(String[] args){

		ProdutoImpl product = new ProdutoImpl("Persona 5 Royal", 10);
		System.out.println("O nome do produto é: " + product.getNome());
		System.out.println("A quantia em estoque é: " + product.getQuantidade());

		product.adicionarQuantidade(20);
		System.out.println("A nova quantia em estoque é: " + product.getQuantidade());
		product.removerQuantidade(5);
		System.out.println("A nova quantia em estoque é: " + product.getQuantidade());

	}
}

