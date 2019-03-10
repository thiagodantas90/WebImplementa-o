package webimplementacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {
	private static final String DRIVER = "org.postgresql.Driver";   
	private static final String URL = "jdbc:postgresql://localhost:5432/Projeto01Web";   
	private static final String USERNAME = "postgres";   
	private static final String PASSWORD = "1234"; 
	
	
	public static Connection getConnection() throws SQLException {
		try {   
			Class.forName(DRIVER);   
		} catch (ClassNotFoundException ex) {   
			System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");   
			return null;   
		}   
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);   
		return conn;   
	}
}
