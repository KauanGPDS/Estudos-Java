package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import orietanacao.pessoa;

public class atualizar {

	public static void main(String[] args) throws SQLException, IOException {
		
		Connection conexao = fabricaConexão.getConexao();
		
		String sql = "Update pessoas set nome = ? where codigo = ?; ";
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		String nome = entrada.next();

		
		
		PreparedStatement stmt =  conexao.prepareStatement(sql);
		stmt.setInt(2, num1);
		stmt.setString(1, nome);
		stmt.execute();
//		ResultSet r = stmt.executeQuery();
//		if(r.next()) {
//			pessoas p = new pessoas(r.getString(1),r.getInt(2));
//		}
	
		conexao.close();
		stmt.close();
		entrada.close(); 
	}
}
