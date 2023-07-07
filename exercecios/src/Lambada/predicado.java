package Lambada;

import java.util.function.Predicate;

public class predicado {
	public static void main(String[] args) {
		Predicate<Produto> isCaro = 
				prod -> prod.preco >= 750;
		
		Produto produto = new Produto("Notebook",3893.89,0.15);
		System.out.println(isCaro.test(produto));
	}

}
