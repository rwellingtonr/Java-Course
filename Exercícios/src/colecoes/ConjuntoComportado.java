package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//não é necessário declarar nos dois lados <String>
		//pode ser Método<String> = new Método<>();
		//Set<String> listaAprovados = new HashSet<String>(); //definição de um método específico
		
		//TreeSet ordena a lista e SortedSet tmb
		//Set<String> listaAprovados = new TreeSet<String>(); 
		SortedSet<String> listaAprovados = new TreeSet<String>(); 
				
		listaAprovados.add("Pedro");
		listaAprovados.add("Ana");
		listaAprovados.add("Janaina");
		
		System.out.println("Lista de aprovados: " + listaAprovados);
		
		for(String candidato : listaAprovados) {
			System.out.println("Nome: " + candidato);
			
		Set<Integer> nums = new HashSet<>(); 
			
		nums.add(1);
		nums.add(2);
		nums.add(528);
		nums.add(120);
		
		for(int n : nums) {
			System.out.println(n);
		}
			
		}
	}

}
