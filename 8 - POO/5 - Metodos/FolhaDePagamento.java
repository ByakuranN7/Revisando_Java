// A declaração de um método inclui o modificador de acesso, o tipo de retorno, o nome do método e os parâmetros

import empresa.dados.Funcionario;
//import empresa.dados.*; Se colocasse este comando, importaria todas as classes desse pacote

public class FolhaDePagamento{
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Maria", 6200.00); //criei um objeto da classe funcionario
		System.out.println(funcionario.obterInfo()); //Utilizei o método contido na classe funcionário
	}
}