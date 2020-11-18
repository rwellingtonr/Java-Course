package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	
	public static void main(String[] args) {
		
		//Estrutura Chave e Valor
		
		java.util.Map<Integer, String> usuario = new HashMap<>();
		
		//Adiciona. Se repetido, ele reescreve 
		usuario.put(1, "Roberto");
		usuario.put(2, "Ricardo");
		usuario.put(3, "Ana");
		usuario.put(4, "Wellington");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		System.out.println(usuario.containsKey(2));
		System.out.println(usuario.containsValue("Wellington"));
		
		System.out.println(usuario.get(1));
		
		System.out.println("\n");
		for(int chave : usuario.keySet()) {
			System.out.println("Valor da chave: " + chave);
		}
		System.out.println("\n");
		for(String valor: usuario.values()) {
			System.out.println("Valor: " + valor);
		}
		System.out.println("\n");
		for(Entry<Integer, String> user : usuario.entrySet()) {
			System.out.println("Chave: "+ user.getKey() +". Valor: " + user.getValue());
		}
		System.out.println(usuario.remove(2));
		System.out.println(usuario.remove(3, "Jose"));
		
	}

}
