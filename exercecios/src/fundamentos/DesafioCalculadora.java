package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner primeiro = new Scanner(System.in);
		System.out.print("Digite o primeiro numero : ");
		double numero1 = primeiro.nextDouble();
		
		System.out.print("Digite o segundo numero : ");
		double numero2 = primeiro.nextDouble();
		
		System.out.print("Qual o sinal da operação?  ");
		String sinal = primeiro.nextLine();
		
		System.out.println("\nQual Operação Você deseja Realizar com os números [+  -  x   / ]");

		String simbolo = primeiro.next();
		
		System.out.println(simbolo.equals("+") ? numero1+numero2 : simbolo.equals("-") ? numero1 - numero2 : simbolo.equals("*") ? numero1*numero2 : simbolo.equals("/") ? numero1/numero2 : "Operação não Encontrada");


		
		primeiro.close();
	}

}
