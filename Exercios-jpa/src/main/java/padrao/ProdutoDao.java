package padrao;

import infra.Dao;

public class ProdutoDao extends Dao<Produto>{

	public ProdutoDao() {
		super(Produto.class);
	}
}
