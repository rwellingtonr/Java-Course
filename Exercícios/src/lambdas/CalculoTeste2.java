package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		//Função lambda
		Calculo calc = (x, y) -> {return x + y;};
		System.out.println(calc.executar(2, 3));
		
		//Lambda sem par de chaves só pode ter uma função, ou seja, uma linha de código.
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.teste());
		System.out.println(Calculo.testeStatic());//vinculado a interface
		
	
	}

}
