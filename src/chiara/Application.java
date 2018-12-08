package chiara;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CREATION DE CLIENTS : 
		Client client1 = new Client("Nava","Diego","Louis armand");
		Client client2 = new Client("Cerano","Chiara","La montagnette");
		Client client3 = new Client("Alberer","Léo","Chemin de l'abbaye");
		
		//CREATION DE PRODUITS :
		Jeu jeu1 = new Jeu(365478,59.99,"Super smash",2018,"Nintendo");
		Jeu jeu2 = new Jeu(784524,59.99,"Zelda",2017,"Nintendo");
		
		Livre livre1 = new Livre(125423,12.00,"Harry potter 1",1998,"JK rowling",111111);
		Livre livre2 = new Livre(125423,15.00,"Harry potter 2",2000,"JK rowling",222222);

		Cd cd1 = new Cd(1565221,9.99,"Mothership",1987,"Led zeppelin");
		Cd cd2 = new Cd(6998784,7.99,"Lithium",1990,"Nirvana");
		
		Smartphone sp1 = new Smartphone(4444,299.99,2016,"Apple","iphone8");
		Smartphone sp2 = new Smartphone(476578,99.99,2016,"Samsung","GalaxyS9");
		
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
		
		//TEST DES TOSTRING 
		
//		System.out.println(livre1.toString());
//		System.out.println(sp1.toString());
//		System.out.println(jeu1.toString());
//		System.out.println(cd1.toString());
		
		
	}
	
}
