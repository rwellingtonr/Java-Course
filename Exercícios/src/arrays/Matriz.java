package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		//input the data
		double total = 0;
		double media;
		
		Scanner inputData = new Scanner(System.in);

		System.out.print("Quantos aluos? ");
		int quantAlunos = inputData.nextInt();
		
		System.out.print("Quantidade de notas: ");
		int quantNotas = inputData.nextInt();
		
		double[][] notasTurma = new double[quantAlunos][quantNotas];
		
		for (int i = 0; i < notasTurma.length; i++) { //i = aluno
			for (int j = 0; j < notasTurma[i].length; j++) { //j = nota
				System.out.printf("Informe a nota %d do aluno %d: ", (j + 1), (i + 1));
				notasTurma[i][j] = inputData.nextDouble();
				total += notasTurma[i][j];
			}
		}
		
		inputData.close();
		
		media = total/ (quantAlunos * quantNotas);
		
		System.out.println("Média: " + media);
		for(double[] notasDoAluno : notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
	}

}
