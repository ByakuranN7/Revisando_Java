public class Main{
	public static void main(String[] args){
		byte idade = 25;
		short ano = 2024;
		int populacaoCidade = 500000;
		long populacaoMundial = 7800000000L; //put L to specify that its long
		float altura = 1.75f; //put f to specify that its float, always use . and not ,
		double salario = 4500.50; //this one doesnt show the last 0
		boolean estudante = true; //only true or false
		char inicialNome = 'A'; //basic comma

		System.out.println("Idade: " + idade);
		System.out.println("Ano: " + ano);
		System.out.println("População da cidade: " + populacaoCidade);
		System.out.println("População mundial: " + populacaoMundial);
		System.out.println("Altura: " + altura);
		System.out.println("Salário: " + salario);
		System.out.println("Estudante? " + estudante);
		System.out.println("Inicial do nome: " + inicialNome);
	}
}