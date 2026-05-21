/*Você foi contratado como programador júnior e, em seu primeiro trabalho, seu
gerente pediu para você criar um programa em Java para gerenciar dados de
funcionários. Como você é iniciante, ele solicitou que você fizesse um programa
simplificado que imprima o nome, cargo e idade dos funcionários.*/

//Construtor em java é um bloco de código especial utilizado para inicializar um objeto
//ele é chamado quando se cria um objeto
//é uma maneira conveniente de definir os valores iniciais para as variaveis de instancia para um objeto

import empresa.dados.Funcionario;
//import empresa.dados.*; Se colocasse este comando, importaria todas as classes desse pacote

public class FolhaDePagamento{
	public static void main(String[] args){

	Funcionario funcionario = new Funcionario("Maria", 6200.00);
	}
}