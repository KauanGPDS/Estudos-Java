package oo.composicoes;

import java.util.ArrayList;

public class compra {
	String Cliente;
	ArrayList<item> itens = new ArrayList<item>();
	
	void adicionarItem(String nome, int quantidade,double preco){
		this.adicionarItem(new item(nome,quantidade,preco));
	}
	void adicionarItem(item item){
		itens.add(item);
		item.compra = this;
	}

	double obterValorTotal(){
		double total = 0;
		
		for(item item: itens) {
		total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
