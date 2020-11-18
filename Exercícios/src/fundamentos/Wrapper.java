package fundamentos;

//import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;

		// Integer i = Integer.parseInt(entrada.next()); //converter o valor de uma
		// string em um número inteiro
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;

		System.out.println("Valor do byte " + b.byteValue());
		System.out.println("Valor do short " + s.toString());
		System.out.println("Valor do inteiro " + i * 3);
		System.out.println("Valor long " + l/3);

		// entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println("\nBoolean: " + bo);
		System.out.println("Conversão do booleano para string e uppercase: " + bo.toString().toUpperCase());
	
		Character c = '#';
		System.out.println("\nCharacter: " + c);
		
		Float f = 123.0F;
		Double d = 321.456;
		System.out.printf("Número float: %.2f.\nNúmero double (float): %.3f", f, d);
	}

}
