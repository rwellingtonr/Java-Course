package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	public String Apresentacao() {
		String formato = "Bom dia, meu nome é %s e atualmente peso %.2f";
		return String.format(formato, nome, peso);
	}
	
	public void Comer(Comida refeicao) {
		if (refeicao != null) {
			this.peso += refeicao.pesoDaComida;
		}
	}

}
