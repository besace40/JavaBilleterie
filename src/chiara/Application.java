package chiara;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//CREATION D'ENTREPRISE
		Entreprise e1 = new Entreprise("FNAC");
		
		
		//CREATION DE CLIENTS : 
		Client client1 = new Client("Nava","Diego","Louis armand", e1);
		Client client2 = new Client("Celano","Chiara","La montagnette",e1);
		Client client3 = new Client("Alberer","Léo","Chemin de l'abbaye",e1);
		
		//CREATION DE PRODUITS :
		Jeu jeu1 = new Jeu(365478,59.99,2018,e1,"Super smash","Nintendo");
		Jeu jeu2 = new Jeu(784524,59.99,2017,e1,"Zelda","Nintendo");
		
		Livre livre1 = new Livre(125423,12.00,"Harry potter 1",e1,1998,"JK rowling",111111);
		Livre livre2 = new Livre(125423,15.00,"Harry potter 2",e1,2000,"JK rowling",222222);

		Cd cd1 = new Cd(1565221,9.99,"Mothership",e1,1987,"Led zeppelin");
		Cd cd2 = new Cd(6998784,7.99,"Lithium",e1,1990,"Nirvana");
		
		Smartphone sp1 = new Smartphone(4444,299.99,2016,e1,"Apple","iphone8");
		Smartphone sp2 = new Smartphone(476578,99.99,2016,e1,"Samsung","GalaxyS9");
		
		//TEST DES GET PRODUIT
		System.out.println(sp2.getModele());
		System.out.println(sp1.getReference());
		System.out.println(cd1.getPrix());
		System.out.println(cd2.getAnnee());
		System.out.println(livre1.getIsbn());
		System.out.println(livre2.getAuteur());
		System.out.println(jeu1.getStudio());
		System.out.println(jeu2.getTitre());
		
		//TEST DES GET CLIENT
		System.out.println(client1.getNom());
		System.out.println(client2.getPrenom());
		System.out.println(client3.getAdresse());
		
		//TEST CATALOGUE
		e1.listerCatalogue();
		
		//TEST LISTE CLIENT
		e1.listerClient();
		
		//TEST PANIER
		
	client1.ajouterProduit(cd1);
	client1.ajouterProduit(livre1);
	client1.ajouterProduit(jeu2);
	client1.supprimerProduit(jeu2);	
	client1.validerPanier(e1);
	
	client1.ajouterProduit(cd2);
	client1.validerPanier(e1);
	
		//TEST LISTE COMMANDES
	e1.listerCommandes();
		
	}
	
}
