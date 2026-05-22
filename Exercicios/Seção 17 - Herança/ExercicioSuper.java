class Pessoa{
	public String nome;
	public int idade;

	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
}

class Estudante extends Pessoa{
	public int matricula;

	Estudante(int matricula, String nome, int idade){
		super(nome, idade);
		this.matricula = matricula;
	}
}


public class ExercicioSuper{
	public static void main(String[] args){

		Estudante estudante = new Estudante(1855660388, "Zack Fair", 23);
		System.out.println("A matrícula é: " + estudante.matricula);
		System.out.println("O nome do estudante é: " + estudante.nome);
		System.out.println("A idade do estudante é: " + estudante.idade);
	}
}