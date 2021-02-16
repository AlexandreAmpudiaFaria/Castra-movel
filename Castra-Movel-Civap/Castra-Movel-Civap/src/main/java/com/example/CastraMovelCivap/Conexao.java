package com.example.CastraMovelCivap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	
	public Connection recuperarConexao() throws SQLException {
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/castramovel?usetimezone=true&serverTimezona=UTC",
				"root", "root");

		
		return connection;		
	}
}
