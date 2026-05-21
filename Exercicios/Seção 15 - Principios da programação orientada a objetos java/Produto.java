public class Produto{

		private String nome; 
		private double preco; 
		private int quantidadeEmEstoque;

		public Produto(String name, double price, int stockQuantity){
			nome = name;
			preco = price;
			quantidadeEmEstoque = stockQuantity;
		}

		public String getInfo(){
			return "O produto " + nome + " custa R$" + preco + ". Atualmente possuimos " + quantidadeEmEstoque + " em estoque.";
		}

}