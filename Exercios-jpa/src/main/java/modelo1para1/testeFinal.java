package modelo1para1;

import infra.Dao;

public class testeFinal {
	public static void main(String[] args) {
		Assento assento = new Assento("3C");
		cliente c1 = new cliente("Cecilia",assento);
		
		Dao<Object> dao = new Dao<>();
		
		dao.abrirT().incluir(c1).incluir(assento).fechaT().fechar();
	}

}
