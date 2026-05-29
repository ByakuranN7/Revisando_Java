class Cesto<T>{
	private T conteudoDoCesto;

	public void guardarObjeto(T objeto){
	conteudoDoCesto = objeto;
	}

	public T pegarObjeto(){
	return conteudoDoCesto;
	}
}



class Peixe{
	public String nome;
	public double tamanho;

	public Peixe(String nome, double tamanho){
		this.nome = nome;
		this.tamanho = tamanho;
	}
}

class Polvo{
	public String nome;
	public int tentaculos;

	public Polvo(String nome, int tentaculos){
	this.nome = nome;
	this.tentaculos = tentaculos;
	}
}


public class ExercicioUm{
	public static void main(String[] args){

		Cesto<Peixe> cestoPeixe = new Cesto<>(); //criando um objeto Cesto que só pode armazenar objetos do tipo Peixe
		cestoPeixe.guardarObjeto(new Peixe("Palhaço", 5.2)); //criando um peixe e armazenando no cesto
		Peixe peixeRecuperado = cestoPeixe.pegarObjeto();

		System.out.println("O nome do peixe é: " + peixeRecuperado.nome + " e o tamanho é " + peixeRecuperado.tamanho +"cm.");

		Cesto<Polvo> cestoPolvo = new Cesto<>();
		cestoPolvo.guardarObjeto(new Polvo("Polvo-de-manchas-brancas-do-Atlântico", 8));
		Polvo polvoRecuperado = cestoPolvo.pegarObjeto();

		System.out.println("O nome do polvo é: " + polvoRecuperado.nome + " e o número de tentaculos é " + polvoRecuperado.tentaculos);
	}
}