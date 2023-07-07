package facu;

import java.util.Arrays;


public class aviao {
	


	int acento;
	int aviao[] =  new int[100];

	public boolean compraAcento(int acento) {
		if(acento == 0 && acento <= 100) {
			aviao[acento] = 1;
			return true;
		}else {
			System.out.println("Acento ja prechido");
			return false;
		}
	}
	
	public void verificaCadeira() {
		int contador = 0;
		for(int i =0; i < aviao.length;i++) {
			if(aviao[i] == 0) {
				contador++;
				System.out.println("Falta prencher" + contador);
			}else {
				System.out.println("Todos os acentos foram prenchidos");
				}
		}
	}
	public void faltaAsCadeiras() {
		int cadeira[] = new int[100];
		int contador = 0;
		for(int i =0; i < aviao.length;i++) {
			if(aviao[i] == 0) {
				contador++;
				cadeira[i] = i;
				System.out.println("\nO numero de cadeira que faltam são" + contador + "\nAcentos que faltam " + Arrays.toString(cadeira)); 
			}
		}
	}

}
