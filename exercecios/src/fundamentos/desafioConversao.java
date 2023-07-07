package fundamentos;

import java.util.Scanner;

public class desafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu primeiro salario : ");
		String salario1 = entrada.next().replace(",", ".");;
		
		System.out.print("Digite seu primeiro salario : ");
		String salario2 = entrada.next().replace(",", ".");;
		
		System.out.print("Digite seu primeiro salario : ");
		String salario3 = entrada.next().replace(",", ".");
		
		double convert = Double.parseDouble(salario1);
		double convert2 = Double.parseDouble(salario2);
		double convert3 = Double.parseDouble(salario3);
		
		var soma = convert + convert2 + convert3;
		var media = soma/3;
		
		
		
		
		System.out.println("A soma entre os salario são: " + soma
			+ " A media dos salarios são : " + media);
		
		entrada.close();
	}

}
