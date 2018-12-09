package chiara;

import java.util.ArrayList;

public abstract class Produit {
	//Attributs communs
	private int reference;
	private double prix;
	private int annee;
	
	//Constructeur de produit : 
	public Produit(int reference, double prix,  int annee, Entreprise e) {
		this.reference = reference;
		this.prix = prix;
		this.annee = annee;
		e.ajouterProduit(this);
	}
	
	//Consulter catalogue :
	public void consulterCatalogue() {
		
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
