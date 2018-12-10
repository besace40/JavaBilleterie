package chiara;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Client {
	private String nom, prenom, adresse;
	public Entreprise e;
	
	//Arraylist
	private ArrayList<Commande> Commandes = new ArrayList<Commande>();
	private ArrayList<Produit> Panier = new ArrayList<Produit>();

	//Créateur de clients
	public Client(String nom, String prenom, String adresse, Entreprise e) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		e.ajouterClient(this);
	}
	//Méthodes panier :
	public void ajouterProduit(Produit p) {
		Panier.add(p);
		System.out.println("Le produit "+ p.getReference() + " a été ajouté au panier du client "+ this.getNom());
	}
	
	public void supprimerProduit(Produit p) {
		Panier.remove(p);
		System.out.println("Le produit "+ p.getReference() + " a été supprimé du panier du client "+this.getNom());
	}
	
	public void validerPanier(Entreprise e){
		
		int rand = ThreadLocalRandom.current().nextInt(1, 1001); // Genere nombre aléatoire de commande
		Commande c = new Commande(rand,e);
		for (Produit p : Panier) {
			c.ajouterProduit(p);
		}
		double somme = 0;
		for (Produit p : Panier) {  //Calcul du montant total de la commande
			somme += p.getPrix();
		}
		
		Panier.clear(); //On vide le panier lors de sa validation
		System.out.println("La commande du client "+this.getNom()+" a été créée et a pour numéro de commande : " + rand);
		System.out.println("Le prix de la commande est de " + somme +"€" );
	}
	
	public void passerCommande(Commande c) {
		System.out.println("La commande " + c.getNbCommande() + "est passée");
	}
	 
	

	//toString :
	public String toString() {
		   return "\nClient : "+this.getPrenom()+" "+ this.getNom()+"\nAdresse : " + this.getAdresse();
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
