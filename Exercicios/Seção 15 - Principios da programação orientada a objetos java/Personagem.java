public class Personagem{
	private String nome;
	private int nivelDePoder;

	public Personagem(String nome, int nivelDePoder){
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;	
	}

	public void aumentarNivelPoder(int poderAtual){
	nivelDePoder = poderAtual+10;
	}

	public void mudarNome(Personagem personagem, String newName){
		personagem.nome = newName;
	}

	public void mostrarDadosPersonagem(){
		System.out.println("\n\nO nome do personagem é: " + nome + " e seu nível de poder é " + nivelDePoder);
	}
}