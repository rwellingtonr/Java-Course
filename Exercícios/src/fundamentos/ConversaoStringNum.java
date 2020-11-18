package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNum {
	
	public static void main(String[] args) {
		
		//Entrada dos valores
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		//Conversao dos valores em números
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		//soma
		double soma = numero1 + numero2;
		
		System.out.println("Soma dos valores: " + soma);
		System.out.printf("\nMédia: " + (soma/2));
		
	}

}
