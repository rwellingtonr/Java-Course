package classe;

public class Produto {
	
	//produtos com 25% de desconto para todos os produtos
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//construtor
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(){
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
