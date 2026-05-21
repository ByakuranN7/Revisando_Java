public class AplicacaoPessoa{
	public static void main(String[] args){

	Pessoa pessoa1 = new Pessoa();

	pessoa1.nome = "Eren Yeager";
	pessoa1.setIdade(19);
	pessoa1.setEndereco("Casa da Família Yeager, Distrito de Shiganshina, Extremidade Sul da Muralha Maria, Ilha Paradis");
	pessoa1.setTelefone("+99 (99) 9999999999");

	System.out.println("\nA pessoa se chama: " + pessoa1.nome);
	System.out.println("\nA idade é: " + pessoa1.getIdade());
	System.out.println("\nO endereço é: " + pessoa1.getEndereco());
	System.out.println("\nO telefone é: " + pessoa1.getTelefone());
	}
}