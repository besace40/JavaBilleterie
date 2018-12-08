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
	private ArrayList<Produit> Produits = new ArrayList<Produit>();

	
	//Constructeur de produit : 
	public Produit(int reference, double prix,  int annee) {
		this.reference = reference;
		this.prix = prix;
		this.annee = annee;
		Produits.add(this); //Quand un produit est créée, il est ajouté dans l'arraylist des produits
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
