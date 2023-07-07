package dasafioControle;

import java.util.Scanner;

public class terceiro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a 1 primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("digite a 2 primeira nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("digite a 3 primeira nota: ");
		double nota3 = entrada.nextDouble();
		
		double soma = nota1 + nota2 + nota3;
		
		double media = soma/3;
		
		boolean a = media >= 7 && media <= 10;
		boolean b = 4 <= media;
		boolean c = media <= 4 && 0 == media;
		
		if(a){
			System.out.println("Aprovado");
			System.out.println("Parabens");
		}else if(b){
			System.out.println("Recuperação");
		}else if(c){
			System.out.println("Reprovado");
		}
		
		

		entrada.close();
	}

}
