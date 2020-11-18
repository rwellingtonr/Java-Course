package oo.composicao.challenge;

import java.util.Scanner;

public class Interface {
	
	public static void main(String[] args) {
		
		String userName;
		String productName = "";
		String nextData = "";
		double costProd = 0;
		int qtd = 0;

		Scanner input = new Scanner(System.in);
		ShoppingCart sCart = new ShoppingCart();
		
			
		System.out.print("Hello Dear, What's your name? ");
		userName = input.nextLine();
		User user =  new User(userName);
		
		while(!nextData.equalsIgnoreCase("n")) {
		
			System.out.print("Which product are you looking for? ");
			productName = input.next();
			System.out.print("How much EUR ");
			costProd = input.nextDouble();
			System.out.print("How many: ");
			qtd = input.nextInt();	
			
			System.out.println("Would you like to shopping more ");
			nextData = input.next();
			
			sCart.addItem(productName, costProd, qtd);
			user.addShopping(sCart);
		
		}
		
		input.close();
		System.out.println("Hello, my name is " + user.name);
		
		System.out.println("Total Shipping Cart cost: " + sCart.totalCost());
		System.out.println("Total user cart: " + user.userCost());
				
		
	}

}
