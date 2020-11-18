package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//wellington - entrada de dados
		//wellington - entrada de dados
		Scanner entradaDados = new Scanner(System.in);
		String texto = "";
		
		//Faça enquanto for falso
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.print("Quer sair? ");
			texto = entradaDados.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");

		entradaDados.close();
	}

}
