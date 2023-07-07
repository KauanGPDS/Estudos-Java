package modelo1para1;

import infra.Dao;

public class novoCliente {

	public static void main(String[] args) {
		Assento assento = new Assento("48D");
		cliente c2 = new cliente("Kauan",assento);
		
		Dao<cliente> dao = new Dao<>(cliente.class);
		
		dao.incluirAtomico(c2);
	}

}
