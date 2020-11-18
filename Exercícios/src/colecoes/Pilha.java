package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	//last in, first out
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe"); //retorna vdd ou falso
		livros.push("Don Quixote"); //nn retorna nada, retorna excessao caso nn possa ser add por condições
		livros.push("O hobbit");
		
		System.out.println(livros);
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop()); //lança uma excessao caso nn consiga lançar
	}

}
