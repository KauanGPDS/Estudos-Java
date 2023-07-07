package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class exclusao {
	public static void main(String[] args) throws SQLException, IOException {
		Scanner entrada = new Scanner(System.in);

		int num1 = entrada.nextInt();
		Connection conexao = fabricaConexão.getConexao();
		String sql = "Delete From pessoas Where codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, num1);
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida");
			
		}else {
			System.out.println("Nada feito");
		}

		entrada.close();

}}
