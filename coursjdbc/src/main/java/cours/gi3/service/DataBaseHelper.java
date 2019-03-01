package cours.gi3.service;

import java.sql.*;

public class DataBaseHelper {

	private Connection cnx;
	private PreparedStatement pstmt;
	
	private static DataBaseHelper db;
	
	public static DataBaseHelper getInstance(){
		if(db == null) {
			db = new DataBaseHelper();
		}
		return db;
	}
	
	private DataBaseHelper() {
		
	}

	// fonction qui connecte a la bd
	private void openConnetion() throws Exception {

		try {
			if (cnx == null || cnx.isClosed()) {
				// charger les drivers du SGBD
				Class.forName("com.mysql.jdbc.Driver");

				// les parametres de connexion
				String user = "root", password = "";
				String url = "jdbc:mysql://localhost:3306/coursjava";

				// connexion a la base
				cnx = DriverManager.getConnection(url, user, password);
				//System.out.println(cnx);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	// fonction qui prepare les requetes
	public void myPrepareStatement(String sql) throws Exception {
		try {

			openConnetion();
			pstmt = cnx.prepareStatement(sql);

		} catch (Exception e) {
			throw e;
		}
	}

	// fonction pour passer les parametres de la requete
	public void addParameters(Object[] parameters) throws SQLException {
		try {
			for (int i = 0; i < parameters.length; i++) {
				pstmt.setObject(i + 1, parameters[i]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	// fonction pour executer les requetes SELECTION
	public ResultSet myExecuteQuery() throws Exception {
		try {

			return pstmt.executeQuery();

		} catch (Exception e) {

			throw e;
		}
	}

	// fonction pour executer les requetes MISE A JOUR
	public int myExecuteUpdate() throws Exception {
		try {

			return pstmt.executeUpdate();

		} catch (Exception e) {

			throw e;
		}
	}

	// fonction pour fermer la connexion
	public void closeConnection() throws Exception {
		
		try {
			pstmt.close();
			pstmt = null;
			cnx.close();
			cnx = null;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}

	}
}
