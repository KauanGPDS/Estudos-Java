package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    String texto = "";
	    
	    do {
	    	System.out.println("Voce precisa falar as palavras magicas...");
	    	System.out.println("Quer sair ?");
	    	texto = entrada.nextLine();
	    }while(!texto.equalsIgnoreCase("Por Favor"));
	    
	    System.out.println("Obrigado");

		entrada.close();
		
		//if()sentença
		//while() sentença repetiçao
		//for()sentença
		//else
		
		// do sentença while(...);
	}

}
