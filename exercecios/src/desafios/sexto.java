package desafios;

import java.util.Scanner;

public class sexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o A de Bhaskara : ");
		double A = entrada.nextDouble();
		
		System.out.println("Digite o B de Bhaskara : ");
		double B = entrada.nextDouble();
		
		System.out.println("Digite o C de Bhaskara : ");
		double C = entrada.nextDouble();
		
		double b2 = Math.pow(B, 2);
		
		double delta = b2 - (4*C*A) ;
		
		System.out.println("\nO delta é : " + delta);
		
		double delta2 = Math.sqrt(delta);
		
		double x1 = -B+delta2/(2*A) ;
		
		System.out.println(x1);
	
		
		
		entrada.close();
	}

}
