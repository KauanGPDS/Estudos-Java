package faculdad;

import java.util.Scanner;

public class tabuleiro {
	public static void main(String[] args) {
		peças pb = new peças("P",1);
		peças pb1 = new peças("P",1);
		
		//peças b = new peças();
		Scanner anda = new Scanner(System.in);
		
		
		//int andai = anda.nextInt();
		
		int[][] tabu = new int[8][8];
	
		do{
		int andaw = anda.nextInt();
		int andaj = anda.nextInt();
		for (int i = 0; i < tabu.length; i++) {
			for (int j = 0; j < tabu.length; j++) {
				
				if(i == 6) {
					System.out.print(pb.nome);
				}else if(i ==andaj && j == andaw) {
					System.out.print(pb1.nome);
					
				}else if( i ==7 && j == 7 || i == 7 && j == 0) {
					peças tb = new peças("T",1);
					System.out.print(tb.nome);
				}else if( i ==7 && j == 6 || i == 7 && j == 1) {
					peças cb = new peças("C",1);
					System.out.print(cb.nome);
				}else if(i ==7 && j == 5 || i == 7 && j == 2) {
					peças bb = new peças ("B", 1);
					System.out.print(bb.nome);
				}else if(i ==7 && j == 4) {
					peças rb = new peças ("R", 1);
					System.out.print(rb.nome);
				}else if(i ==7 && j == 3 ) {
					peças kb = new peças ("K", 1);
					System.out.print(kb.nome);
				}
				else{
					System.out.print("x");
				}

			}System.out.println();
			
		}

	}while(true);
	

}
	
}
