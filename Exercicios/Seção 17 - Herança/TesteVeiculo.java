class Veiculo{
	public void acelerar(){
		System.out.println("Veículo acelerando!");
	}
}


class Carro extends Veiculo{
	public void acelerar(){
		super.acelerar();
		System.out.println("Carro acelerando!");
	}
}

public class TesteVeiculo{
	public static void main(String[] args){

	Carro carro = new Carro();
	carro.acelerar();
	}
}