class ExemploDepreciado{
	
	@Deprecated
	public void metodoObsoleto(){
	}
}


public class TesteSuppressWarnings{
	@SuppressWarnings("deprecation")
	public static void main(String[] args){

		ExemploDepreciado exemplo = new ExemploDepreciado();
		exemplo.metodoObsoleto();
	}
}