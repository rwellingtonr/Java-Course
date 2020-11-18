package fundamentos.operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
		
		var x = 34.56;
		double y = 2.2;
		System.out.println("X + Y: " + (x+y));
		System.out.println("X - Y: " + (x-y));
		System.out.println("X * Y: " + (x*y));
		System.out.println("X / Y: " + (x/y));
		
		int a = 8;
		int b = 3;
		System.out.println("\nA + B: " + (a+b));
		System.out.println("A - B: " + (a-b));
		System.out.println("A * B: " + (a*b));
		System.out.println("A / B: " + (a/ b));
		System.out.println("A / B (float): " + (a/ (float) b));
		System.out.println("Módulo (resto): " + (a % b));
	}

}
