package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//pode ser desta forma também
		//double notasAulonoA[] = new double[3];
		double[] notasAulonoA = new double[4];
		
		notasAulonoA[0] = 7.9;
		notasAulonoA[1] = 8;
		notasAulonoA[2] = 6.7;
		notasAulonoA[3] = 9.4;
		
		System.out.println(Arrays.toString(notasAulonoA));
		
		double totalAlunoA = 0;
		
		for (int i = 0; i < notasAulonoA.length; i++) {
			totalAlunoA += notasAulonoA[i];
		}
		System.out.println("Média: " + totalAlunoA / notasAulonoA.length);
		System.out.println(notasAulonoA[2]);
		
		System.out.println("#".repeat(40));
		
		double totalAlunoB = 0;
		//Outro método de criar um Array
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10}; //Iniciado por valores literais
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.printf("Média aluno B: %.2f", (totalAlunoB/notasAlunoB.length));
		
	}

}
