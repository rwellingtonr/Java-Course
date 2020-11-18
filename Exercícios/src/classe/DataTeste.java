package classe;

import java.util.Scanner;

public class DataTeste {
	

	public static void main(String[] args) {

		Data valor1 = new Data();
		//input the data
		Scanner dataIn = new Scanner(System.in);
		System.out.println("Dia: ");
		int dia = dataIn.nextInt();
		System.out.println("Mês: ");
		int mes = dataIn.nextInt();
		System.out.println("Ano: ");
		int ano = dataIn.nextInt();
		
		
		Data valor2 = new Data(dia, mes, ano);
		

		dataIn.close();
	
		
		System.out.println(valor1.obterDataFormatada());
		valor1.imprimirData();
		System.out.println(valor2.obterDataFormatada());
		valor2.imprimirData();
	}
}


