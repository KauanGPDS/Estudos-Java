package fundamentos;

public class desafiooperadoresArit {
	public static void main(String[] args) {
		//int a = 3*4 - 10 ;
		//int b = (int) Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		
		int a = 6*(3+2);
		int a1 = (int)Math.pow(a, 2);
		System.out.println(a1);
		
		int b = (a1)/6;
		System.out.println(b);
		
		int c = (1 -5)*(2-7)/2;
		int c1 = (int)Math.pow(c, 2);
		
		System.out.println(c1);
		int sub = b-c1;
		int sub1 = (int)Math.pow(sub, 3);
		System.out.println(sub1);
		
		int baixo = 10;
		int baixo1 = (int)Math.pow(baixo, 3);
		
		System.out.println(sub1/baixo1);
	}

}
