package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	/*
	 * Criação de um método estático na classe 'FabricaConexao' para que quando
	 * sempre criar uma conexão ou algo do tipo, chamar o método em vez de ficar
	 * sempre criando em uma classe
	 */
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "V@ldir";
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
