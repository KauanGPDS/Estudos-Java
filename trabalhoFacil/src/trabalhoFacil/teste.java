package trabalhoFacil;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controlador = 0;
		while(controlador !=1) {
			System.out.println("Digite o nome");
			String nome = scan.nextLine().trim();
			System.out.println("secho");
			String nome1 = scan.nextLine();
			
			 if (nome.matches("[^a-zA-Z0-9 ]+")) {
				 System.out.println("Nome Invalido");
	                System.out.println("A string contém apenas caracteres especiais.");
	            } else {
	            	System.out.println("Bom nome  " + nome );
	                System.out.println("A string não contém apenas caracteres especiais.");
	            }
		
		}
	}

}
