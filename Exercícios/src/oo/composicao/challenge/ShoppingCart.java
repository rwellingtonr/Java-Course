package oo.composicao.challenge;

import java.util.ArrayList;

public class ShoppingCart {
	
	//Items' list
	final ArrayList<Item> items = new ArrayList<>();
	
	//Add Items to list
	void addItem(String prodName, double cost, int qtd) {
		var product = new Product(prodName, cost);
		this.items.add(new Item(product, qtd));
	}
	
	void addItem(Product product, int qtd) {
		this.items.add(new Item(product, qtd));		
	}
	//Total shipping cost
	double totalCost() {
		double total = 0;
		for (Item item: items) {
			total += item.qtd * item.product.cost;
		}
		return total;
	}

}
