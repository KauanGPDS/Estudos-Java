package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		//(*F-32) x 5/9 = *C
		double F = 86;
		final int n1 = 32;
		final double n2 = 5.0/9.0;
		double resu = (F - n1)*n2;
		
		System.out.println(resu);
	}

}
