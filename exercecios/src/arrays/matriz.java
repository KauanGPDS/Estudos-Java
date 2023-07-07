package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos : ");
		int qtdeAlunos = entrada.nextInt();	
		System.out.println("Quantos alunos : ");
		int qtdenotas = entrada.nextInt();	
		
		double[][] notasDaTurma = new double [qtdeAlunos][qtdenotas];
		double toal = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for(int j = 0; j < notasDaTurma[i].length;j++) {
				System.out.printf("informe a nota do aluno %d ra %d",i,j);
				notasDaTurma [i][j]= entrada.nextDouble();
				toal += notasDaTurma[i][j];
				
			}
			
		}
		double media = toal/(qtdeAlunos*qtdenotas);
		System.out.printf("Media da turma é " + media);
		
		for (double[] notasALuno : notasDaTurma) {
			System.out.println(Arrays.toString(notasALuno));
			
		}
		entrada.close();
	}

}
