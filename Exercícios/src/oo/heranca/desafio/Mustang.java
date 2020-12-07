package oo.heranca.desafio;

public class Mustang extends Carro implements Esportivo, Luxo {
	
	boolean ligadoAr = false;
	boolean ligadoTurbo = false;
	
	//mustang acelera mais rápido 3x mais
	Mustang(int velocidadeMaxima) {
		super(velocidadeMaxima);
		// TODO Auto-generated constructor stub
		setAceleracao(15);
	}
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		ligadoTurbo = true;
	}
	@Override
	public void desligaTurbo() {
		// TODO Auto-generated method stub
		ligadoTurbo = false;
	}
	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		
		ligadoAr = true;
	}
	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		
		ligadoAr = false;
	}
	@Override
	public int getAceleracao() {
		// TODO Auto-generated method stub
		if (!ligadoAr && ligadoTurbo) {
			return 35;
		} else if (ligadoAr && ligadoTurbo) {
			return 30;
		} else if (!ligadoAr && !ligadoTurbo) {
			return 20;
		} else {
			return 15;
		}
		
	}
}
