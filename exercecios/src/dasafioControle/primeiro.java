package dasafioControle;

import java.util.Scanner;

public class primeiro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 0 e 10");
		int numero = entrada.nextInt();
		
		boolean a = numero <= 10 && numero >= 0;
		
		if(a) {
			System.out.printf("O numero esta presente entre 0 e 10 e o numero foi %d", numero);
		}else {
			System.out.println("O numero informando é invalido");
		}

		entrada.close();
	}

}
