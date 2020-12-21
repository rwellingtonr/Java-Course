package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		//Função lambda padrão
		//Não converte automaticamente de int para double, por isso é necessário deixar o valor totalmente explicito
		//Antes: 2 --- Depois: 2.0
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		//Lambda sem par de chaves só pode ter uma função, ou seja, uma linha de código.
		BinaryOperator<Integer> calc1 = (x, y) -> x * y;
		System.out.println(calc1.apply(2, 3));
		
	
	}

}
