package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean condi1 = true;
		boolean condi2 = 3 > 7;
		
		System.out.println(condi1 && condi2);
		System.out.println(condi1 || condi2);
		System.out.println(condi1 ^ condi2);
		System.out.println(!condi1);
		System.out.println(!!condi2);
	}

}
