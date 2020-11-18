package classe;

public class AreaCirc {
	
	double r;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial){
		r = raioInicial;
	}
	double area() {
		return (PI * Math.pow(r, 2));
	}

}
