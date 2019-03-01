package cours.gi3.coursjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import cours.gi3.service.DataBaseHelper;

public class Main {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);

			DataBaseHelper db = DataBaseHelper.getInstance();
			
			System.out.print("Saisissez l'ID du sevice: ");
			int idservice = sc.nextInt();
			
			String sql="SELECT * FROM service WHERE id=?";
			
			//preparation de la requete
			db.myPrepareStatement(sql);
			
			//passage des parametres
			Object[] parameters = {idservice};
			db.addParameters(parameters);
			
			//execution de la requete
			ResultSet rs = db.myExecuteQuery();
			idservice = 0;
			if(rs.next()) {
				
				idservice = rs.getInt(1);
			}
			rs.close();
			if(idservice != 0)
			{
				System.out.println("Entrer le libelle du service: ");
				sc.nextLine();
				String nomservice = sc.nextLine();
				
				sql = "UPDATE service SET libelle=? WHERE id=?";
				
				//preparation de la requete
				db.myPrepareStatement(sql);
				
				//passage des parametres
				Object[] par = {nomservice, idservice};
				
				db.addParameters(par);
				
				//execution de la requete
				db.myExecuteUpdate();
				System.out.println("Le service a été modifié.\n");
				
				sql="SELECT * FROM service";
				db.myPrepareStatement(sql);
				System.out.println("Affichage des services.");
				
				rs = db.myExecuteQuery();
				while (rs.next())
				{
					System.out.println(rs.getInt("id")+" "+rs.getString("libelle"));
				}
				
				db.closeConnection();
				
			}else {
				System.out.println("Ce service n'existe pas.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
