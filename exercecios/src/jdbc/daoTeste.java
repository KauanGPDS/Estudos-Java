package jdbc;

import java.io.IOException;

public class daoTeste {

	public static void main(String[] args) throws IOException {
		dao d = new dao();
		
		String sql = "Insert into pessoas(nome) Values(?)";
		d.inclui(sql, "Marcos");
		d.inclui(sql, "Laine");
		d.inclui(sql, "Steven");
		
	}
}
