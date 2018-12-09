package chiara;

import java.util.ArrayList;

public class Commande {
	private int nbCommande;
	private double prix;
	public Client client;	
	public Entreprise e;
	
	//Arraylist
	private ArrayList<Produit> Produits = new ArrayList<Produit>();
	
	//Constructeur
	public Commande(int NumeroCommande) {
		this.nbCommande = nbCommande;
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

}
