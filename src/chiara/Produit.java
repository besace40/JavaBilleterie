package chiara;

import java.util.ArrayList;

public class Produit {
	//Attributs communs
	private int reference;
	private double prix;
	private int annee;
	

	//Peut appartenir à un panier
	public Panier panier;
	
	//Arraylist de produits :
	private static ArrayList<Livre> Livres = new ArrayList<Livre>();
	private static ArrayList<Cd> Cds = new ArrayList<Cd>();
	private static ArrayList<Jeu> Jeux = new ArrayList<Jeu>();
	private static ArrayList<Smartphone> Smartphones = new ArrayList<Smartphone>();


	
	//Constructeur de produit : 
	public Produit(int reference, double prix,  int annee) {
		this.reference = reference;
		this.prix = prix;
		this.annee = annee;
		
		if (this instanceof Livre){
			Livres.add((Livre) this);
		}
		else if(this instanceof Cd) {
			Cds.add((Cd) this);
			
		}else if(this instanceof Jeu) {
			Jeux.add((Jeu) this);
		}else 
			Smartphones.add((Smartphone) this);
	}
	
		
	//GETTERS & SETTERS
	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
