package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException, IOException {
//		final String testeConexao = "jdbc:mysql://127.0.0.1?verifyCertificate=false&useSSL=true";
//		final String usuario = "root";
//		final String senha = "12345678";
//		
//		Connection conexao = DriverManager
//				.getConnection(testeConexao, usuario, senha);
		
		
		Connection conexao = fabricaConexão.getConexao();
		
		Statement stmt = conexao.createStatement();
		stmt.execute("Create Database if not exists curso_java");
		System.out.println("Banco Criado");
		
		
		conexao.close();
	}

}
