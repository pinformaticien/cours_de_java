package modeles;

import java.time.LocalDate;

public class Professeur extends Personne {
	private String matiere;
	private int tauxHoraire;
	private int nbHeures;
	private int sal;
	
	public Professeur(String nom, String prenom, LocalDate datenaiss, String matiere, int tauxHoraire, int nbHeures){
		super(nom, prenom, datenaiss);
		this.matiere = matiere;
		this.tauxHoraire = tauxHoraire;
		this.nbHeures = nbHeures;
	}
	
	public Professeur(){
		super();
		this.matiere = "Algo";
		this.tauxHoraire = 10000;
		this.nbHeures = 8;
	}
	
	

	public int getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(int tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public String getMatiere() {
		return matiere;
	}

	public int getNbHeures() {
		return nbHeures;
	}

	public int getSal() {
		sal = tauxHoraire * nbHeures;
		return sal;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" / "+matiere+" / "+tauxHoraire+" / "+getSal()+" ";
	}
	
	public void test2() {
		
	}
	
	
	
}
