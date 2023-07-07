package desafios;

import java.util.Scanner;

public class quinto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do Triangulo : ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite a base do Triangulo : ");
		double base = entrada.nextDouble();
		
		System.out.println("\n Resultdo a area do triangulo : " + (base*altura)/2);
		
		
		entrada.close();
	}

}
