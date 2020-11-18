package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_856_223L; //literal long, tem que adicionar o L
		
		//Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estaDeFerias = false;
		
		//Tipo caracter
		char status = 'A';
		
		//Dias de empresa
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias de empresa;");
		
		//Números de Viagens
		System.out.println(numeroDeVoos / 2 + " voos realizados pela empresa;" );
		
		//Pontos por real
		System.out.println("Pontos acumulados por vendas: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("O funcionário do id: " + id + " ganha por mês R$ " + salario);
		System.out.println("O funcionário está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);		
		
	}

}
