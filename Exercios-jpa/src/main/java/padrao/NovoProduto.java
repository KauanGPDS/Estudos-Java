package padrao;

import infra.Dao;

public class NovoProduto {
	public static void main(String[] args) {
		Produto prod = new Produto("Monitor",789.40);
		
		Dao<Produto> dao = new Dao<>(Produto.class);
		
		dao.abrirT().incluir(prod).fecharT();
		
		System.out.println("Id : " + prod.getId());
	}

}
