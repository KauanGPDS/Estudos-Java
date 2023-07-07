package aaaaa;

public class Avioes1 {

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;


	public class Avioes1 {​​​​​​​
	    private List<Avioes> listaAvioes = new ArrayList<>();
	    private double numeroDoVoo;
	    private int dia, mes, ano;
	    private int[] aviao;


	    public Avioes(double numeroDoVoo, int dia, int mes, int ano, int acento) {​​​​​​​
	        this.numeroDoVoo = numeroDoVoo;
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	        aviao = new int[acento];
	    }​​​​​​​


	    public boolean compraAcento(int acento) {​​​​​​​
	        if (aviao[acento] == 0) {​​​​​​​
	            aviao[acento] = 1;
	            return true;
	        }​​​​​​​ else {​​​​​​​
	            System.out.println("Acento já preenchido");
	            return false;
	        }​​​​​​​
	    }​​​​​​​


	    public double getNumeroDoVoo() {​​​​​​​
	        return numeroDoVoo;
	    }​​​​​​​


	    public int getDia() {​​​​​​​
	        return dia;
	    }​​​​​​​


	    public void setDia(int dia) {​​​​​​​
	        this.dia = dia;
	    }​​​​​​​


	    public int getMes() {​​​​​​​
	        return mes;
	    }​​​​​​​


	    public void setMes(int mes) {​​​​​​​
	        this.mes = mes;
	    }​​​​​​​


	    public int getAno() {​​​​​​​
	        return ano;
	    }​​​​​​​


	    public void setAno(int ano) {​​​​​​​
	        this.ano = ano;
	    }​​​​​​​


	    public void verificaCadeira() {​​​​​​​
	        int contador = 0;
	        for (int i = 0; i < aviao.length; i++) {​​​​​​​
	            if (aviao[i] == 0) {​​​​​​​
	                contador++;
	            }​​​​​​​
	        }​​​​​​​
	        if (contador > 0) {​​​​​​​
	            System.out.println("Falta preencher " + contador + " acento(s)");
	        }​​​​​​​ else {​​​​​​​
	            System.out.println("Todos os assentos foram preenchidos");
	        }​​​​​​​
	    }​​​​​​​


	    public void faltaAsCadeiras() {​​​​​​​
	        List<Integer> cadeirasFaltantes = new ArrayList<>();
	        for (int i = 0; i < aviao.length; i++) {​​​​​​​
	            if (aviao[i] == 0) {​​​​​​​
	                cadeirasFaltantes.add(i);
	            }​​​​​​​
	        }​​​​​​​
	        System.out.println("Número de cadeiras faltantes: " + cadeirasFaltantes.size());
	        System.out.println("Acentos que faltam: " + cadeirasFaltantes.toString());
	    }​​​​​​​
	}
}
