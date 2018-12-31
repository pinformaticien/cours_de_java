

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		
		//L'objet Student

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		
		ArrayList<Professeur> enseignants = new ArrayList<Professeur>();
		
		int choix1, choix2;

		Main1 menu = new Main1();

		do {
			System.out.println("1-Ajouter une personne");
			System.out.println("2-Rechercher une personne");
			System.out.println("3-Modifier une personne");
			System.out.println("4-Supprimer une personne");
			System.out.println("5- Quitter le programme");

			System.out.print("Faites votre choix: ");
			choix1 = sc.nextInt();
			if(choix1==5){
				System.out.println("Bye bye ");
				break;
			}
			switch(choix1){
				case 1: //premier cas Ajout
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					menu.ajoutPersonne();
					choix1 = menu.saisiChoix();
					if(choix1 == 3){
						/*for(int i=0; i<50; i++){
							System.out.println("");
						}*/
						break;
					}
					switch(choix1){
						case 1:// sous premier cas de premier cas
							System.out.print("Nom de l'etudiant: ");
							String eNom = sc.next();

							System.out.print("Prenom de l'etudiant: ");
							String ePrenom = sc.next();

							System.out.print("Date de naissance de l'etudiant: ");
							String eDateNaiss = sc.next();

							System.out.print("Matricule de l'etudiant: ");
							String eMat = sc.next();

							System.out.print("Classe de l'etudiant: ");
							String eClasse = sc.next();

							Etudiant e1 = new Etudiant(eNom, ePrenom, LocalDate.parse(eDateNaiss, df), eMat, eClasse);
							
							etudiants.add(e1);
							//System.out.println(etudiants.get(0));


							break;
						case 2:// sous deuxieme cas de premier cas
							System.out.print("Nom de l'enseignant: ");
							String eENom = sc.next();

							System.out.print("Prenom de l'enseignant: ");
							String eEPrenom = sc.next();

							System.out.print("Date de naissance de l'enseignant: ");
							String eEDateNaiss = sc.next();

							System.out.print("Matiere de l'enseignant: ");
							String eMatiere = sc.next();

							System.out.print("Taux horaire de l'enseignant: ");
							int eTH = sc.nextInt();

							System.out.print("Nombre d'heures de l'enseignant: ");
							int eNbH = sc.nextInt();

							System.out.print("Code de l'enseignant: ");
							String eCode = sc.next();

							Professeur e2 = new Professeur(eENom, eEPrenom, LocalDate.parse(eEDateNaiss, df), eMatiere, eTH, eNbH, eCode);

							enseignants.add(e2);
							break;
					}
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					break;
				case 2://deuxieme cas Recherche 
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					menu.recherchePersonne();
					choix1 = menu.saisiChoix();
					if(choix1 == 3){
						/*for(int i=0; i<50; i++){
							System.out.println("");
						}*/
						break;
					}
					switch(choix1){
						case 1: // sous premier cas de deuxieme cas
							System.out.print("Nom de l'etudiant: ");
							String eNom = sc.next();

							System.out.print("Prenom de l'etudiant: ");
							String ePrenom = sc.next();

							System.out.print("Date de naissance de l'etudiant: ");
							String eDateNaiss = sc.next();

							System.out.print("Matricule de l'etudiant: ");
							String eMat = sc.next();

							System.out.print("Classe de l'etudiant: ");
							String eClasse = sc.next();

							Etudiant e1 = new Etudiant(eNom, ePrenom, LocalDate.parse(eDateNaiss, df), eMat, eClasse);
							for(int i=0; i<etudiants.size(); i++){
								if(e1.equals(etudiants.get(i))){
									System.out.println("L'etudiant dont tu cherches est: "+etudiants.get(i)); break;
								}
								else{
									System.out.println("Ooops desole l'etudiant dont tu cherches ne figure pas sur notre liste...");
								}
							}
							break;
						case 2://sous deuxieme cas de deuxieme cas
							System.out.print("Nom de l'enseignant: ");
							String eENom = sc.next();

							System.out.print("Prenom de l'enseignant: ");
							String eEPrenom = sc.next();

							System.out.print("Date de naissance de l'enseignant: ");
							String eEDateNaiss = sc.next();

							System.out.print("Matiere de l'enseignant: ");
							String eMatiere = sc.next();

							System.out.print("Taux horaire de l'enseignant: ");
							int eTH = sc.nextInt();

							System.out.print("Nombre d'heures de l'enseignant: ");
							int eNbH = sc.nextInt();

							System.out.print("Code de l'enseignant: ");
							String eCode = sc.next();

							Professeur e2 = new Professeur(eENom, eEPrenom, LocalDate.parse(eEDateNaiss, df), eMatiere, eTH, eNbH, eCode);
							for(int i=0; i<etudiants.size(); i++){
								if(e2.equals(enseignants.get(i))){
									System.out.println("L'enseignant dont tu cherches est: "+enseignants.get(i));
								}
								else{
									System.out.println("Ooops desole l'enseignant dont tu cherches ne figure pas sur notre liste...");
								}
							}

							break;
					}
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					break;
				case 3://troisieme cas Modification
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					menu.modifierPersonne();
					choix1 = menu.saisiChoix();
					if(choix1 == 3){
						/*for(int i=0; i<50; i++){
							System.out.println("");
						}*/
						break;
					}
					switch(choix1){
						case 1: // sous premier cas de troisieme cas
							if(etudiants.size() == 0){
								System.out.println("Notre liste d'etudiants est vide...");
							}
							else{
								System.out.print("Nom de l'etudiant a modifier: ");
								String eNom = sc.next();

								System.out.print("Prenom de l'etudiant a modifier: ");
								String ePrenom = sc.next();

								System.out.print("Date de naissance de l'etudiant a modifier: ");
								String eDateNaiss = sc.next();

								System.out.print("Matricule de l'etudiant a modifier: ");
								String eMat = sc.next();

								System.out.print("Classe de l'etudiant a modifier: ");
								String eClasse = sc.next();

								Etudiant e1 = new Etudiant(eNom, ePrenom, LocalDate.parse(eDateNaiss, df), eMat, eClasse);
								for(int i=0; i<etudiants.size(); i++){
									if(e1.equals(etudiants.get(i)) == true){
										System.out.print("Nom de l'etudiant nouveau: ");
										String neNom = sc.next();

										System.out.print("Prenom de l'etudiant nouveau: ");
										String nePrenom = sc.next();

										System.out.print("Date de naissance de l'etudiant nouveau: ");
										String neDateNaiss = sc.next();

										System.out.print("Matricule de l'etudiant nouveau: ");
										String neMat = sc.next();

										System.out.print("Classe de l'etudiant nouveau: ");
										String neClasse = sc.next();

										Etudiant ne1 = new Etudiant(neNom, nePrenom, LocalDate.parse(neDateNaiss, df), neMat, neClasse);
										etudiants.set(i, ne1);
										System.out.println("\nModification reussie avec succes.\n");
									}
									else{
										System.out.println("Desole l'etudiant dont vous souhaitez modifier les donnees n'existe pas");
									}
								}
							}
							break;
						case 2:// sous deuxieme cas de troisieme cas
							if(enseignants.size() == 0){
								System.out.println("Notre liste d'enseignants est vide");
							}
							else{
								System.out.print("Nom de l'enseignant a modifier: ");
								String eENom = sc.next();

								System.out.print("Prenom de l'enseignant a modifier: ");
								String eEPrenom = sc.next();

								System.out.print("Date de naissance de l'enseignant a modifier: ");
								String eEDateNaiss = sc.next();

								System.out.print("Matiere de l'enseignant a modifier: ");
								String eMatiere = sc.next();

								System.out.print("Taux horaire de l'enseignant a modifier: ");
								int eTH = sc.nextInt();

								System.out.print("Nombre d'heures de l'enseignant a modifier: ");
								int eNbH = sc.nextInt();

								System.out.print("Code de l'enseignant a modifier: ");
								String eCode = sc.next();

								Professeur e2 = new Professeur(eENom, eEPrenom, LocalDate.parse(eEDateNaiss, df), eMatiere, eTH, eNbH, eCode);

								for(int i=0; i<enseignants.size(); i++){
									if(e2.equals(enseignants.get(i)) == true){
										System.out.print("Nom de l'enseignant nouveau: ");
										String neENom = sc.next();

										System.out.print("Prenom de l'enseignant nouveau: ");
										String neEPrenom = sc.next();

										System.out.print("Date de naissance de l'enseignant nouveau: ");
										String neEDateNaiss = sc.next();

										System.out.print("Matiere de l'enseignant nouveau: ");
										String neMatiere = sc.next();

										System.out.print("Taux horaire de l'enseignant nouveau: ");
										int neTH = sc.nextInt();

										System.out.print("Nombre d'heures de l'enseignant nouveau: ");
										int neNbH = sc.nextInt();

										System.out.print("Code de l'enseignant nouveau: ");
										String neCode = sc.next();

										Professeur ne2 = new Professeur(neENom, neEPrenom, LocalDate.parse(neEDateNaiss, df), neMatiere, neTH, neNbH, neCode);
										enseignants.set(i, ne2);
									}
									else{
										System.out.println("Desole l'enseignant dont vous souhaitez modifier les donnees n'existe pas");
									}
								}
							}
							break;
					}
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					break;
				case 4://quatrieme cas Suppression
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					menu.supprimerPersonne();
					choix1 = menu.saisiChoix();
					if(choix1 == 3){
						/*for(int i=0; i<50; i++){
							System.out.println("");
						}*/
						break;
					}
					switch(choix1){
						case 1:// sous premier cas de quatrieme cas
							if(etudiants.size() == 0){
								System.out.println("Notre liste d'etudiants est vide...");
							}
							else{
								System.out.print("Nom de l'etudiant a supprimer: ");
								String eNom = sc.next();

								System.out.print("Prenom de l'etudiant a supprimer: ");
								String ePrenom = sc.next();

								System.out.print("Date de naissance de l'etudiant a supprimer: ");
								String eDateNaiss = sc.next();

								System.out.print("Matricule de l'etudiant a supprimer: ");
								String eMat = sc.next();

								System.out.print("Classe de l'etudiant a supprimer: ");
								String eClasse = sc.next();

								Etudiant e1 = new Etudiant(eNom, ePrenom, LocalDate.parse(eDateNaiss, df), eMat, eClasse);

								for(int i=0; i<etudiants.size(); i++){
									if(e1.equals(etudiants.get(i)) == true){
										etudiants.remove(i); break;
									}
									else{
										System.out.println("Desole cet etudiant n'existe pas...");
									}
								}
							}
							
							
							break;
						case 2:// sous deuxieme cas de quatrieme cas
							if(enseignants.size() == 0){
								System.out.println("Notre liste d'enseignants est vide...");
							}
							else{
									System.out.print("Nom de l'enseignant a supprimer: ");
								String eENom = sc.next();

								System.out.print("Prenom de l'enseignant a supprimer: ");
								String eEPrenom = sc.next();

								System.out.print("Date de naissance de l'enseignant a supprimer: ");
								String eEDateNaiss = sc.next();

								System.out.print("Matiere de l'enseignant a supprimer: ");
								String eMatiere = sc.next();

								System.out.print("Taux horaire de l'enseignant a supprimer: ");
								int eTH = sc.nextInt();

								System.out.print("Nombre d'heures de l'enseignant a supprimer: ");
								int eNbH = sc.nextInt();

								System.out.print("Code de l'enseignant a supprimer: ");
								String eCode = sc.next();

								Professeur e2 = new Professeur(eENom, eEPrenom, LocalDate.parse(eEDateNaiss, df), eMatiere, eTH, eNbH, eCode);

								for(int i=0; i<enseignants.size(); i++){
									if(e2.equals(enseignants.get(i)) == true){
										etudiants.remove(i); break;
									}
									else{
										System.out.println("Desole cet enseignant n'existe pas...");
									}
								}
							}

							break;
					}
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					break;
				default:
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					System.out.println("Choix incorrect...");
					/*for(int i=0; i<50; i++){
						System.out.println("");
					}*/
					break;

			}
		} while (choix1 != 5);
		
		
		//L'objet Professor
		
		//Etudiant obj1 = new Etudiant("Gassama", "Sanoussy", LocalDate.parse("20/09/1996", df), "GL201810", "Licence");
		//Etudiant et1 = new Etudiant();
		//System.out.println(et1.toString());
		
		
		//Professeur obj2 = new Professeur("Diaby", "Mouhamadou", LocalDate.parse("10/10/1995", df), "Algo", 5000, 4);
		//Professeur et2 = new Professeur();
		//System.out.println(et2.toString());
		
		//System.out.println("Le nombre de personnes instancies est: "+Personne.getNbPersonnes());	
	}

	private int saisiChoix(){
		Scanner clavier = new Scanner(System.in);
		int a;
		System.out.print("Faites votre choix: ");
		a = clavier.nextInt();
		
		return a;
	}
	
	private void ajoutPersonne() {
		System.out.println("1-Ajouter un etudiant");
		System.out.println("2-Ajouter un enseignant");
		System.out.println("3-Retour au menu principal");
	}

	private void recherchePersonne() {
		System.out.println("1-rechercher un etudiant");
		System.out.println("2-rechercher un enseignant");
		System.out.println("3-Retour au menu principal");
	}

	private void modifierPersonne() {
		System.out.println("1-modifier un etudiant");
		System.out.println("2-modifier un enseignant");
		System.out.println("3-Retour au menu principal");
	}

	private void supprimerPersonne() {
		System.out.println("1-supprimer un etudiant");
		System.out.println("2-supprimer un enseignant");
		System.out.println("3-Retour au menu principal");
	}

	




}
