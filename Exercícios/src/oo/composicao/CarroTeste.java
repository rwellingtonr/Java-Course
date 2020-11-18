package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println("O carro está ligado? " + c1.estaLigado());
		
		if(!c1.estaLigado()) {
			c1.ligado();
		}
		System.out.println("O carro está ligado? " + c1.estaLigado());
		
		System.out.println(c1.motor.giros() + " rpm");
		
		c1.acelerar();	
		c1.acelerar();	
		c1.acelerar();	
		c1.acelerar();	
		c1.acelerar();	
	
		System.out.println(c1.motor.giros() + " rpm");
		
		c1.frear();
		c1.frear();
		c1.frear();

		//Relação bidirecional
		//System.out.println(c1.motor.carro.motor.giros());
		
		//faltou encapsulamento!!
		//c1.motor.fatorDeInjecao = -10;
				
		System.out.println(c1.motor.giros() + " rpm");

	
	}

}
