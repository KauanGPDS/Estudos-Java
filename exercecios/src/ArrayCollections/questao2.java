package ArrayCollections;

import java.util.Random;
import java.util.Scanner;

public class questao2 {
	  public static void main(String[] args) {
		  Scanner Sc = new Scanner (System.in);
		  int m = Sc.nextInt();
		  int n = Sc.nextInt();
		  
	        int[][] Numeros = new int [m][n];
	        
	        Random SORTEIONUMERO = new Random();
	        for (int linha = 0; linha < Numeros.length; linha++) {
	            for (int coluna = 0; coluna < Numeros.length; coluna++) {

	            	Numeros[linha][coluna] = SORTEIONUMERO.nextInt(100);
	                System.out.print(Numeros[linha][coluna] + " ");
	                
	            } System.out.println();
	           
	           
	    } 

}}
