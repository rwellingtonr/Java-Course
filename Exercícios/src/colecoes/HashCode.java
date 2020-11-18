package colecoes;

import java.util.HashSet;

public class HashCode {
	
	public static void main(String[] args) {
		
		boolean resultado;
		
		HashSet<Usuario> user = new HashSet<>();
		
		user.add(new Usuario("Pedro"));
		user.add(new Usuario("Ana"));
		user.add(new Usuario("Maria"));
		user.add(new Usuario("José"));
		
		resultado = user.contains(new Usuario("Ana"));
		System.out.println("Resultado é: "+ resultado);
		
		
	}

}
