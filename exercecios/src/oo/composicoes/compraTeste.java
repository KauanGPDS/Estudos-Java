package oo.composicoes;

public class compraTeste {
	public static void main(String[] args) {
		compra c1 = new compra();
		c1.Cliente = "Joao Predo";
		c1.itens.add(new item("caneta",20,7.45));
		c1.itens.add(new item("caneta",12,3.89));
		c1.itens.add(new item("caderno",3,18.79));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}

}
