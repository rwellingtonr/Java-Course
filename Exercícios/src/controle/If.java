package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		boolean criterioApp = media >= 7.0 && media <= 10;
		boolean cirterioRec = media >= 5;
		
		if (criterioApp) {
			System.out.println("Aprovado;");
			System.out.println("Parabens!");
		} else if (cirterioRec){
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
			
		}
				
		entrada.close();
	}

}
