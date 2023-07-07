package oo.composicoesDesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p,int quantidade){
		this.itens.add(new item(p,quantidade));
	}
	void adicionarItem(String nome,double preco,int quantidade){
		var produto = new Produto(nome,preco);
		this.itens.add(new item(produto,quantidade));
	}
	double valorTotal(){
		double total = 0;
		
		for (item item : itens) {
			total += item.quantidade * item.produto.valor;
		}
		
		return total;
	}
	
	
	 
}
