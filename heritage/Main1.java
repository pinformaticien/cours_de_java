package modeles;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		//L'objet Student
		
		
		
		//L'objet Professor
		
		//Etudiant obj1 = new Etudiant("Gassama", "Sanoussy", LocalDate.parse("20/09/1996", df), "GL201810", "Licence");
		Etudiant et1 = new Etudiant();
		System.out.println(et1.toString());
		
		
		//Professeur obj2 = new Professeur("Diaby", "Mouhamadou", LocalDate.parse("10/10/1995", df), "Algo", 10000, 4);
		Professeur et2 = new Professeur();
		System.out.println(et2.toString());
		
		System.out.println("Le nombre de personnes instancies est: "+Personne.getNbPersonnes());
		
	}

}
