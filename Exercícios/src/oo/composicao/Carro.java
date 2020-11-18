package oo.composicao;

public class Carro {
	
	Motor motor;
	//Construtor
	//todo carro tem um motor e todo motor pertence a um carro
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorDeInjecao < 2.5) {
		motor.fatorDeInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorDeInjecao > 0.5) {
		motor.fatorDeInjecao -= 0.4;
		}
	}
	void ligado() {
		motor.ligado = true;
	}
	void desligado () {
		motor.ligado = false;
	}
	boolean estaLigado () {
		return motor.ligado;
	}

}
