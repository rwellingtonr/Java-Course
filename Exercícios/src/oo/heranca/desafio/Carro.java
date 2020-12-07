package oo.heranca.desafio;

public class Carro {
	
	//velocidade nunca pode ser menor do q 0
	int velAtual = 60;
	final int VELOCIDADE_MAXIMA;
	private int aceleracao;
	
	Carro (int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void frear(Carro carro) {
		if(velAtual >= 10) {
			carro.velAtual -= 10;
		} else {
			carro.velAtual = 0;
		}
	}
	
	void acelerar(Carro carro){
		if ((velAtual + getAceleracao()) > VELOCIDADE_MAXIMA) {
			carro.velAtual = VELOCIDADE_MAXIMA;
		} else {
			carro.velAtual += getAceleracao(); 
		}
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}
	
}
