package ClassEModulo;

public class ValorXReferencia {
	
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		dataTeste d1 = new dataTeste();
		Data d2=d1;
		
		d1.dia = 31;
		d2.mes= 12;
		
	}
	
	
	

}
