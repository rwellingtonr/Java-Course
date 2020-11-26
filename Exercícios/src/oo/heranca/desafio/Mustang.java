package oo.heranca.desafio;

public class Mustang extends Carro {
	
	//mustang acelera mais rápido 3x mais
	Mustang(int velocidadeMaxima) {
		super(velocidadeMaxima);
		// TODO Auto-generated constructor stub
		aceleracao = aceleracao * 3;
	}
}
