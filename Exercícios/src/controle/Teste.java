package controle;

import java.util.Scanner;

public class Teste {
	//wellington - entrada de dados
	
	public static void main(String[] args) {
		
	
	Scanner entradaDados = new Scanner(System.in);

	String dodo = entradaDados.nextLine();
	
	for (int j = 0; j < dodo.length(); j++) {
		System.out.println(dodo.charAt(j));
	}
	entradaDados.close();

	}
}
