package oo.abstrato;

public abstract class Animal {
	
	//apenas assinatura de método apenas para classes abstratas
	//método genérico, quando nn se sabe definir os padroes
	public String respirar() {
		return "Usando O2";
	}
	public abstract String mover();

}
