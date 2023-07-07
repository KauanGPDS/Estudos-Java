package ClassEModulo;

public class AreaCirc {
	public static void main(String[] args) {
		AreaCircTeste a1 = new AreaCircTeste(10);
		// a1.pi = 10000;
		
		AreaCircTeste a2 = new AreaCircTeste(5);
		// a2.pi = 0;
		
		//AreaCircTeste.pi = 3.1414;
		System.out.println(a2.area());
		
		
		System.out.println(AreaCircTeste.pi);
		System.out.println(Math.PI);
	
	}

}
