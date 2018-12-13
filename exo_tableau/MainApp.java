import java.util.*;

class MainApp{
	public static void main(String[] args) {
		
		Pro obj = new Pro();
		obj.saisi();
		obj.affiche();
		obj.tabDeux();

	}
}

class Pro{

		public Scanner sc = new Scanner(System.in);
		public String tabProduits[] = new String[10];
		public int tabPrixProduits[] = new int[10];
		public int som = 0;
		public String tabTrier[] = new String[10];
		public String tab[][] = new String[10][3];
		final double TVA = 0.186;

		public void saisi(){
			for(int i=0; i<tabProduits.length; i++){
				System.out.print("Entrer le nom du produit "+i+": ");
				tabProduits[i] = sc.next();
				System.out.print("Entrer le prix du produit "+i+": ");
				tabPrixProduits[i] = sc.nextInt();
				System.out.print("\n");
			}
		}
		
		public void affiche(){
			for(int i=0; i<tabPrixProduits.length; i++){
				System.out.print(tabProduits[i]+": "+tabPrixProduits[i]+"\n");
				som += tabPrixProduits[i];
				if(i==(tabPrixProduits.length-1))
					{
						System.out.println("\n\nLa moyenne des prix est: "+(som/tabPrixProduits.length)+"\n\n");
					}
			}
		}

		public void tabDeux(){
			for(int i=0; i<10; i++){
				for(int j=0; j<3; j++){
					tab[i][j] = tabProduits[i];
					j++;
					tab[i][j] = String.valueOf(tabPrixProduits[i]);
					j++;
					tab[i][j] = String.valueOf(TVA);
				}
			}

			for(int i=0; i<10; i++){
				for(int j=0; j<3; j++){
					System.out.print(tab[i][j]+"\t"); j++;
					System.out.print(tab[i][j]+"\t"); j++;
					System.out.print(tab[i][j]+"\n\n");
				}
			}
		}
}