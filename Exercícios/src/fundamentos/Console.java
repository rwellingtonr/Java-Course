package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Pegando o nome
		
		System.out.print("Digite o seu nome: ");		
		String nome = entrada.nextLine();
		//Recebendo o sobrenome
		System.out.print("Digite o seu sobrenome: ");		
		String sobrenome = entrada.nextLine();
		//Idade
		System.out.print("Digite o seu sobrenome: ");		
		byte idade = entrada.nextByte();
		
		System.out.printf("\nNome completo: %s %s e tem %d.%n", nome, sobrenome, idade);
		entrada.close();

	}

}
