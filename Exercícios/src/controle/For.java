package controle;

public class For {
	
	public static void main(String[] args) {

	
		
		//laço for precisa de 3 valores (a, b, c)
		/* a = inicio
		 * b = fim
		 * c = incremento
		 * */
		for (int contador = 1; contador <= 10;contador++) {
			System.out.printf("%d - Bom dia!\n", contador);
			
		}
		
		//pode ser criado desta forma, mas nn faz sentido
		int x = 2;
		for (; x <= 10 ;) {
			System.out.printf("Valor de x = %d\n", x);
			x++;
		}
	}
}
