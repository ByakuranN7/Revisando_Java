public class TesteSalaDeAula{
	public static void main(String[] args){
		
		SalaDeAula aluno1 = new SalaDeAula();
		SalaDeAula.addAlunos();
		SalaDeAula aluno2 = new SalaDeAula();
		SalaDeAula.addAlunos();
		SalaDeAula aluno3 = new SalaDeAula();
		SalaDeAula.addAlunos();

		SalaDeAula.printAlunosTotal();
	}
}