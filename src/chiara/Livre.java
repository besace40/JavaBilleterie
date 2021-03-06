package chiara;

import java.util.ArrayList;

public class Livre extends Produit{
	//Attributs spécifiques : 
	private String titre;
	private String auteur;
	private int isbn;
	

	//Créateur de livre : 
	public Livre(int reference, double prix, String titre,Entreprise e, int annee, String auteur, int isbn) {
		super(reference,prix,annee,e );
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
	}
	
	//toString :
	public String toString() {
		   return "\nRéference : "+this.getReference()+ "\nLivre : " + this.getTitre()+"\nAuteur : "+ this.getAuteur() +"\nAnnee : "+this.getAnnee()+ "\nPrix : "+this.getPrix();
	}
	
	//GETTERS & SETTERS :
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
}
