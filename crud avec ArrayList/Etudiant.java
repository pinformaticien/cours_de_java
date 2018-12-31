

import java.time.LocalDate;
import java.util.Scanner;


public class Etudiant extends Personne{
	private String mat;
	private String classe;
	
	public  Etudiant(String nom, String prenom, LocalDate datenaiss, String mat, String classe) {
		super(nom, prenom, datenaiss);
		this.mat = mat;
		this.classe = classe;	
	}
	
	public Etudiant(){
		super();
		this.mat = "GL201810";
		this.classe = "Licence";
	}

	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" / "+mat+" / "+classe;
	}
	
	public boolean equals(Etudiant objet) {
		if(objet.nom == this.nom && objet.prenom == this.prenom && objet.datenaiss == this.datenaiss && objet.mat == this.mat && objet.classe == this.classe){
			return true;
		}else {
			return false;
		}
		
	}

	
	
}
