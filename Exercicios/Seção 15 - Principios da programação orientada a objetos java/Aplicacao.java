public class Aplicacao{
	public static void main(String[] args){

		Carro carro1 = new Carro();
		Carro carro2 = new Carro("Toyota", "Corolla");
		Carro carro3 = new Carro("Honda", "Honda Civic", 2020);


		carro1.exibirDetalhes();
		carro2.exibirDetalhes();
		carro3.exibirDetalhes();
	}
}