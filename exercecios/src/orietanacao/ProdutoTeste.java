package orietanacao;

public class ProdutoTeste {
	
	String nome;
	double preco;
	double desconto;
	ProdutoTeste(String nomeIncial){
		nome = nomeIncial;
		
	}
	ProdutoTeste(String nomeIncial,double precoInicial,double descontoInicial){
		nome = nomeIncial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return (preco*(desconto+descontoDoGerente))/100;
	}

}
