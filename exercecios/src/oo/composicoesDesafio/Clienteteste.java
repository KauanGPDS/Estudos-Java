package oo.composicoesDesafio;

public class Clienteteste {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caderno",9.67,100);
		compra1.adicionarItem(new Produto("Notebook",1897.88),2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("caderno",10,10);
		compra1.adicionarItem(new Produto("Notebook",998.90),1);
		
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		
		cliente.compras.add(compra2);
		cliente.compras.add(compra1);
		
		System.out.println(cliente.obterValorTotal());

	}

}
