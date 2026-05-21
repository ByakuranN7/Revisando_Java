public class LivrosAplicacao{
	public static void main(String[] args){

	Livro livro1 = new Livro();
	Livro livro2 = new Livro("Another", "Yukito Ayatsuji");
	Livro livro3 = new Livro("Jujutsu Kaisen 0", "Gege Akutami", 2017, 45.90);

	livro1.printLivro();
	livro2.printLivro();
	livro3.printLivro();
	}
}