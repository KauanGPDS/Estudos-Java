package ClassEModulo;

public class AreaCircTeste {
	double raio;
	final static double pi = 3.14;
	
	AreaCircTeste(double raioInicial){
		raio = raioInicial;
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}

}
