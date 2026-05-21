//Sobrecarga de construtores é quando definimos dois ou mais construtores com diferentes listas de parâmetros na mesma classe (devem ter diferentes listas de parametros, como numero, tipo e ordem)




public class FuncionarioSobrecarga{
	
		String nome;
		String cargo;
		int idade;

		//Sobrecarga de construtores com 4 construtores
		FuncionarioSobrecarga(String nome, String cargo, int idade){
			this.nome = nome;
			this.cargo = cargo;
			this.idade = idade;
		}
		FuncionarioSobrecarga(int idade, String cargo, String nome ){
			this.nome = nome;
			this.cargo = cargo;
			this.idade = idade;
		}
		FuncionarioSobrecarga(String nome){
			this.nome = nome;
		}
		FuncionarioSobrecarga(){
		}



		public static void main(String[] args){

			FuncionarioSobrecarga funcionario1 = new FuncionarioSobrecarga("João", "Desenvolvedor", 30);
			FuncionarioSobrecarga funcionario2 = new FuncionarioSobrecarga(35, "Desenvolvedora", "Maria");			

			System.out.println("Nome: " + funcionario1.nome);
			System.out.println("Cargo: " + funcionario1.cargo);
			System.out.println("Idade: " + funcionario1.idade);
			System.out.println("-----------------------");
			System.out.println("Nome: " + funcionario2.nome);
			System.out.println("Cargo: " + funcionario2.cargo);
			System.out.println("Idade: " + funcionario2.idade);
		}
}