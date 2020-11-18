package classe.desafio;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		
		String alimento;
		String nomePessoa;
		double pesoDoAlimento;
		double pesoPessoa;
		
		//input the data
		Scanner dataIn = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome? ");
		nomePessoa = dataIn.nextLine();
		System.out.print("Seu peso atual? ");
		pesoPessoa = dataIn.nextDouble();
		Pessoa p = new Pessoa(nomePessoa, pesoPessoa);
		
		System.out.print("Escolha o seu primeiro prato: ");
		alimento = dataIn.next();
		
		System.out.print("Massa do prato: ");
		pesoDoAlimento = dataIn.nextDouble();
		Comida c1 = new Comida(alimento, pesoDoAlimento);
		
		System.out.print
		("Escolha o seu segundo prato: ");
		alimento = dataIn.next();
		System.out.print("Massa do segundo prato: ");
		pesoDoAlimento = dataIn.nextDouble();
		Comida c2 = new Comida(alimento, pesoDoAlimento);

		dataIn.close();
		
		System.out.println(p.Apresentacao());
		p.Comer(c1);
		
		System.out.println("Peso após comer o primeiro prato: " + p.peso);
		p.Comer(c2);

		System.out.println("Peso após comer o segundo prato: " + p.peso);
	}

}
