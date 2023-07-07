package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		
		System.out.print("BOM");
		System.out.print(" Dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena : %d %d %d %d %d %d %n"
				,1,2,3,4,5,6);
		System.out.printf("Salario : %.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome : ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade : ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("\n\nNome = %s  %d" ,nome ,idade);
		
		entrada.close();
	}

}
