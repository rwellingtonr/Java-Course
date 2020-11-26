package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	//Getter and setter
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade > 0 || idade < 110) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Olá meu nome é " + getNome() + " e tenho " + getIdade() + " anos ";
	}
}
