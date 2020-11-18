package oo.composicao.challenge;

public class Item {
	
	final int qtd;
	final Product product;
	
	//Constructor
	Item(Product product, int qtd){
		this.product = product;
		this.qtd = qtd;
	}

}
