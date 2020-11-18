package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//Conversão de graus fahrenheit para celcius (ºF-32)*5/9 = ºC
		/*Duas constantes, 1-32 e a outra para o valor de 5/9
		 * Duas variáveis para F e C*/
		final int AJUSTE = 32;
		final double FATOR = 5.0/9;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("De " + fahrenheit +"ºF equivale a "+ celsius + "ºC");		
	}

}
