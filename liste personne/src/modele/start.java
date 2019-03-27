package modele;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class start {

	public static void main(String[] args) 
	{
		List<Personne> pr= new ArrayList<Personne>();
		int choix;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("***** MENU *****");
			System.out.println("1 Ajouter une Personne");
			System.out.println("2 Afficher une Personne");
			System.out.println("3 Modifier une Personne");
			System.out.println("4 Recherche une Personne");
			System.out.println("5 Supprimer une Personne ");
			System.out.println("6 Quitter \n");
			
			System.out.println("faites votre choix !!!");
			choix = sc.nextInt();
			Etudiant et = new Etudiant();
			Enseignant en = new Enseignant();
			int choix1;
			Scanner ett= new Scanner(System.in);
			Scanner enn= new Scanner(System.in);
			switch (choix) 
				{
					case 1:
					{
						System.out.println("1 Ajouter un Etudiant ");
						System.out.println("2 Ajouter un Enseignant \n");
						
						System.out.println("faite votre choix ");
						choix1 = sc.nextInt();
						if(choix1 == 1)
							{
								
								System.out.println("entrer le nom");
								et.setNom(ett.next());
								System.out.println("entrer le prenom");
								et.setPrenom(ett.next());
								System.out.println("entrer la date de naissance jj/mm/aaaa ");
								DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
								et.setDatenaiss(LocalDate.parse(ett.next(), dt));
								System.out.println("entrer la Matricule");
								et.setMat(ett.next());
								System.out.println("entrer la classe");
								et.setClasse(ett.next());
								System.out.println("entrer la moyenne ");
								et.setMoy(ett.nextFloat());
								pr.add(et);

							}
						else if (choix1 == 2)
								{
									
									System.out.println("entrer le nom");
									en.setNom(enn.next());
									System.out.println("entrer le prenom");
									en.setPrenom(enn.next());
									System.out.println("entrer la date de naissance ");
									DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
									en.setDatenaiss(LocalDate.parse(enn.next(), dt));
									System.out.println("entrer le code ");
									en.setCodeE(enn.next());
									System.out.println("entrer la fliere");
									en.setFliere(enn.next());
									pr.add(en);
								}
						break;
					}
					case 2:
					{
						System.out.println("1 Afficher un Etudiant ");
						System.out.println("2 Afficher un Enseignant \n");
						
						System.out.println("faite votre choix ");
						choix1 = sc.nextInt();
						if(choix1 == 1)
						{
							for(Personne p : pr)
							{
								if (p instanceof Etudiant) 
								{
									System.out.println(p);
								}
							}
						}
						else if(choix1 == 2)
						{
							for(Personne p : pr)
							{
								if (p instanceof Enseignant) 
								{
									System.out.println(p);
								}
							}
						}
						break;
					}
					case 3:
					{
						Scanner mo = new Scanner(System.in);
						System.out.println("1 Modifier un Etudiant ");
						System.out.println("2 Modifier un Enseignant \n");
						
						System.out.println("faite votre choix ");
						choix1 = sc.nextInt();
						if(choix1 == 1)
						{
							String m;
							System.out.println("entrer la matricule de l'etudiant que vous voulez modifier ");
							m = ett.next();
							for(Personne md : pr)
							{
								if (md instanceof Etudiant) 
								{
									if(((Etudiant) md).getMat().compareTo(m)==0)
									{
										String nnom,nprenom,nmat,nclasse;
										float nmoy;
										LocalDate  ndatenaiss;
										System.out.println("modifier le nom");
										nnom=mo.next();
										md.setNom(nnom);
										System.out.println("Modifier le prenom");
										nprenom=mo.next();
										md.setPrenom(nprenom);
										System.out.println("Modifier la matricule");
										nmat=mo.next();
										((Etudiant) md).setMat(nmat);
										System.out.println("Modifier la date de naissance jj/mm/aaaa ");
										DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
										ndatenaiss=LocalDate.parse(mo.next(), dt);
										md.setDatenaiss(ndatenaiss);
										System.out.println("modifier la classe");
										nclasse=mo.next();
										((Etudiant) md).setClasse(nclasse);
										System.out.println("modifier la moyenne");
										nmoy=mo.nextFloat();
										((Etudiant) md).setMoy(nmoy);
									}
								}
							}
						}
						else if(choix1 == 2)
							{
								String e;
								System.out.println("entrer le code de l'enseignant que vous voulez modifier ");
								e = enn.next();
								for(Personne md : pr)
								{
									if (md instanceof Enseignant) 
									{
										if(((Enseignant) md).getCodeE().compareTo(e)==0)
										{
											String nnom,nprenom,ncode,nfliere;
											LocalDate  ndatenaiss;
											System.out.println("modifier le nom");
											nnom=mo.next();
											md.setNom(nnom);
											System.out.println("Modifier le prenom");
											nprenom=mo.next();
											md.setPrenom(nprenom);
											System.out.println("Modifier la date de naissance jj/mm/aaaa ");
											DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
											ndatenaiss=LocalDate.parse(mo.next(), dt);
											md.setDatenaiss(ndatenaiss);
											System.out.println("Modifier la code");
											ncode=mo.next();
											((Enseignant) md).setCodeE(ncode);
											System.out.println("modifier la fliere");
											nfliere=mo.next();
											((Enseignant) md).setFliere(nfliere);	
									}
								}
							}
						
							}
						break;		
					}
					case 4:
					{
						System.out.println("1 Rechercher un Etudiant ");
						System.out.println("2 rechercher un Enseignant \n");
						
						System.out.println("faite votre choix ");
						choix1 = sc.nextInt();
						if(choix1 == 1)
						{
							String m;
							System.out.println("entrer la matricule de l'etudiant");
							m = ett.next();
							for (Personne p : pr) 
							{
								if(p instanceof Etudiant)
								{
									if(((Etudiant) p).getMat().compareTo(m)==0)
									{
										System.out.println(p);
										
									}
								}
								else
								{
									System.out.println("l'etudiant que vous recherchez n'existe pas !!!");
								}
							}
						}
						else if(choix1 == 2)
						{
							String e;
							System.out.println("entrer le code de l'enseignant que vous voulez modifier ");
							e = enn.next();
							for (Personne p : pr) 
							{
								if(p instanceof Enseignant)
								{
									if(((Enseignant) p).getCodeE().compareTo(e)==0)
									{
										System.out.println(p);
										
									}
								}
								else
								{
									System.out.println("l'enseigant que vous recherchez n'existe pas !!!");
								}
							}
							
						}
						break;
					}
					case 5:
					{
						System.out.println("1 Supprimer un Etudiant ");
						System.out.println("2 Supprimer un Enseignant \n");
						
						System.out.println("faite votre choix ");
						choix1 = sc.nextInt();
						if(choix1 == 1)
						{
							String m;
							System.out.println("entrer la matricule de l'etudiant à supprimer");
							m = ett.next();
							for (int i = 0; i < pr.size(); i++) {
								Etudiant e =(Etudiant) pr.get(i);
								if(e.getMat().equals(m))
								{
									pr.remove(e);
								}
								
							}
							
						}
						else if (choix1 == 2)
						{
							String e;
							System.out.println("entrer le code de l'enseignant que vous voulez supprimer ");
							e = enn.next();
							for (int i = 0; i < pr.size(); i++) 
							{
								Enseignant n = (Enseignant) pr.get(i);
								if(n.getCodeE().equals(e)) 
								{
									pr.remove(n);
								}
							}
						}
						break;
					}
					case 6:
					{
						System.out.println("Merci à la prochaine");
					}
					default:
						System.out.println("EURREUR mauvaise choix !!!");
						break;
				}
		}
		while(choix != 6);

	}

}
