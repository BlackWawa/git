package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controller.ConnectionUtil;
import metier.MetierGlace;

public class DaoGlace {

	public List<MetierGlace> getGlace() {

		List<MetierGlace> gl = new ArrayList<>();

		ConnectionUtil myConn = new ConnectionUtil();
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			
			myStmt = myConn.getConnection().createStatement();

			String sql = "select * from glace;";

			myRs = myStmt.executeQuery(sql);

			while (myRs.next()) {
				gl.add(new MetierGlace(myRs.getInt("id"), myRs.getString("typeCornet"), myRs.getInt("nbBoules"),
						myRs.getString("parfum")));
				// System.out.println(cl);
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			System.out.println(exc.getMessage());
		}
	
		return gl;
		
	}

	
}
