public class ExemploObjetoNulo{
	public static void main(String[] args){

		String nome = null;

		try {
		int tamanhoNome = nome.lenght();
		System.out.println("Tamanho do nome: " + tamanhoNome);

		} catch (NullPointerException e) {
			System.out.println("Erro: A variável 'nome' possui valor nulo.");
		
		} finally {
			System.out.println("Essa linha sempre é executada.");
		}
	}
}