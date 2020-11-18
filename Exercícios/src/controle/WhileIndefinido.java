package controle;

import java.util.Scanner;

public class WhileIndefinido {
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		String usuarioFalou = "";
		String pChave = "sair";
		
		while (!usuarioFalou.equalsIgnoreCase(pChave)) {
			System.out.print("Você diz: ");
			usuarioFalou = dado.next();
			
		}
		System.out.println("Fim do Programa!");
		dado.close();
	}

}
