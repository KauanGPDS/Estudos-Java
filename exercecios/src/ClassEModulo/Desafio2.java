package ClassEModulo;

import java.util.Scanner;

public class Desafio2 {

	//static int a = 3;
	public static void main(String[] args) {
		Scanner w4 = new Scanner(System.in);
		//for(int j = 0; j < 10;j++) {
			//System.out.println("Lançe a Braba : ");
			//int k = w4.nextInt();
		
			
		//}
		int k = w4.nextInt();
		//String arr= "Lucas";
		int ar2 = 0;
		//System.err.println(arr[0] + arr[1]);
		//int soma = arr[0] + arr[1];
		//System.out.print(soma);
		for(int i = 0; i <= k;i++) {
			System.out.println("Lançe a Braba : ");
			int k2 = w4.nextInt();
			//int somai = arr[i] + arr[i-1];
			ar2 += k2;
			System.out.println(ar2);
			
		}
		System.out.println(ar2);
		
	}
}
