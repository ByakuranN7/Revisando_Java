abstract class Veiculo{
	private String placa;
	private int ano;

	Veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}

	public void exibirInformacoes(){
		System.out.println("O veículo possui a placa " + placa + " e é do ano de " + ano);
	}

	public String getPlaca(){
		return placa;
	}

	public int getAno(){
		return ano;
	}
}

class Onibus extends Veiculo{
	int assentos;

	Onibus(String placa, int ano, int assentos){
		super(placa, ano);
		this.assentos = assentos;
	}

	@Override
	public void exibirInformacoes(){
		System.out.println("O onibus possui a placa " + super.getPlaca() + ", é do ano de " + super.getAno() + " e possui " + assentos + " assentos.");
	}
}

class Caminhao extends Veiculo{
	int eixos;

	Caminhao(String placa, int ano, int eixos){
		super(placa, ano);
		this.eixos = eixos;
	}

	@Override
	public void exibirInformacoes(){
		System.out.println("O caminhão possui a placa " + super.getPlaca() + ", é do ano de " + super.getAno() + " e possui " + eixos + " eixos.");
	}
}



public class GerenciadorVeiculos{
	public static void main(String[] args){

		Veiculo bus = new Onibus("1528IHJ", 2077, 25);
		Veiculo truck = new Caminhao("17LM89G", 2049, 3);

		bus.exibirInformacoes();
		truck.exibirInformacoes();
	}
}