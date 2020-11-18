package classe;

public class Data {
	
	int ano;
	int mes;
	int dia;
	
	Data(){
		/*ano = 1970;
		mes = 1;
		dia = 1;*/
		this(1, 1, 1970); //é a mesma coisa que chamar o outro construtor dentro da classe
		//de um construtor, chamar outro construtor
	}
	Data (int dia, int mes, int ano){
		this.dia = dia; //com o "this" acessa a variável da instâcia e não o do parâmetro
		this.mes = mes; 
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirData() {
		System.out.println(obterDataFormatada());
	}

}
