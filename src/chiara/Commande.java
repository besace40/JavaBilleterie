package chiara;

import java.util.ArrayList;

public class Commande {
	private int nbCommande;
	private double prix;
	public Client client;	

	//Arraylist
	private ArrayList<Produit> Produits = new ArrayList<Produit>();
	
	//Constructeur
	public Commande(int nbCommande, Entreprise e, Client c) {
		this.nbCommande = nbCommande;
		this.client = c;
		e.ajouterCommande(this);
	}
	//toString
	public String toString() {
		return "Numéro de la commande : " + this.nbCommande + 
				"\nPropriétaire de la commande : " + this.getClient().getNom()+
				"\nPrix total commande : " + this.getPrix() + "€";
	}
	//Ajouter produit
	public void ajouterProduit(Produit p) {
		Produits.add(p);
	}
	//GETTER & SETTERS
	public int getNbCommande() {
		return nbCommande;
	}

	public double getPrix() {
		return prix;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
