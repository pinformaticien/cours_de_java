package service;
import main.Main;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


import modele.Enseignant;
import modele.Etudiant;
import modele.Personne;


public class Personnempl implements Ipersonne
{

	@Override
	public void add(int option, Personne p) {
		Main.pr.add(p);
	}

	@Override
	public void Affiche(int option) {
		if(option == 0)
		{
			for (Personne p : Main.pr) 
			{
				if(p instanceof Etudiant)
				{
					System.out.println(p);
				}
			}
		}
		else 
		{
			for (Personne p : Main.pr) 
			{
				if(p instanceof Enseignant)
				{
					System.out.println(p);
				}
			}
		}
		
	}

	@Override
	public void modifier(String critere, int option) {
		Personne p = find(critere, option);
		if(option == 0)
		{
			if(p == null)
			{
				System.out.println("cet etudiant n'existe pas");
			}
			else
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("entrer la nouvelle classe");
				((Etudiant)p).setClasse(sc.nextLine());
				System.out.println("Apres modification");
				System.out.println(p);
			}
		}
		else
		{
			if(p == null)
			{
				System.out.println("cet enseignant n'existe pas");
			}
			else
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("entrer la nouvelle fliere");
				((Enseignant)p).setFliere(sc.nextLine());
				System.out.println("Apres modification");
				System.out.println(p);
			}
		}
	}

	@Override
	public Personne find(String critere, int option) {
		if(option == 0)
		{
			for (Personne p : Main.pr) 
			{
				if(p instanceof Etudiant)
				{
					if(((Etudiant)p).getMat().equals(critere))
					{
						return p;
					}
				}
			}
		}
		else
		{
			for (Personne p : Main.pr) 
			{
				if(p instanceof Enseignant)
				{
					if(((Enseignant)p).getCodeE().equals(critere))
					{
						return p;
					}
				}
			}
		}
		return null;
	}

	@Override
	public void sup(String critere, int option) {
		Personne p = find(critere, option);
		if( option == 0) 
		{
			if(p == null)
			{
				System.out.println("cet Etudiant n'existe pas");
			}
			else
			{
				Main.pr.remove(p);
			}
		}
		else
		{
			if(p == null)
			{
				System.out.println("cet Enseignant n'existe pas");
			}
			else
			{
				Main.pr.remove(p);
			}
		}
		
	}

	@Override
	public void Affiches() {
		Main.pr.forEach(System.out::println);
		
		
	}
	

}
