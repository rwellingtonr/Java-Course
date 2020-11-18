package classe;

public class ProdutoTeste {
	
	@SuppressWarnings({ "static-access", "static-access" })
	public static void main(String[] args) {


		Produto p1 = new Produto("Notebook"); //Construtor
		p1.preco = 4358.99;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta2";
		p2.preco = 4.50;
		Produto.desconto = 0.3;
	
		System.out.printf("Nome do produto: %s\nPreço final: R$%.2f\nDesconto aplicado: %.2f",
				p1.nome, p1.precoComDesconto(), p1.desconto);
		System.out.printf("\n\nNome do produto: %s\nPreço final: R$%.2f\nDesconto aplicado: %.2f",
				p2.nome, p2.precoComDesconto(), 100*(p2.desconto));
	}

}
