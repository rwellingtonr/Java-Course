package oo.heranca.desafio;

public class TesteCarros {
	
	//instanciar um Mustang e um Volkswagen
	public static void main(String[] args) {
		
		Volkswagen Gol = new Volkswagen();
		Mustang Boss429 = new Mustang();
		
		System.out.printf("Velocidade atual do Gol é %dkm/h\n", Gol.velAtual);
		System.out.printf("Velocidade atual do Boss 429 é %dkm/h\n", Boss429.velAtual);
		
		//acelerar
		for (int i = 0; i < 3; i++) {
			Gol.acelerar(Gol);
			Boss429.acelerar(Boss429);
		}
		System.out.println();
		System.out.printf("Velocidade do Gol após acelerar 3 vezes: %dkm/h\n", Gol.velAtual);
		System.out.printf("Velocidade do Boss 429 após acelerar 3 vezes: %dkm/h\n", Boss429.velAtual);
		
		//freiar
		for (int i = 0; i < 3; i++) {
			Gol.frear(Gol);
			Boss429.frear(Boss429);
		}
		System.out.println();
		System.out.printf("Velocidade do Gol após pisar no freio 3 vezes: %dkm/h\n", Gol.velAtual);
		System.out.printf("Velocidade do Boss 429 após pisar no freio 3 vezes: %dkm/h\n", Boss429.velAtual);
	}

}
