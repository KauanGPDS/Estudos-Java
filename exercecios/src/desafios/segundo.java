package desafios;

import java.util.Scanner;

public class segundo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os celcius : ");
		double num1 = entrada.nextDouble();
		
		double conversao = ( num1 * 9/5) + 32;
		
		System.out.println(conversao);
		entrada.close();
	}
	

}
