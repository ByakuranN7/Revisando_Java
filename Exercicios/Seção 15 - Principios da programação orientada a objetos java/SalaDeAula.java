public class SalaDeAula{
	public static int totalAlunos;

	//public SalaDeAula(){
	//	addAlunos();
	//} 

	public static void addAlunos(){
		totalAlunos++;
	}

	public static void printAlunosTotal(){
		System.out.println("O número total de alunos é: " + totalAlunos);
	}
}