package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

	public static void main(String[] args) throws SQLException{
		final String testeConexao = "jdbc:mysql://127.0.0.1?verifyCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager
				.getConnection(testeConexao, usuario, senha);
		
		System.out.println("Conexao efetuada com sucesso");
		
		conexao.close();
	}
}
