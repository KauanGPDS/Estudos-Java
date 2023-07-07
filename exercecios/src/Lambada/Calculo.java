package Lambada;

@FunctionalInterface
public interface Calculo {
	double executar(double a,double b);
	
	default String legal() {
		return "LEGAL";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}

}
