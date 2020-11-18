package fundamentos;

import java.util.Scanner;

public class Exercícios {
	
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		//Exercício 1
			//Celcius para Fahrenheit (C × 9/5) + 32
		System.out.println("Exercício 1!");
		System.out.print("Qual temperatura vc deseja converter para Fahrenheit? ");
		double ajuste = 9/5.0; //usado no calculo do segundo exercício tmb
		double celsius = entradaDados.nextDouble();
		double f = (celsius * ajuste) + 32;
		System.out.printf("(%.2f ºC × 9/5) + 32 = %.2f ºF\n", celsius, f);
		
		//Exercício 2
			// Fahrenheit para Celcius
		System.out.println("Exercício 2!");
		System.out.print("Qual temperatura vc deseja converter para Celcius? ");
		f = entradaDados.nextDouble();
		celsius = (f - 32) * (1/ajuste);
		System.out.printf("(%.2f ºF - 32) * 5/9 = %.2f ºF\n", f, celsius);
		
		//Exercício 3
			//IMC = peso/altura²
		System.out.println("Exercício 3!");
		System.out.print("Qual o peso da pessoa (Kg): ");		
		double peso = entradaDados.nextDouble();
		System.out.print("Qual a altura da mesma (m): ");
		double altura = entradaDados.nextDouble();
		double imc = peso/Math.pow(altura, 2);
		System.out.printf("O IMC dessa pessoa é: %.2f\n", imc);
		
		//Exercício 4
			//dobro e ao cubo
		System.out.println("Exercício 4!");
		System.out.print("Digite um número qualquer: ");
		double numIn = entradaDados.nextDouble();
		System.out.printf("O %.2f quadrado do número é: %.2f\nE ao cubo é: %.2f\n"
				, numIn, Math.pow(numIn, 2), Math.pow(numIn, 3));
		//Exercício 5
			//Área de um triangulo
		System.out.println("Exercício 5!");
		System.out.print("Base do triangulo: ");
		double b = entradaDados.nextDouble();
		System.out.print("Altura do triangulo: ");
		double h = entradaDados.nextDouble();				
		double areaTriangulo = (b * h) / 2.0;
		System.out.printf("Um triangulo com uma base de %.2f e altura de %.2f, tem uma área de %.2f m²\n"
				, b, h, areaTriangulo);
		
		//Exercício 6
			//Bhaskara
		System.out.println("Exercício 6!");
		System.out.print("Valor de a: ");
		double a = entradaDados.nextDouble();
		System.out.print("Valor de b: ");
		double b1 = entradaDados.nextDouble();
		System.out.print("Valor de c: ");
		double c = entradaDados.nextDouble();
		//calculos
		double delta = Math.sqrt((Math.pow(b1, 2))- (4 * a * c));
		double x1 = (-b1 + delta) / (2*a);
		double x2 = (-b1 - delta) / (2*a);
		
		System.out.printf("X1 = %.2f\nX2 = %.2f", x1, x2);
		entradaDados.close();
	}	

}
