package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer i = 10000;
		//Converter para string e pegar o tamanho
		System.out.println("De número para string: " + i.toString().length());
		
		int num = 100000;
		System.out.println("\nInt to string: " + Integer.toString(num).length());
		
		System.out.println((" " + num).length());
	}

}
