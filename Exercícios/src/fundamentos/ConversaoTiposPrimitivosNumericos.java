package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double d = 1;
		System.out.println("Conversão implicita do double: " + d);
		
		//Conversão explicita (CAST)
		float f = (float) 1.2345;
		System.out.println("Conversão explicita do float: " + f);
		
		int c = 127;
		byte b = (byte) c; //range -128 à 127
		System.out.println("\nConversão de int para byte precisa ser explicita: " + b);
		
		double e = 1.0;
		int i = (int) e;
		System.out.println("Double para int (explicita): " + i);
	}

}
