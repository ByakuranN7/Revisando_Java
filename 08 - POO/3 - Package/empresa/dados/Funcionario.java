/* Pacotes em java são importantes pois oferecerem:
1 - Melhor organização;
2 - Prevenção de conflitos de nomes;
3 - Reutilização de código;
4 - Controle de acesso. */

package empresa.dados; //Definindo o pacote ao qual a classe pertence

public class Funcionario {
	String nome;
	double salario;

	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
	}
}