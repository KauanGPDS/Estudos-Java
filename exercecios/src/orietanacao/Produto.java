package orietanacao;

public class Produto {
	public static void main(String[] args) {
		
		ProdutoTeste p1 = new ProdutoTeste("note");
		p1.nome = "note2";
		p1.preco = 4325.89;
		p1.desconto = 0.25;
		
		var p2 = new ProdutoTeste("Caneta Preta",12.56,0.29);
		
		// p2.nome = "Caneta Preta";
		// p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precofinal = p1.precoComDesconto(1);
		double precofinal1 = p2.precoComDesconto(0);
		
		System.out.printf("Media do Carrinho = R$%.2f.\n",precofinal);
		System.out.printf("Media do Carrinho = R$%.2f.",precofinal1);

}
}
