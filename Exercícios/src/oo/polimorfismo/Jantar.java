package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.95);
		
		Comida arrozIntegral = new Arroz(0.20);
		Comida feijaoPreto = new Feijao(0.1);
		Comida ingrediente = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(feijaoPreto);
		convidado.comer(arrozIntegral);
		convidado.comer(ingrediente);
		
		System.out.println(convidado.getPeso());
		
		Comida sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
		
	}

}
