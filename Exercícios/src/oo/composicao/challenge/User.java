package oo.composicao.challenge;

import java.util.ArrayList;

public class User {
	
	final String name;
	ShoppingCart sCart;
	
	final ArrayList<ShoppingCart> cart = new ArrayList<>();

	
	//Constructor
	User(String name){
		this.name = name;
	}
	
	//self intruduction
	String selfIntroduction() {
		String msg = "Hello Dear, my name is %s and I'm shipping %s "; 
		return String.format(msg, this.name, sCart.items.get(0).product.prodName);
	}
	void addShopping(ShoppingCart cart) {
		this.cart.add(cart);
	}
	double userCost() {
		double userBuy = 0;
		for(ShoppingCart cost: cart) {
			userBuy = cost.totalCost();
		}
		return userBuy;
	}	

}
