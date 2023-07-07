package desafios;

import java.util.Scanner;

public class terceiro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		String alt = entrada.next().replace(",", ".");
		
		System.out.println("Digite sua seu peso: ");
		String peso = entrada.next().replace(",", ".");
		
		
		double peso1 = Double.parseDouble(peso);
		double alt2 = Double.parseDouble(alt);
		
		System.out.println(peso1/(alt2*alt2));
		
		
		
		entrada.close();
	}

}
