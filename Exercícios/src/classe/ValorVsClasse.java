package classe;

public class ValorVsClasse {
	
	public static void main(String[] args) {
		double a = 2;
		double b = a;//atribuição por valor
		a++;
		b--;
		System.out.printf("Valor de A: %.1f, valor de B: %.1f\n", a, b);
		
		Data d1 = new Data(1, 07, 1995);
		Data d2 = d1; //atribuição por referência
		
		d1.dia = 21;
		d2.mes = 05;
		
		d1.ano = 1997;
		//Por que ambos tem o mesmo valor? Pois o d1 e d2 tem o endereço de aonde está o valor, e ele não são de fato o valor.
		System.out.println("Data: " + d1.obterDataFormatada());
		System.out.println("Data: " + d2.obterDataFormatada());
		
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println("\nData: " + d1.obterDataFormatada());
		System.out.println("Data: " + d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println("\nValor do primitivo: " + c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	static void alterarPrimitivo(int a) {
		//mexendo aqui dentro nao gera impacto, pois é um tipo primitivo
		//pois primitivos sao passados como cópia
		a++;
	}

}
