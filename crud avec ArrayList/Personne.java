

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public abstract class Personne {

	protected String nom;
	protected String prenom;
	protected int age;
	protected LocalDate datenaiss;
	private static int nbPersonnes = 0;
	
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	
	public Personne(String nom, String prenom, LocalDate datenaiss)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		Personne.nbPersonnes += 1;
	}
	
	public Personne(){
		this.nom = "Dia";
		this.prenom = "Pape";
		this.datenaiss = LocalDate.parse("20/09/1996", df);
		Personne.nbPersonnes += 1;
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		age = (int)(ChronoUnit.YEARS.between(this.datenaiss, LocalDate.now()));
		return age;
	}

	public LocalDate getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(LocalDate datenaiss) {
		this.datenaiss = datenaiss;
	}



	public static int getNbPersonnes() {
		return nbPersonnes;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return prenom+" / "+nom+" / "+datenaiss+" / "+getAge()+" ";
	}
	
	
	

}
