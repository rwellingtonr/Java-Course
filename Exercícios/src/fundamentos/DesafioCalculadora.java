package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		/*
		 * Ler um núm1, ler num2, operação que o usuário quer fazer + - / * %*/
		//Entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Qual operação matemática você deseja realizar (+ - * / %): ");
		String operador = entrada.next();
		
		//Lógica
		double resposta = operador.equals("+") ? num1 + num2 : 0; //+
		resposta = operador.equals("-") ? num1 - num2 : resposta; //-
		resposta = operador.equals("%") ? num1 % num2 : resposta; // %
		resposta = operador.equals("*") ? num1 * num2 : resposta; // *
		resposta = operador.equals("/") ? num1 / num2 : resposta; // /
		
		System.out.printf("Resposta de %.3f %s %.3f = %.3f", num1, operador, num2, resposta);
			
		entrada.close();
	}

}
