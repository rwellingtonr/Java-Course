package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String nomeCliente;
	
	ArrayList<Item> itens = new ArrayList<>();
	
	double getValorTotal() {
		double total = 0;
		for(Item item: itens) {
			//quantidade de cada item X seu valor
			total += item.qtd * item.preco;
		}
		
		return total;
	}
	
	void addItem(String nome, int qtd, double preco) {
		//este método chama o método de baixo
		this.addItem(new Item(nome, qtd, preco));
	}
	void addItem(Item item) {
		this.itens.add(item);
		//this no caso é minha classe atual
		item.compra = this;
		
	}
	

}
