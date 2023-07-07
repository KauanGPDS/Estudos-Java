package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDENotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("informe a nota: ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDENotas++;}else {System.out.println("informe nota validada");}
			
		}
		
		double media = total/quantidadeDENotas;
		
		System.out.println("media = " + media);

		entrada.close();
	}

}
