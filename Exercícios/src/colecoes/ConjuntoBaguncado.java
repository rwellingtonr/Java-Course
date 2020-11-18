package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet(); //collection geral Object
		
		//add
		conjunto.add(1.2); //convert double to Double
		conjunto.add(true);
		conjunto.add("msg");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O conjunto tem " + conjunto.size() + " elementos");
		
		conjunto.add("msg");  //nao contabilizado pois é uma repetição
		
		System.out.println("O conjunto tem " + conjunto.size() + " elementos");
		
		//removendo
		System.out.println(conjunto.remove("msg"));
		System.out.println("O conjunto tem " + conjunto.size() + " elementos");
		
		System.out.println(conjunto.contains('x'));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //uniao dos dois conjuntos
		conjunto.retainAll(nums); //interseção
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
