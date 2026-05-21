/*Você foi contratado como programador júnior e, em seu primeiro trabalho, seu
gerente pediu para você criar um programa em Java para gerenciar dados de
funcionários. Como você é iniciante, ele solicitou que você fizesse um programa
simplificado que imprima o nome, cargo e idade dos funcionários.*/


public class FuncionarioSimple{
	
		String nome;
		String cargo;
		int idade;

		public static void main(String[] args){

			Funcionario funcionario1 = new Funcionario();
			funcionario1.nome = "João";
			funcionario1.cargo = "Desenvolvedor";
			funcionario1.idade = 30;

			Funcionario funcionario2 = new Funcionario();
			funcionario2.nome = "Maria";
			funcionario2.cargo = "Desenvolvedora";
			funcionario2.idade = 35;			

			System.out.println("Nome: " + funcionario1.nome);
			System.out.println("Cargo: " + funcionario1.cargo);
			System.out.println("Idade: " + funcionario1.idade);
			System.out.println("-----------------------");
			System.out.println("Nome: " + funcionario2.nome);
			System.out.println("Cargo: " + funcionario2.cargo);
			System.out.println("Idade: " + funcionario2.idade);
		}
}
