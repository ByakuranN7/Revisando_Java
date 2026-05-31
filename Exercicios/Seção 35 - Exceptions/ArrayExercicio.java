public class ArrayExercicio{
	
	public static int acessarElemento(int[] array, int indice){
		try{
			return array[indice];
		}catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("ERRO: " + exc.getMessage());
			return -1;
		}
	}


	public static void main(String[] args){

		int[] meuArray = {1, 2, 3, 4, 5};

		System.out.println("Elemento no índice 2 do array: " + acessarElemento(meuArray, 2));
		System.out.println("Elemento no índice 0 do array: " + acessarElemento(meuArray, 0));
		System.out.println("Elemento no índice 999 do array: " + acessarElemento(meuArray, 999));
	}
}