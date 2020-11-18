package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//String não é um tipo primitivo	
		String s = "Bom dia, X!";
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		s = s.toUpperCase();
				
		System.out.println(s);
		System.out.println("wellington".toUpperCase());
		
		String y = "Bom dia, X".replace("X", "Well").toUpperCase();
		System.out.println(y);
	}

}
