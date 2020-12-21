package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	
	public abstract String mamar();
	
	
	//n pode ser sobrescrito nas classes filhas
	@Override
	public final String mover() {
		// TODO Auto-generated method stub
		return "Se deslocando";
	}
}
