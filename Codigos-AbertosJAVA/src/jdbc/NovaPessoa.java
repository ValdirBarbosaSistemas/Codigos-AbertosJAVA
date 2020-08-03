package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome da pessoa: ");
		String nome = entrada.next();

		/*
		 * O modo abaixo é um modo seguro para não se ter 'invasão dos dados' que é
		 * chamado de 'sql injection'
		 * 
		 */
		Connection conexao = FabricaConexao.getConexao();

		String sql = "INSERT INTO pessoas (nome) VALUES (?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setInt(2, 10);
		stmt.execute();
		System.out.println("Pessoa incluída com sucesso!");
		entrada.close();
	}
}
