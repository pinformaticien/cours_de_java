package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modele.Enseignant;
import modele.Etudiant;
import modele.Personne;
import service.*;

public  class Main 
{
	public static ArrayList<Personne> pr= new ArrayList<Personne>();
	public static void main(String[] args) 
	{
		
		Ipersonne ic1 = new Personnempl();
		int choix;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("***** MENU *****");
			System.out.println("1 Ajouter une Personne");
			System.out.println("2 Afficher les Personne (Etudiant/Enseignant)");
			System.out.println("3 Modifier une Personne");
			System.out.println("4 Recherche une Personne");
			System.out.println("5 Supprimer une Personne ");
			System.out.println("6 Afficher tous les Personne ");
			System.out.println("7 Quitter \n");
			System.out.println("faite votre choix ");
			choix=sc.nextInt();
			int b;
			switch (choix) {
			case 1:
			{
				System.out.println("1 Ajouter un Etudiant ");
				System.out.println("2 Ajouter un Enseignant \n");
				
				do {
					System.out.println("faite votre choix ");
					 b = sc.nextInt();
				} while (b != 1 && b != 2);
				sc.nextLine();
				System.out.println("entrer le nom");
				String Nom = sc.nextLine();
				System.out.println("entrer le prenom");
				String Prenom = sc.nextLine();
				System.out.println("entrer la date de naissance jj/mm/aaaa ");
				DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate Datenaiss =(LocalDate.parse(sc.nextLine(), dt));
				if(b == 1)
				{
					System.out.println("entrer la Matricule");
					String Mat= sc.nextLine();
					System.out.println("entrer la classe");
					String Classe= sc.nextLine();
					System.out.println("entrer la moyenne ");
					float Moy= sc.nextFloat();
					ic1.add(0, new Etudiant(Nom, Prenom, Datenaiss, Mat, Moy, Classe));

				}
				else
				{
					System.out.println("entrer le code ");
					String CodeE = sc.nextLine();
					System.out.println("entrer la fliere");
					String Fliere = sc.nextLine();
					ic1.add(0, new Enseignant(Nom, Prenom, Datenaiss, CodeE, Fliere));
				}
				break;
			}
			case 2:
			{
				System.out.println("0 Afficher un Etudiant ");
				System.out.println("1 Afficher un Enseignant \n");
				
				do {
					System.out.println("faite votre choix ");
					b = sc.nextInt();
				} while (b != 0 && b != 1 );
				
				ic1.Affiche(b);
				break;
			}
			case 3:
			{
				System.out.println("0 Modifier un Etudiant ");
				System.out.println("1 Modifier un Enseignant \n");

				do {
					System.out.println("faite votre choix ");
					b = sc.nextInt();
				} while (b != 0 && b != 1 );
				sc.nextLine();
				String critere;
					if(b==0)
					{
						System.out.println("saisir la matricule");
						critere = sc.nextLine();
					}
					else
					{
						System.out.println("saisir le code de l'enseignant");
						critere = sc.nextLine();
					}
					ic1.modifier(critere, b);
				break;
			}
			case 4:
			{
				System.out.println("0 Rechercher un Etudiant ");
				System.out.println("1 Rechercher un Enseignant \n");
				do {
					System.out.println("faite votre choix ");
					b = sc.nextInt();
				} while (b != 0 && b != 1 );
				sc.nextLine();
				String critere;
				if(b == 0)
				{
					System.out.println("entrer la matricule de l'etudiant que vous recherchez");
					critere = sc.next();
				}
				else
				{
					System.out.println("entrer le code de l'enseignant que vous recherchez ");
					 critere = sc.next();
				}
				ic1.find(critere, b);
				break;
			}
			case 5:
			{
				System.out.println("0 Supprimer un Etudiant ");
				System.out.println("1 Supprimer un Enseignant \n");
				
				do {
					System.out.println("faite votre choix ");
					b = sc.nextInt();
				} while (b != 0 && b != 1 );
				String critere = "";
				if(b == 1)
				{
					System.out.println("entrer la matricule de l'etudiant que vous voulez supprimer");
					critere = sc.next();
				}
				else if(b == 2)
				{
					System.out.println("entrer le code de l'enseignant que vous voulez supprimer ");
					 critere = sc.next();
				}
				ic1.sup(critere, b);
				break;
			}
			case 6:
			{
				ic1.Affiches();
				break;
			}
			default:
				System.out.println("AU REVOIR");
				break;
			}
		}
		while(choix != 7);
	}
}
