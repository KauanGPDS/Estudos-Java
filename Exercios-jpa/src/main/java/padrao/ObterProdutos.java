package padrao;

import java.util.List;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.println("Id " + produto.getId() + " Nome " + produto.getNome());
		}
	}

}
