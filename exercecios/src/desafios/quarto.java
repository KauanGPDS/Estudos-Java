package desafios;

import java.util.Scanner;

public class quarto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o numero que deseja ao cubo");
		double cubo = entrada.nextDouble();
		
		System.out.println("Digite o numero que deseja ao quadrado");
		double quadrado = entrada.nextDouble();
		
		System.out.println("Cubo : " + cubo*cubo*cubo + " quadrado :" + quadrado * quadrado);
		
		entrada.close();
	}

}
