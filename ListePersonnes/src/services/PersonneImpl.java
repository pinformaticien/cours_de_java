package services;

import java.util.Scanner;



public class PersonneImpl implements IPersonne {
	
	
	
	public static void resultat() {
		int choix1;
		Scanner sc = new Scanner(System.in);
		IPersonne ip = new PersonneImpl();
		do
		{
			System.out.println("  MENU PRINCIPAL ");
			System.out.println("1-Ajouter une personne");
			System.out.println("2-Rechercher une personne");
			System.out.println("3-Rechercher des personnes");
			System.out.println("4-Modifier une personne");
			System.out.println("5-Supprimer une personne");
			System.out.println("6- Affichage de la liste.");
			System.out.println("7- Quitter le programme");

			System.out.print("Faites votre choix: ");
			choix1 = sc.nextInt();
			
			if(choix1==7) {System.out.println("Bye bye.."); break;}
			
			switch(choix1)
			{
			case 1:
				System.out.print("Entrer une option '1 pour etudiant' '2 pour enseignant' : ");
				int option = sc.nextInt();
				ip.add(option);
				System.out.println("personne ajoute avec succes.\n\n\n");
				break;
			case 2:
				System.out.print("Entrer un critere: ");
				String critere = sc.next();
				System.out.print("Entrer une option '1 pour etudiant' '2 pour enseignant' : ");
				int optionR = sc.nextInt();
				ip.findPersonne(critere, optionR);
				break;
			case 3:
				System.out.print("Entrer une option '1 pour etudiants' '2 pour enseignants' : ");
				int optionS = sc.nextInt();
				ip.findPersonnes(optionS);
				break;
			case 4:
				System.out.print("Entrer un critere: ");
				String critereEdit = sc.next();
				System.out.print("Entrer une option '1 pour etudiant' '2 pour enseignant' : ");
				int optionEdit = sc.nextInt();
				ip.editPersonne(critereEdit, optionEdit);
				break;
			case 5:
				System.out.print("Entrer un critere: ");
				String critered = sc.next();
				System.out.print("Entrer une option '1 pour etudiant' '2 pour enseignant' : ");
				int optiond = sc.nextInt();
				ip.deletePersonne(critered, optiond);
				break;
			case 6:
				ip.affichagePersonnes();
				break;
			}
			
		}while( choix1 != 7);
		sc.close();
		
	}
	
}
