package chiara;

import java.util.ArrayList;

public class Cd extends Produit{
	//Attributs spécifiques : 
	private String  titre,artiste;
	

	//Créateur de CD : 
	public Cd(int reference, double prix,String titre, Entreprise e, int annee, String artiste) {
		super(reference,prix,annee,e);
		this.titre = titre;
		this.artiste = artiste;
	}
	
	//toString :
	public String toString() {
		   return "\nRéference : "+this.getReference()+ "\nCd : " + this.getTitre()+"\nArtiste : "+ this.getArtiste() +"\nAnnee : "+this.getAnnee()+ "\nPrix : "+this.getPrix();
	}

	//GETTERS & SETTERS :
	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	
}
