package controle;

import java.util.Scanner;

public class SwitchComBreak {
public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		String sair = "";
		
		while (!sair.equalsIgnoreCase("s")) { // aqui começa o lupim ate que o usuario digir "S"
			
			String conceito = "";               
			System.out.println("Digite a nota: ");
			int nota = tec.nextInt(); // recebe o valor para gerar o conceito.     
 
			if (nota >= 0 && nota <= 10) { // condição true execulta a escolha do conceito.
 
				switch (nota) {    // aqui começa o parametro de multiplas escolha
				case 10:
					conceito = "A";
					break;
				case 9:
					conceito = "A";
					break;
				case 8:
					conceito = "B";
					break;
				case 7:
					conceito = "B";
					break;
				case 6:
					conceito = "C";
					break;
				case 5:
					conceito = "C";
					break;
				default:
					conceito = "R";
				}// fecha o parametro das multiplas escolhas
 
				System.out.println("Conceito é " + conceito); // exibe o conseito dentro da nota posta pelo o user
				System.out.println("Deseja sair? s/n");
				sair = tec.next();// recebe a escolha do usuario se quer continuar ou não
 
			} else  { // caso a primeira condçao seja false execulta essse parametro
				System.out.println("Deite um valor valido");
				System.out.println("Deseja sair? s/n");
				sair = tec.next();// recebe se o usuario quer sair
			}// fecha o parametro
		}//fecha o lupin
		tec.close();// fecha o Scanner
	}//Fim!
}


