package exercicios;

import java.util.Scanner;

public class classeAuxiliarAExercio1 {
	Scanner entrada = new Scanner(System.in);
	private String numeroRomano;
	private int numeroArabico;
	
	//Essa Função Converte Numeros Inteiros Para Numeros Romanos
	 public int converteNumeroRomanoEmArabico(String numeroRomano1) {
	        numeroRomano1 = numeroRomano1.toUpperCase();
	        int[] valor = new int[numeroRomano1.length()];
	        int valorFinal = 0;
	        //Estou Separando os Caracteres dos numeros romanos e armanezando dentro de um array
	        for (int i = 0; i < numeroRomano1.length(); i++) {
	            char numeroDividi = numeroRomano1.charAt(i);
	            String converteString = String.valueOf(numeroDividi);
	            //Aqui estou comparando os numeros, Por exemplo se ele for 1 ele Recebe o Valor De I 
	            switch (converteString) {
	                case "I":
	                    valor[i] = 1;
	                    break;
	                case "V":
	                    valor[i] = 5;
	                    break;
	                case "X":
	                    valor[i] = 10;
	                    break;
	                case "L":
	                    valor[i] = 50;
	                    break;
	                case "C":
	                    valor[i] = 100;
	                    break;
	                case "D":
	                    valor[i] = 500;
	                    break;
	                case "M":
	                    valor[i] = 1000;
	                    break;
	                default:
	                    throw new IllegalArgumentException("Algarismo romano inválido: " + converteString);
	            }
	        }

	        for (int i = 0; i < valor.length - 1; i++) {
	            if (valor[i] < valor[i + 1]) {
	                valorFinal -= valor[i];
	            } else {
	                valorFinal += valor[i];
	            }
	        }
	        
	        valorFinal += valor[valor.length - 1];

	        return valorFinal;
	    }
	 

	 public static String converterArabicoParaRomano(int numeroArabico) {
		 try {
	        if (numeroArabico <= 0 || numeroArabico > 3999) {
	            throw new IllegalArgumentException("Número arábico inválido. O número deve estar entre 1 e 3999.");
	        }

	        StringBuilder numeroRomano = new StringBuilder();

	        int[] valoresArabicos = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	        String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	        int indice = 0;

	        while (numeroArabico > 0) {
	            int divisor = valoresArabicos[indice];

	            if (numeroArabico >= divisor) {
	                numeroRomano.append(valoresRomanos[indice]);
	                numeroArabico -= divisor;
	            } else {
	                indice++;
	            }
	        }

	        return numeroRomano.toString();
		 }catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	    }
}
