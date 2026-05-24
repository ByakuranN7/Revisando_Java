public class Bolo{
	
	int quantidadeAcucar;


	public static void main(String[] args){

		Bolo boloDeChocolate = new Bolo();//criando um objeto, significa que essa variavel é uma instância da classe Bolo
	
		boloDeChocolate.quantidadeAcucar = 200;


		Bolo boloDeBaunilha = new Bolo();

		boloDeBaunilha.quantidadeAcucar = 150;

		//a classe bolo serviu de referencia para criar dois bolos diferentes

		System.out.println("Quantidade de açúcar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);
		System.out.println("Quantidade de açúcar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);

	}
}