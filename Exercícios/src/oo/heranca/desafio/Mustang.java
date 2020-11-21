package oo.heranca.desafio;

public class Mustang extends Carro {
	
	//mustang acelera mais rápido 3x mais
	@Override
	boolean acelerar(Carro carro){
		boolean acelerando = false;
		for (int i = 0; i < 3; i++) {
			acelerando = super.acelerar(carro);
		}
		return acelerando;
		
	}
	

}
