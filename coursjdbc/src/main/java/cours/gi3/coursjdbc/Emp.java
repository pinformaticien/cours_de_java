package cours.gi3.coursjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import cours.gi3.service.DataBaseHelper;

public class Emp {
	
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		DataBaseHelper db = DataBaseHelper.getInstance();
		
		try {
			System.out.print("Entrer le matricule: ");
			String mat = sc.nextLine();
			
			System.out.print("Entrer le nom: ");
			String nom = sc.nextLine();
			
			System.out.print("Entrer le prenom: ");
			String prenom = sc.nextLine();
			
			System.out.print("Entrer la date de naissance jj/mm/aaaa: ");
			LocalDate datenaiss;
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			String nais = sc.nextLine();
			datenaiss = LocalDate.parse(nais, df);
			System.out.println(datenaiss);
			
			
			
			System.out.println("Entrer le salaire: ");
			int sal = sc.nextInt();
			
			System.out.print("Entrer le numero de service: ");
			Integer num_service = sc.nextInt();
			
			
			String sql = "SELECT id from service WHERE id=?";
			Object[] parameters = {num_service};
			
			db.myPrepareStatement(sql);
			db.addParameters(parameters);
			ResultSet rs = db.myExecuteQuery();
			
			if (!rs.next()) {
				System.out.println("Service inexistante.");
			} else {
				sql = "SELECT matricule from employe WHERE matricule=?";
				Object[] params = { mat };
				db.myPrepareStatement(sql);
				db.addParameters(params);
				rs = db.myExecuteQuery();
				if (!rs.next()) {
					sql = "INSERT INTO employe VALUES (?, ?, ?, ?, ?, ?, ?)";
					Object[] prmts = {null, mat, nom, prenom, datenaiss, sal, num_service };
					db.myPrepareStatement(sql);
					db.addParameters(prmts);
					int n = db.myExecuteUpdate();
					System.out.println("Employee ajoute avec succes.");
				} else {
					System.out.println("Le matricule est deja attribue a un autre employe.");
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 
	}
	
	
}
