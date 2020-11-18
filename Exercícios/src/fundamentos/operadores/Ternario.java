package fundamentos.operadores;


import javax.swing.JOptionPane;

public class Ternario {
	
	public static void main(String[] args) {
		String media = JOptionPane.showInputDialog("Qual é a média do aluno");
		double valorMedia = Double.parseDouble(media);
		
		//Valor ternário
		String resultado = valorMedia >= 7.0? 
				"Aprovado" : "Reprovado";
		
		System.out.println("O aluno está " + resultado);
		
	}

}
