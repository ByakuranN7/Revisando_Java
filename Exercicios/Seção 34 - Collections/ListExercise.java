import java.util.List;
import java.util.ArrayList;

public class ListExercise{
	public static void main(String[] args){

		List<String> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add("Spider-Man: Into the Spider-Verse");
		listaDeFilmes.add("Spider-Man: Across the Spider-Verse");
		listaDeFilmes.add("HAIKYU!! The Dumpster Battle");
		listaDeFilmes.add("Jujutsu Kaisen 0");

		System.out.println("A lista possui o filme 'HAIKYU!! The Dumpster Battle'? " + listaDeFilmes.contains("HAIKYU!! The Dumpster Battle"));

		System.out.println("Lista completa de filmes: " + listaDeFilmes);
	}
}