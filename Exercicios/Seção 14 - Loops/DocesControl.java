//O objetivo deste exercício é criar um programa em Java que conte quantos doces o filho pode comer enquanto a condição estabelecida pela mãe for verdadeira (ou seja, no máximo 3 doces).

import java.util.Scanner;

public class DocesControl {
    public static void main(String[] args) {

        int docesConsumidos = 0;
        Scanner inputDoUsuario = new Scanner(System.in);
        int selecaoUser;
        boolean executando = true;

        while (executando && docesConsumidos < 3) {
            System.out.println("\nO máximo permitido pela sua mãe é 3 doces. Até o momento você comeu " + docesConsumidos);
            System.out.println("\nDeseja comer um doce?");
            System.out.println("1 - Sim.");
            System.out.println("2 - Sair");

            selecaoUser = inputDoUsuario.nextInt();

            switch (selecaoUser) {
                case 1 -> docesConsumidos++;
                case 2 -> executando = false;
                default -> System.out.println("Opção inválida, tente novamente\n");
            }
        }

        if (docesConsumidos == 3) {
            System.out.println("Você comeu o máximo de doces permitido.");
        } else {
            System.out.println("Você saiu antes de atingir o limite de doces.");
        }
    }
}