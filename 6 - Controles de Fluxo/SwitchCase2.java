//Exemplo de Switch-case Expession
//Jeito mais moderno de fazer Switch-case

public class SwitchCase2{
    public static void main(String[] args){

        int dia = 3;

        switch (dia){
            case 1 -> System.out.println("Segunda-Feira.");
            case 2 -> System.out.println("Terça-Feira.");
            case 3 -> System.out.println("Quarta-Feira.");
            case 4 -> System.out.println("Quinta-Feira.");
            case 5 -> System.out.println("Sexta-Feira.");
            case 6 -> System.out.println("Sábado.");
            case 7 -> System.out.println("Domingo.");
            default -> System.out.println("Erro: Dia inválido.");
        }
    }
}