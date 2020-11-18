package fundamentos.operadores;

import javax.swing.JOptionPane;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		/*Trabalho terça
		 * trabalho quinta
		 * se os 2 ok, entao comprar uma TV de 50' no final de semana
		 * Se apenas um dos dois derem certo, compra TV 32 polegadas
		 * E em ambos irá ao shopping tomar sorvete com a família
	*/
		String trabalhoTerca =  JOptionPane.showInputDialog("O trabalho de terça-feira deu certo?");
		String trabalhoQuinta = JOptionPane.showInputDialog("O trabalho de quinta-feira deu certo?");
		
		String sim = "sim";

		if (trabalhoTerca.toLowerCase().contentEquals(sim) && trabalhoQuinta.toLowerCase().contentEquals(sim)) {
			System.out.println("Comprar TV de 50' e levar a família tomar sorvete no shopping!");
			
		}	else if (trabalhoTerca.toLowerCase().contentEquals(sim) || trabalhoQuinta.toLowerCase().contentEquals(sim)){
			System.out.println("Comprar TV de 32' e levar a família tomar sorvete no shopping!");
		} else {
			System.out.println("Infelizmente não deu certo nenhum trabalho :( ");
		}
	}
}
