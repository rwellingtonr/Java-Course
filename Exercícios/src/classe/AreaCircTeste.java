package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		//AreaCirc.pi = 3.141594;
		System.out.printf("%.3f m²", a.area());
	}
}