package modele;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Personne 
{
	protected String nom;
	protected String prenom;
	protected int age;
	protected LocalDate datenaiss;
	
	public Personne() 
		{
			
		}

	public Personne(String nom, String prenom, LocalDate datenaiss ) 
		{
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.datenaiss = datenaiss;
		}

	public String getNom() 
		{
			return nom;
		}

	public void setNom(String nom) 
		{
			this.nom = nom;
		}

	public String getPrenom() 
		{
			return prenom;
		}

	public void setPrenom(String prenom) 
		{
			this.prenom = prenom;
		}

	public int getAge() 
		{
			return age;
		}

	public LocalDate getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(LocalDate datenaiss) {
		this.datenaiss = datenaiss;
		calculage();
	}

	public void calculage() 
	{
		age = (int) ChronoUnit.YEARS.between(datenaiss, LocalDate.now());
	}

	@Override
	public String toString() 
		{
			return "Nom " + nom +"|"+ " Prenom " + prenom +"|"+" Date naissance "+ datenaiss +"|" + " Age " + age+" ans" ;
		}
	
	

}
