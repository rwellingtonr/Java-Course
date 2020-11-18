package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		//potencia Math.pow(numero a ser elevado, potencia)
		/*
		 * (((6*(3+2))²/(3*2) - (((1-5)*(2-7))/2)²)/10)³
		 *      a         b             c              
		 *      aDivb   
		 *      total
		 * */
		
		int a = (int) Math.pow((6*(3+2)),2);
		int b = 3*2;
		int aDivb = a/b;
		//System.out.println(aDivb);
		
		int c = (int) Math.pow((((1-5)*(2-7))/2), 2) ;
		//System.out.println(c);
		
		int total = (int) Math.pow(((aDivb)-(c))/10, 3);
		System.out.printf("(((6*(3+2))²/(3*2) - (((1-5)*(2-7))/2)²)/10)³ = \n((%d - %d)/10)³ = "
				+ "(%d/10)³ = %d"
				, aDivb, c, (aDivb - c), total);
	}

}
