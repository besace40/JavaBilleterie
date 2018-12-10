package chiara;

import java.util.ArrayList;

public class Entreprise {
	private String nom;
	
		//Arraylist qui contient tout les clients
		private static ArrayList<Client> Clients = new ArrayList<Client>();
		//Arraylist qui contient tout les produits crées
		private static ArrayList<Produit> Produits = new ArrayList<Produit>();
		//Arraylist qui contient toutes les commandes créées
		private static ArrayList<Commande> Commandes = new ArrayList<Commande>();
		
		//Méthode ajouter le client à l'arraylist
		public void ajouterClient(Client c) {
			Clients.add(c);
		}
		
		//Créateur d'entreprise
		public Entreprise(String nom) {
			this.nom = nom;
		}
	
		
		//Methode ajouter produit à l'arraylist
		public void ajouterProduit(Produit p) {
			Produits.add(p);
		}
		
		//Methode ajouter commande à l'arraylist
		public void ajouterCommande(Commande c) {
			Commandes.add(c);
		}
		
		
		//Lister les produits :
		public void listerCatalogue() {
			for (Produit p : Produits) {
				System.out.println(p.toString());
			}
		}
		//Liste client
		public void listerClient() {
			for (Client c : Clients) {
				System.out.println(c.toString());
			}
		}
		//Liste commandes 
		public void listerCommandes() {
			for (Commande c : Commandes) {
				System.out.println(c.toString());
			}
		}
}
