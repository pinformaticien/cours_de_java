package modeles;



import java.time.LocalDate;

public class Enseignant extends Personne {
	private String matiere;
	private int tauxHoraire;
	private int nbHeures;
	private int sal;
	private String codeEnseignant;
	
	public Enseignant(String nom, String prenom, LocalDate datenaiss, String matiere, int tauxHoraire, int nbHeures, String codeEnseignant){
		super(nom, prenom, datenaiss);
		this.matiere = matiere;
		this.tauxHoraire = tauxHoraire;
		this.nbHeures = nbHeures;
		this.codeEnseignant = codeEnseignant;
	}
	
	public Enseignant(){
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
	
	public String getCodeEnseignant() {
		return codeEnseignant;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" / "+matiere+" / "+tauxHoraire+" / "+getSal()+" ";
	}
	
	public boolean equals(Enseignant objet) {
		if(objet.nom == this.nom && objet.prenom == this.prenom && objet.datenaiss == this.datenaiss && objet.matiere == this.matiere && objet.tauxHoraire == this.tauxHoraire && objet.nbHeures == this.nbHeures && objet.codeEnseignant == this.codeEnseignant){
			return true;
		}else {
			return false;
		}
		
	}


	
	
	
}
