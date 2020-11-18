package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	//Calcular a notas de um aluno
	//Sistema pergunta: quantas notas o usuário deseja informar?
	//Quebrar em dois lacos for. 1º armazenar as notas. 2º foreach somar as notas. E no final somar a média
	
	public static void main(String[] args) {
		
		int quantidadeDeNotas;
		double total = 0;
		
		//input the data
		Scanner inputData = new Scanner(System.in);
		
		System.out.print("Quantidade de notas à serem digitadas: ");
		quantidadeDeNotas = inputData.nextInt();
		double[] notasDoAluno = new double[quantidadeDeNotas];
		
		for (int i = 0; i < notasDoAluno.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			notasDoAluno[i] = inputData.nextDouble();
		}		
		inputData.close();
	
		for(double nota: notasDoAluno) {
			total += nota;
		}
		double media = (total / notasDoAluno.length);
				
		System.out.printf("Média de notas do aluno: %.2f. Logo o aluno está: %s", media, StatusAluno(media));				
	}
	
	static String StatusAluno(double media) {
		String status = "";
		if (media < 5) {
			status = "Reprovado";
		} else if (media < 7) {
			status = "Recueração";
		} else {
			status = "Aprovado";
		}
		return status;
	}
	
}
