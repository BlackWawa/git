package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public Connection getConnection() throws Exception {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/glaces", "sa", "");
		System.out.println("Connection");
		return conn;

	}

	public void deConnection(Connection conn) throws Exception {
		System.out.println("Dedans deco");
		conn.close();
		System.out.println("Déconnecté");

	}

}

	

