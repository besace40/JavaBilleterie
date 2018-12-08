package chiara;

import java.util.ArrayList;


public class Client {
	private String nom, prenom;
	private String adresse;
	public Panier panier; // Un client à un panier
	
	//Arraylist
	private ArrayList<Commande> Commandes = new ArrayList<Commande>();

	//Créateur de clients
	public Client(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	//Méthodes :
	public void consulterCatalogue() {
	}
	public void ajouterProduit(Produit p) {
		//TODO 
	}
	
	//GETTERS & SETTERS
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<Commande> getCommandes() {
		return Commandes;
	}
	


}
