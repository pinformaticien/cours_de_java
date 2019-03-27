package service;

import modele.Enseignant;
import modele.Etudiant;
import modele.Personne;

public interface Ipersonne 
{
	  public void add(int option, Personne p);
		
	public void Affiche(int option );
		
	public void modifier(String critere, int option);
		
		
	public Personne find(String critere, int option );
		
	
	 public void sup(String critere, int option );
		

	public  void Affiches();
	

}
