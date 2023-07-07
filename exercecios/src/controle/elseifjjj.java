package controle;

import java.util.Scanner;

public class elseifjjj {
	public static void main(String[] args) {
		Scanner entranda = new Scanner (System.in);
		
		System.out.println("digita a nota: ");
		
		double nota = entranda.nextDouble();
		
		if(nota > 10 || nota < 0 ) {
			System.out.println("Nota Invalida");
		}else if(nota >= 8.1) {
			System.out.println("Nota Valida");
		}else if(nota >= 6.1) {
			System.out.println("conceito B");
		}
		
		entranda.close();
	}
	
    

}
