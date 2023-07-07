package modelo1para1;

import infra.Dao;

public class obterClienteAssento {
	public static void main(String[] args) {
		Dao<cliente> dao = new Dao<>(cliente.class);
		cliente c12 = dao.obterPorId(5L);
		System.out.println(c12.getAsento().getNome());
		
		dao.fechar();
	}

}
