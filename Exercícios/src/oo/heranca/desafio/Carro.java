package oo.heranca.desafio;

public class Carro {
	
	//velocidade nunca pode ser menor do q 0
	int velAtual = 60;
	boolean velLimit = (velAtual >= 0) && (velAtual <= 250);
	
	
	boolean frear(Carro carro) {
		if(velLimit) {
			carro.velAtual -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	boolean acelerar(Carro carro){
		if (velLimit) {
			carro.velAtual += 5;
			return true;
		} else {
			return false;
		}
	}
}
