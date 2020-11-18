package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.printf("Monstro: Vida: %d (x: %d, y: %d)\n", monstro.vida, monstro.x, monstro.y);
		System.out.printf("Heroi: Vida: %d (x: %d, y: %d)\n", heroi.vida , heroi.x, heroi.y);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println();
		
		System.out.printf("Monstro: Vida: %d (x: %d, y: %d)\n", monstro.vida, monstro.x, monstro.y);
		System.out.printf("Heroi: Vida: %d (x: %d, y: %d)\n", heroi.vida , heroi.x, heroi.y);
	}

}
