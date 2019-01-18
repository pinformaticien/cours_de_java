package services;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modeles.*;

public interface IPersonne {
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Personne> personnes = new ArrayList<Personne>();
	
	default public void add(int b) // Debut de methode add
	{
		if(b==1)
		{
			System.out.print("Nom de l'etudiant: ");
			String eNom = sc.next();

			System.out.print("Prenom de l'etudiant: ");
			String ePrenom = sc.next();

			System.out.print("Date de naissance de l'etudiant: ");
			String eDateNaiss = sc.next();

			System.out.print("Matricule de l'etudiant: ");
			String eMat = sc.next();

			System.out.print("Classe de l'etudiant: ");
			String eClasse = sc.next();

			Etudiant e1 = new Etudiant(eNom, ePrenom, LocalDate.parse(eDateNaiss, df), eMat, eClasse);
			personnes.add(e1);
		} 
		else 
		{
			System.out.print("Nom de l'enseignant: ");
			String eENom = sc.next();

			System.out.print("Prenom de l'enseignant: ");
			String eEPrenom = sc.next();

			System.out.print("Date de naissance de l'enseignant: ");
			String eEDateNaiss = sc.next();

			System.out.print("Matiere de l'enseignant: ");
			String eMatiere = sc.next();

			System.out.print("Taux horaire de l'enseignant: ");
			int eTH = sc.nextInt();

			System.out.print("Nombre d'heures de l'enseignant: ");
			int eNbH = sc.nextInt();

			System.out.print("Code de l'enseignant: ");
			String eCode = sc.next();

			Enseignant e2 = new Enseignant(eENom, eEPrenom, LocalDate.parse(eEDateNaiss, df), eMatiere, eTH, eNbH, eCode);

			personnes.add(e2);
			
		}
	} // Fin de methode add
	
	default public void findPersonne(String a, int b) //Debut methode findPersonne
	{
		if(b==1)
		{
			for(Personne p: personnes)
			{
				if( p instanceof Etudiant)
				{
					if(((Etudiant) p).getMat().equals(a))
					{
						System.out.println(p);
					}
					else {
						System.out.println("Ce matricule n'existe pas.");
					}
				}
			}
		}
		else if(b==2)
		{
			for(Personne p: personnes)
			{
				if( p instanceof Enseignant)
				{
					if(((Enseignant) p).getCodeEnseignant().equals(a))
					{
						System.out.println(p);
					}
					else {
						System.out.println("Ce code n'existe pas.");
					}
				}
			}
		}
	}//Fin methode findPersonne
	
	default public void findPersonnes(int b)//Debut methode findPersonnes
	{
		if(b==1)
		{
			for(Personne p: personnes)
			{
				if( p instanceof Etudiant)
				{
						System.out.println(p);
				}
			}
		}
		else if(b==2)
		{
			for(Personne p: personnes)
			{
				if( p instanceof Enseignant)
				{
						System.out.println(p);
				}
			}
		}
	}//Fin methode findPersonnes
	
	default public void editPersonne(String a, int b)//Debut methode editPersonne
	{
		if( b==1 )
		{
			for(int i=0; i<personnes.size(); i++)
			{
				if(personnes.get(i) instanceof Etudiant)
				{
					if( ((Etudiant)personnes.get(i)).getMat().equals(a))
					{
						System.out.print("Nom de l'etudiant à nouveau: ");
						String neNom = sc.next();

						System.out.print("Prenom de l'etudiant à nouveau: ");
						String nePrenom = sc.next();

						System.out.print("Date de naissance de l'etudiant à nouveau: ");
						String neDateNaiss = sc.next();

						System.out.print("Matricule de l'etudiant à nouveau: ");
						String neMat = sc.next();

						System.out.print("Classe de l'etudiant à nouveau: ");
						String neClasse = sc.next();

						Etudiant ne1 = new Etudiant(neNom, nePrenom, LocalDate.parse(neDateNaiss, df), neMat, neClasse);
						personnes.set(i, ne1);
						
						System.out.println("\nModification reussie avec succes.\n"); break;
					} else {
						System.out.println("Aucun etudiant n'a pour matricule "+a);
					}
				}
			}
		}
		else if(b==2)
		{
			for(int i=0; i<personnes.size(); i++)
			{
				if(personnes.get(i) instanceof Enseignant)
				{
					if( ((Enseignant)personnes.get(i)).getCodeEnseignant().equals(a))
					{
						System.out.print("Nom de l'enseignant à nouveau: ");
						String neNom = sc.next();

						System.out.print("Prenom de l'enseignant à nouveau: ");
						String nePrenom = sc.next();

						System.out.print("Date de naissance de l'enseignant à nouveau: ");
						String neDateNaiss = sc.next();

						System.out.print("Matiere de l'enseignant à nouveau: ");
						String neMatiere = sc.next();
						
						System.out.print("Taux horaire de l'enseignant à nouveau: ");
						int neTH = sc.nextInt();
						
						System.out.print("Nombre d'heures de l'enseignant à nouveau: ");
						int neNbH = sc.nextInt();
						
						System.out.print("Code de l'enseignant à nouveau: ");
						String neCode = sc.next();
						
						Enseignant ne1 = new Enseignant(neNom, nePrenom, LocalDate.parse(neDateNaiss, df), neMatiere, neTH, neNbH, neCode);
						personnes.set(i, ne1);
						
						System.out.println("\nModification reussie avec succes.\n"); break;
					} else {
						System.out.println("Aucun enseignant n'a pour code "+a);
					}
				}
			}
		}
	}//Fin methode editPersonne
	
	default public void deletePersonne(String a, int b)//Debut methode deletePersonne
	{
		if(b==1)
		{
			for(int i=0; i<personnes.size(); i++)
			{
				if(personnes.get(i) instanceof Etudiant)
				{
					if( ( ( (Etudiant)personnes.get(i)).getMat()).equals(a) )
					{
						personnes.remove(i);
						System.out.println("\nSuppression reussie avec succes.");
					} else {
						System.out.println("Aucun etudiant n'a pour matricule "+a);
					}
				}
			}
		}
		else if(b==2)
		{
			for(int i=0; i<personnes.size(); i++)
			{
				if(personnes.get(i) instanceof Enseignant)
				{
					if( ( ( (Enseignant)personnes.get(i)).getCodeEnseignant()).equals(a) )
					{
						personnes.remove(i);
						System.out.println("\nSuppression reussie avec succes.");
					} else {
						System.out.println("Aucun enseignant n'a pour code "+a);
					}
				}
			}
		}
	}//Fin methode deletePersonne
	
	default public void affichagePersonnes()//Debut methode affichagePersonnes
	{
		for(Personne p: personnes)
		{
			System.out.println(p+"\n");
		}
		System.out.println("Le nombre de personnes est "+Personne.getNbPersonnes());
	}//Fin methode affichagePersonnes
}
