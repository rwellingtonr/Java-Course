package colecoes;

import java.util.LinkedList;

public class Queue {
	
	public static void main(String[] args) {
		
		java.util.Queue<String> lista = new LinkedList<>();
				
		//Offer e add  = adicinionam elementos na fila
		//Diferente =e o comportamento quando a fila est=a cheio
		lista.add("Ana"); //retorna falso quando cheio
		lista.offer("Bia"); //lanca uma excessao quando estiver cheio
		lista.offer("Maria");
		lista.offer("Carla");
		lista.offer("Mariana");
		lista.offer("Marlene");
		
		System.out.println(lista);
		//A diferentça ocorre quando a fila está vazia, ambos pegam o próximo elemento da fila
		System.out.println(lista.peek()); //retorna falso
		System.out.println(lista.element()); //retorna excessao
		
		//Retorna o primerio valor e removeo da fila
		System.out.println(lista.poll()); //retorna null quando vazio
		System.out.println(lista.remove()); //Lança excessao quando vazio
		
		lista.clear();
		System.out.println("A lista está limpa? " + lista.isEmpty());
	
	}

}
