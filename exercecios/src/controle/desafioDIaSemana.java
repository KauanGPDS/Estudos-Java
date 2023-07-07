package controle;

import java.util.Scanner;

public class desafioDIaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia ");
		String d = entrada.nextLine();
		
		if("domingo".equalsIgnoreCase(d)){
			System.out.println(1);
			}else if("segunda".equalsIgnoreCase(d)) {
				System.out.println(2);
			}else if("terca".equalsIgnoreCase(d)) {
				System.out.println(3);
			}else if("quarta".equalsIgnoreCase(d)) {
				System.out.println(4);
			}else if("quinta".equalsIgnoreCase(d)) {
				System.out.println(5);
			}else if("sexta".equalsIgnoreCase(d)) {
				System.out.println(6);
			}else if("sabado".equalsIgnoreCase(d)) {
				System.out.println(7);
			}else {
				System.out.println("Dia invalido");
			}
				
		
		entrada.close();
	}

}
