package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá, pessoal".charAt(2));
		
		//String é um objeto imutável 
		String c = "Boa tarde";
		System.out.println(c.concat(", Wellington."));
		System.out.println(c + "!");
		System.out.println(c.toLowerCase().startsWith("boa"));
		System.out.println(c.length());
		System.out.println(c.endsWith("tarde"));
		System.out.println(c.isEmpty());
		System.out.println(c.equals("boa tarde"));
		System.out.println(c.equalsIgnoreCase("boa tarde"));
		
		var nome = "WELLINGTON";
		nome = nome.toLowerCase();
		var sobrenome = "Leardini Ramos";
		sobrenome = sobrenome.toLowerCase();
		var idade = 23;
		var salario = 1140.2987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\n");
		
		//%s para susbstituir string, %d para valore inteiros, %f formata float
		System.out.printf("Nome: %s %s, tem %s anos e seu salário é de %.2f Euros.\n\n"
				, nome, sobrenome, idade, salario);
		
		String maisUmaString = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\n";
		System.out.println(maisUmaString);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 8));
		
	}

}
