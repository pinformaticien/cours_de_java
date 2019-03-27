package modele;

import java.time.LocalDate;

public class Enseignant extends Personne 
{
	private String codeE;
	private String fliere;
	
	public Enseignant()
		{
			super();
			this.setCodeE(codeE);
			this.setFliere(fliere);
		}

	public Enseignant(String nom, String prenom, LocalDate datenaiss, String codeE, String fliere) 
		{
			super(nom, prenom, datenaiss);
			this.codeE=codeE;
			this.fliere=fliere;
		}

	public String getCodeE() {
		return codeE;
	}

	public void setCodeE(String codeE) {
		this.codeE = codeE;
	}

	public String getFliere() {
		return fliere;
	}

	public void setFliere(String fliere) {
		this.fliere = fliere;
	}
	
	@Override
	public String toString() {
		return super.toString()+"|"+" Code Enseignant "+codeE+"|"+" Fliere "+fliere;
	}
		
	

}
