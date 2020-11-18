package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Wellington Leardini";
		u1.email = "wellington158@hotmail.com";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Wellington Leardini";
		u2.email = "wellington158@hotmail.com";
		//metodo equals
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
				
		System.out.println(u2.equals(new Date()));
		
	}

}
