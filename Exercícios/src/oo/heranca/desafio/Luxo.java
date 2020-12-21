package oo.heranca.desafio;

public interface Luxo {
	
	public void ligarAr();
	abstract void desligarAr();
	
	//defaut nao é uma interface obrigatória à ser implementada 
	default int veloidadeDoAr() {
		return 1;
	}

}
