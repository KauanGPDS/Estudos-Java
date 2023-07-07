package desafios;

import java.util.Scanner;

public class primeiro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o fareheit :");
		double num1 = entrada.nextDouble();
		
		double calc = ( num1 - 32) * 5/9;
		
		System.err.println(calc);
 
		
		
		 
		entrada.close();
	}

}
