package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	
	public static void main(String[] args) {
		
		//domingo = 1, quarta = 4 
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um dia da semana: ");
		String diaSemana = ent.next();
		
		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo é o dia 1");
			
		} else if (diaSemana.equalsIgnoreCase("segunda")){
			System.out.println("Segunda-feira é o dia 2");
			
		}else if (diaSemana.equalsIgnoreCase("terça")){
			System.out.println("Terça-feira é o dia 3");
			
		}else if (diaSemana.equalsIgnoreCase("quarta")){
			System.out.println("Quarta-feira é o dia 4");
			
		}else if (diaSemana.equalsIgnoreCase("quinta")){
			System.out.println("Quinta-feira é o dia 5");
			
		}else if (diaSemana.equalsIgnoreCase("sexta")){
			System.out.println("Sexta-feira é o dia 6");
			
		}else {
			System.out.println("Sabado é o dia 7");
		}
		
		ent.close();
	}

}
