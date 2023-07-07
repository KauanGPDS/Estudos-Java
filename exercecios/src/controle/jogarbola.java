package controle;
import java.util.Scanner;

public class jogarbola {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Boolean drible1 = false;
		Boolean gol = false;
		Boolean goleiro = false;
		Boolean atacante = false;
		Boolean Zagueiro = false;
		do {
	
		System.out.println("Digite a Direção para dribla :");
		String drible = entrada.next();
		System.out.println("Digite o lado que goleiro ira se jogar :");
		String g = entrada.next();
		String zagueiro = "d";
		String Goleiro = "e";
		if("d".equals(drible)){
			drible1 = true;
			if("e".equals(g)){
				System.out.println("GOOOOOLLL");
				gol = true;
			}
		}else{
			System.out.println("Não foi gol");
		}
		
		
			
		} while (drible1 == false);
		
		
	}

}
