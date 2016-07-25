package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import metier.Client;

@ManagedBean
public class ClientDAO {

	private static ClientDAO instance;
	private DataSource dataSource;
	private String jndiName = "java:comp/env/jdbc/student_tracker_h2";

	public static ClientDAO getInstance() throws Exception {
		if (instance == null) {
			instance = new ClientDAO();

		}
		return instance;
	}


	public ClientDAO(DataSource dataSource, String jndiName) {
		super();
		this.dataSource = dataSource;
		this.jndiName = jndiName;
	}

	private ClientDAO() throws Exception {
		setDataSource(getDataSource());
	}

	private DataSource getDataSource() throws NamingException {
		Context context = new InitialContext();

		DataSource theDataSource = (DataSource) context.lookup(jndiName);
		return theDataSource;
	}

	private void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Client> getClients() {

		List<Client> cl = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			myConn = dataSource.getConnection();

			String sql = "select * from client;";

			myStmt = myConn.createStatement();

			myRs = myStmt.executeQuery(sql);

			while (myRs.next()) {
				cl.add(new Client(myRs.getInt("id"), myRs.getString("nom"), myRs.getString("prenom"),
						myRs.getString("ville")));
				// System.out.println(cl);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			System.out.println(exc.getMessage());
		}

		return cl;
	}

	public String addCLient(Client cl) throws SQLException {
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			myConn = dataSource.getConnection();

			String sql = "insert into client (id, nom , prenom, ville) values(?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);

			// préparation dfes parametres

			myStmt.setInt(1, cl.getId());
			myStmt.setString(2, cl.getNom());
			myStmt.setString(3, cl.getPrenom());
			myStmt.setString(4, cl.getVille());

			myStmt.execute();

		} finally {
			// TODO Auto-generated catch block
			myConn.close();

		}
		return "index";
	}
}
