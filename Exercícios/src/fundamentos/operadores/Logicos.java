package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\nTabela verdade do Ou exclusivo (XOR)!");
		System.out.println("0 ^ 0: " + (false ^ false));
		System.out.println("0 ^ 1: " + (false ^ true));
		System.out.println("1 ^ 0: " + (true ^ false));
		System.out.println("1 ^ 1: " + (true ^ true));
	}

}
