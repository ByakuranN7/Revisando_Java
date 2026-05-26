interface Veiculo{
	public void iniciar();
	public void parar();
	default void buzinar(){
		System.out.println("O veículo está buzinando.\n");
	}
}


class Carro implements Veiculo{
	public void iniciar(){
		System.out.println("O carro está iniciando.");
	}

	public void parar(){
		System.out.println("O carro está parando.");
	}
}

class Caminhao implements Veiculo{
	public void iniciar(){
		System.out.println("O Caminhão está iniciando.");
	}

	public void parar(){
		System.out.println("O Caminhão está parando.");
	}
}


public class ExercicioDefault{
	public static void main(String[] args){

		Carro carro = new Carro();
		carro.iniciar();
		carro.parar();
		carro.buzinar();

		Caminhao caminhao = new Caminhao();
		caminhao.iniciar();
		caminhao.parar();
		caminhao.buzinar();

	}
}