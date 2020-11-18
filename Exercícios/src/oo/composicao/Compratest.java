package oo.composicao;

public class Compratest {
	
	public static void main(String[] args) {
		
		Compra Compra1 = new Compra();
		Compra1.nomeCliente = "Pedro";
		Compra1.itens.add(new Item("Caneta", 10, (10 * 1.5)));
		Compra1.itens.add(new Item("Marcador Vermelho", 3, (3 * 3.7)));
		Compra1.itens.add(new Item("Caderono", 2, (2 * 21.3)));
		
		Compra1.addItem("Borracha", 3, (3 * 0.7));
		
		System.out.println("Itens no carrinho: " + Compra1.itens.size());
		System.out.println("Valor do carrionho: R$" + Compra1.getValorTotal());
			
		}
		
		
	}


