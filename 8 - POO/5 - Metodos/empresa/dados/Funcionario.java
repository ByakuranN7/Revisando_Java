// A declaração de um método inclui o modificador de acesso, o tipo de retorno, o nome do método e os parâmetros


package empresa.dados; //Definindo o pacote ao qual a classe pertence

public class Funcionario {
	//encapsulamento
	private String nome;
	private double salario;

	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
	}

	public String obterInfo(){
		return "Nome: " + nome + ", Salário: " + salario;
	}
}