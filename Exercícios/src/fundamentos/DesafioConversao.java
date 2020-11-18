package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		/*
		 * Criar um scaner e pegar 3 strings nextline
		 * 3 ultimos salário
		 * separar com virgula ou com ponto
		 * somar os 3 e mostrar a média
		 * */
		Scanner salario = new Scanner(System.in);
		//Ajuste de valore
		String salario1 = salario.nextLine().replace(",", ".");
		String salario2 = salario.nextLine().replace(",", ".");
		String salario3 = salario.nextLine().replace(",", ".");
		//Conversao para numero
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		//Soma e média
		double soma = (valor1 + valor2 + valor3);
		double media = soma/3;
		
		System.out.println("Salário total: " + soma 
				+ "\nMédia: " + media);
		
		salario.close();
				
	}

}
