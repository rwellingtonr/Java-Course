package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(23);
		p1.setNome("Wellington");
		System.out.printf("Definido nome: %s e idade de %d anos\n", p1.getNome(), p1.getIdade());
		System.out.println(p1);
	}

}
