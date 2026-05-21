//não precisa de import para utilizar Produto.java pois já estão na mesma pasta (mesmo package)

public class ProductSetter{
	public static void main(String[] args){

		Produto product = new Produto("Steam Deck", 4699.90, 5);
		System.out.println(product.getInfo());
	}
}