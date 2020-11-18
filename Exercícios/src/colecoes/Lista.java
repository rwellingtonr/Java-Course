package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Wellington");
		lista.add(u1);
		lista.add(new Usuario("Mariana"));
		lista.add(new Usuario("Radik"));
		lista.add(new Usuario("Marlene"));
		lista.add(new Usuario("Benji"));
		
		System.out.println(lista.remove(3));
		System.out.println(lista.remove(new Usuario("Marlene")));
		System.out.println("Tem? " + lista.contains(new Usuario("Wellington")));
		System.out.println("Get the 3rd index value: " + lista.get(3).nome + ".\n");
		System.out.println(lista.get(1));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);		
		}
		
		
	}
}
