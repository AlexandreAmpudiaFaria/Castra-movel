package com.example.CastraMovelCivap;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class insere {
	
	public static void main(String[] args) throws SQLException {
		inserer();
	}
	

	public static void inserer() throws SQLException {
		Conexao con = new Conexao();		
		Connection conexao = con.recuperarConexao();
		int i=0;
		while(i<=250) {			
			Statement stm = conexao.createStatement();
			stm.execute("INSERT INTO animal (nome, tipo, sexo, raca, cor, STATUS, observacao, proprietario, idade) VALUES ('teste', 2, 'M', 'nulo', 'preto', FALSE, 'teste', 1, 1)", Statement.RETURN_GENERATED_KEYS);
			i++;
			System.out.println(i);
		}
	}
	
	
}
