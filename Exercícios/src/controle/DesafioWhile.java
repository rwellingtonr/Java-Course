package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//media dos alunos
		//wellington - entrada de dados
		Scanner entradaDados = new Scanner(System.in);
		
		double total = 0;
		double media = 0;
		int countNotasValidas = 0;
		//boolean reprovado = (media < 5 && media >= 0);
		
		while(media != -1) {
			System.out.print("Entre a média do aluno: ");
			media = entradaDados.nextDouble();
			boolean notasValidas = (media >= 0 && media <=10);
			if (notasValidas) {
				total += media;
				countNotasValidas++;
			} else {
				System.out.println("Nota inválida!");
			}
		}
		System.out.println("Quantidade de notas digitadas: " + countNotasValidas);
		System.out.println("Média da turma: " + (total / countNotasValidas));
		
		entradaDados.close();
	}
}
