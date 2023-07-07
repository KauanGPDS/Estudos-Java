package ArrayCollections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class desafio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] notasAluno1 = new double[3];
		double total = 0;
		for(int i = 0; i< 3;i++) {
			System.out.println("Digite a nota " + (i+1) + " do aluno A : ");
			double nota = entrada.nextDouble();
			notasAluno1[i]= nota;
			total += notasAluno1[i];
		}
		for( double a:notasAluno1) {
			System.out.println(a);
		}
		System.out.println(total/notasAluno1.length);
		
		entrada.close();
		}

}
