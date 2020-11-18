package oo.heranca;

public class Heroi extends Jogador {
	// O heroi está herdando um jogador
	//recebe valores do jogador atraves de reuso de código
	
	//chamar a super classe
	boolean atacar(Jogador oponente) {
		boolean atak1 = super.atacar(oponente);
		boolean atak2 = super.atacar(oponente);
		return atak1 || atak2;
	}
	/*	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0){
			oponente.vida -= 10;
			return true;
		}else {
		return false;
		}
	}*/

}
