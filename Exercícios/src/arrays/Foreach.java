package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.3, 9.4};
		//passa de um em um
		for(double nota: notas) {
			System.out.println(nota);
		}
		/* Outro método
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}*/
	}

}
