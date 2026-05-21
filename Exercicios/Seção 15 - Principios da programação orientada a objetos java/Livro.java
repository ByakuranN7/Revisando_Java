public class Livro{
	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco;

	public Livro(){
		titulo = "Desconhecido";
		autor = "Desconhecido";
		anoPublicacao = 0;
		preco = 0.0;
	}

	public Livro(String tituloLivro, String autorLivro){
		titulo = tituloLivro;
		autor = autorLivro;
		anoPublicacao = 0;
		preco = 0.0;
	}

	public Livro(String tituloLivro, String autorLivro, int ano, double precoLivro){
		titulo = tituloLivro;
		autor = autorLivro;
		anoPublicacao = ano;
		preco = precoLivro;
	}

	public void printLivro(){
		System.out.println("\nTítulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao + ", Preço: " + preco);
	}
}