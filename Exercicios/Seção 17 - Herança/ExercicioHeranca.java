class Funcionario {
	private String nome;
	private double salario;

	public void addAumento(double valor) {
		salario += valor;
	}

	public double ganhoAnual() {
		return salario * 12;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}


class Assistente extends Funcionario {
	private int numeroMatricula;
	
	public double ganhoAnual() {
		// Considerando um bônus fixo de R$ 1000 para assistentes
		return super.ganhoAnual() + 1000;
	}
}


public class ExercicioHeranca{
	public static void main(String[] args) {
		Assistente assistente = new Assistente();

		assistente.addAumento(500); // Aumento de R$ 500
		assistente.setNome("João");
		assistente.setSalario(3000);

		System.out.println("Nome: " + assistente.getNome());
		System.out.println("Salário anual: R$" + assistente.ganhoAnual());
	}
}
