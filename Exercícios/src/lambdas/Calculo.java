package lambdas;

@FunctionalInterface
public interface Calculo {
	
	//Interface funcional só pode ter um método abstrato
	double executar(double a, double b);
	
	default String teste() {
		return "Teste 01";
	}
	
	static String testeStatic() {
		return "método estático";
	}

}
