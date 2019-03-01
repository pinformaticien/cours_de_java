package cours.gi3.coursjdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

import cours.gi3.service.DataBaseHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	try {
    		
    		DataBaseHelper db = DataBaseHelper.getInstance();
    		
			Scanner sc = new Scanner(System.in);
			String nomservice = "";
			do
			{
				System.out.print("Saisissez un sevice: ");
				nomservice = sc.nextLine();
				
				String sql="SELECT * FROM service WHERE libelle=?";
				
				//preparation de la requete
				db.myPrepareStatement(sql);
				
				//passage des parametres
				Object[] parameters = {nomservice};
				db.addParameters(parameters);
				
				//execution de la requete
				ResultSet rs = db.myExecuteQuery();
				
				if (rs.next())
				{
					System.out.print("Ce libelle existe deja.\n");
				}else {
					rs.close();
					break;
				}
				
			}while(true);
			
			
			//Verifier si le libelle du service existe
			
			
			
				//insertion de service
			String sql = "INSERT INTO service VALUES(?, ?)";
			Object[] parameters = {null, nomservice};
			db.myPrepareStatement(sql);
			db.addParameters(parameters);
			int n = db.myExecuteUpdate();
			System.out.println("Service enregistré");
			
			sql="SELECT * FROM service";
			db.myPrepareStatement(sql);
			System.out.println("Affichage des services.");
			
			ResultSet rs = db.myExecuteQuery();
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			db.closeConnection();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur: "+e);
		}
    }
}
