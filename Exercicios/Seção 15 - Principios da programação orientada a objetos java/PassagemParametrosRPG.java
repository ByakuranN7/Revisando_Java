public class PassagemParametrosRPG{

    public static void main(String[] args) {

        Personagem personagem = new Personagem("SOLDIER 1st Class", 50);


        System.out.println("\nDados iniciais do personagem:");
        personagem.mostrarDadosPersonagem();

        personagem.aumentarNivelPoder(50);

        System.out.println("\nDepois de aumentarNivelPoder():");
        personagem.mostrarDadosPersonagem();

        personagem.mudarNome(personagem,"Cloud Strife");

        System.out.println("\nDepois de mudarNome():");
        personagem.mostrarDadosPersonagem();
    }
       
}