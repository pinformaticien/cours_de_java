package modele;

import java.time.LocalDate;

public class Etudiant extends Personne 
{
	public String mat;
	private float moy;
	private String classe;
	
	public Etudiant() 
		{
			super();
			this.setMat(mat);
			this.setMoy(moy);
			this.setClasse(classe);
		}
	
	public Etudiant(String nom, String prenom, LocalDate datenaiss, String mat, float moy, String classe) 
		{
			super(nom,prenom,datenaiss);
			this.mat = mat;
			this.moy = moy;
			this.classe = classe;
		}

	public String getMat() 
		{
			return mat;
		}
	public void setMat(String mat) 
		{
			this.mat = mat;
		}
	public float getMoy() 
		{
			return moy;
		}
	public void setMoy(float moy) 
		{
			this.moy = moy;
		}
	public String getClasse() 
		{
			return classe;
		}
	public void setClasse(String classe) 
		{
			this.classe = classe;
		}
	
	@Override
	public String toString() 
		{
			return super.toString()+"|"+" Matricule  "+ mat+ "|"+" Moyenne "+moy+"|"+" Classe "+classe;
		}
	
	

}
