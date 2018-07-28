package br.com.restful.factory;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * Classe responsável por conter os metodos REST de acesso ao webservice
 *
 * @author Moisés Augusto
 * @since 28/07/2018
 * @version 1.0
 */

public class ConnectionFactory {

	// Caminho do banco de dados.
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/webservice";
	private static final String USUARIO = "root";
	private static final String SENHA = "admpmoises";
	

	public Connection criarConexao(){
		
		Connection conexao = null;
		
		try {
			
			Class.forName(DRIVER);
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			
		} catch (Exception e) {
			System.out.println("Erro ao criar conexão com o banco: " + URL);
			e.printStackTrace();
		}
		return conexao;
	}
	
	
	public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){
		
		try {
			
			if(conexao != null){
				conexao.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(rs != null){
				rs.close();
			}
					
		} catch (Exception e) {
			System.out.println("Erro ao fechar conexão com o banco: " + URL);
		}
	}
}

