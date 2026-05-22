public class NotasAlunos{
	public static void main(String[] args){

		double[] alunosScore;

		alunosScore = new double[]{10, 6, 7.2, 8, 9.5}; //tamanho de 5 pois botei 5 elementos

		for(int i=0; i<alunosScore.length; i++){
			System.out.println("O aluno " + i + " tirou nota " + alunosScore[i]);
		}
	}
}