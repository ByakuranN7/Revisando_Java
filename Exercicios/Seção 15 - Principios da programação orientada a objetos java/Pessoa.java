public class Pessoa{
	
	public String nome;
	private int idade;
	protected String endereco;
	String telefone;

	//construtores
	public Pessoa(){
		nome = "Desconhecido";
		idade = 0;
		endereco = "Desconhecido";
		telefone = "Desconhecido";
	}

	public Pessoa(String nome, int idade, String endereco, String telefone){
		 this.nome = nome;
		 this.idade = idade;
		 this.endereco = endereco;
		 this.telefone = telefone;
	}


	//métodos set e get para idade
	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	//métodos set e get para endereco
	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	//métodos set e get para telefone
	public String getTelefone(){
		return telefone;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

}