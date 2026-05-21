public class Carro{
	private String marca, modelo;
	private int ano;

	public Carro(){
		marca = "Desconhecida";
		modelo = "Desconhecido";
		ano = 0;
	}
	public Carro(String marcaDoCarro, String modeloDoCarro){
		marca = marcaDoCarro;
		modelo = modeloDoCarro;
		ano = 0;
	}
	public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro){
		marca = marcaDoCarro;
		modelo = modeloDoCarro;
		ano = anoDoCarro;
	}

	public void exibirDetalhes(){
		System.out.println("O carro da marca " + marca + " é do modelo " + modelo + ". Sendo um carro do ano de " + ano + ".\n");
	}
}