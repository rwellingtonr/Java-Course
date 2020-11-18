package controle;

import java.net.SocketTimeoutException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class ExercíciosEstruturasDeControle {
	
	public static void main(String[] args) {
		
		//Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; 
		//wellington - entrada de dados
		System.out.println("1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par\n");
		Scanner entradaDados = new Scanner(System.in);

		System.out.print("Digite um  número inteiro: ");
		int numero = entradaDados.nextInt();
		boolean codicional1 = numero > 0 && numero < 10;
		boolean ePar = (numero % 2 == 0);
		
		if (codicional1) {
			if (ePar) {
				System.out.printf("Número %d está entre 0 e 10 e é Par", numero);
			} else {
				System.out.printf("Número %d está entre 0 e 10 e é Impar", numero);
				
			} 
		} else {
			System.out.printf("Número %d não está entre 0 e 10", numero);
		}
		System.out.println("\n2. Criar um programa informa se o ano atual é um ano bissexto\n");
		
		//2. Criar um programa informa se o ano atual é um ano bissexto;
		Calendar cal = Calendar.getInstance();
		int ano = cal.get(Calendar.YEAR);
		if ((ano % 400 == 0) || (ano % 100 != 0)) {
			System.out.printf("O ano de %d é bissexto!", ano);
		}else {
			System.out.printf("O ano de %d não é bissexto!", ano);
		}
		System.out.println("\n3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console \"Aprovado\", se a nota for menor que 7.0 e maior do que 4.0 imprime no console \"Recuperação\", caso contrário imprime no console \"Reprovado\".\n");
		System.out.print("Digite a primeira nota parcial: ");
		float nt1 = entradaDados.nextFloat();
		System.out.print("Digite a segunda nota parcial: ");
		float nt2 = entradaDados.nextFloat();
		float media = (nt1 + nt2) / 2;
		
		if ((media < 10) && (media >= 7)) {	
			System.out.printf("Aprovado com a nota %.1f!", media);
		} else if(media > 4) {
			System.out.printf("Recuperação, pois nota foi %.1f!", media);
		} else {
			System.out.printf("Reprovado por causa da média %.1f!", media);
		}
		
		System.out.println("\n4. Criar um programa que receba um número e diga se ele é um número primo. \n");
		int quantidades = 0;
		System.out.print("Entre um número para ser analisado: ");
		int primoOunao = entradaDados.nextInt();
		
		for (int contador = 1; primoOunao >= contador; contador++) {
			if (primoOunao % contador == 0) {
				quantidades++;
			}
		}
		if (quantidades != 2) {
			System.out.println(primoOunao + " não é um número primo");
		} else {
			System.out.println(primoOunao + " é um número primo");			
		}
		
		System.out.println("5. Refatorar o exercício 04, utilizando a estrutura switch. ");
		int quantidades1 = 0;
		System.out.print("Entre um número para ser analisado: ");
		int primoOunao1 = entradaDados.nextInt();
		
		for (int contador1 = 1; primoOunao1 >= contador1; contador1++) {
			if (primoOunao1 % contador1 == 0) {
				quantidades1++;
			}
		}
		switch (quantidades1) {
		case 2:
			System.out.println(primoOunao1 + " é um número primo");
			break;
		default:
			System.out.println(primoOunao1 + " não é um número primo");
			break;
		}
				
		System.out.println("6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado. ");
		Random aleatorio = new Random();
		int sortiado = aleatorio.nextInt(100);
		String diferençaValor;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Tente adivinhar um número de 0 a 100: ");
			int adivinha = entradaDados.nextInt();
			if (sortiado == adivinha) {
				System.out.printf("\nVocê acertou na %dª tentativa! Número aleatório era: %d e você digitou %d", (i - 1),
						sortiado, adivinha);
				break;
			} else if (i < 10){
				int tentativasRestantes = 10 - i;
				if (sortiado > adivinha) {
					diferençaValor = "valor sortiado é maior";
				} else {
					diferençaValor = "valor sortiado é menor";
				}
				System.out.printf("\nAinda faltam %d tentativas e o %s\n", tentativasRestantes, diferençaValor);
			} else {
				System.out.printf("\nInfelizmente não foi desta vez! O valor sortido era %d\n\n", sortiado);
			}
		}
		System.out.println("Fim\n");
		
		
		System.out.println("7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while. ");
		int entPositivos = 0;
		int somaPositivos = 0;
		while (true) {
			System.out.println("Digite um valor inteiro: ");
			entPositivos = entradaDados.nextInt();
			if (entPositivos >= 0) {
				somaPositivos += entPositivos;
			} else {
				System.out.println("Valor negativo!");
				break;
			}
		}
		System.out.println("Programa finalizado, a soma dos positivos é " + somaPositivos);
		
		System.out.println("\n8. Criar um programa que receba uma palavra e imprime no console letra por letra. ");
		System.out.print("Digite uma palavra: ");
		String palavra = entradaDados.next();
		
		for (int j = 0; j < palavra.length(); j++) {
			System.out.println(palavra.charAt(j));
		}
		
		System.out.println("\n9. Crie um programa que recebe 10 valores e ao final imprima o maior número. ");
		int maiorNumero = 0;
		int aleatorio2;
		for (int i = 0; i < 10; i++) {
			aleatorio2 = aleatorio.nextInt(100);
			if ((i == 0) || (maiorNumero < aleatorio2)) {
				maiorNumero = aleatorio2;
			} 
			System.out.println("Número aleatório: " + aleatorio2);
		} 
		System.out.printf("O maior número foi %d", maiorNumero);

		entradaDados.close();
	

	}
}
