package chiara;

import java.util.ArrayList;

public class Jeu extends Produit{
	//Attributs spécifiques : 
	private String titre,studio;

	//Créateur de jeux : 
	public Jeu(int reference, double prix, int annee,Entreprise e, String titre,  String studio) {
		super(reference,prix,annee, e);
		this.titre = titre;
		this.studio = studio;
	}
	//toString :
	public String toString() {
		   return "\nRéference : "+this.getReference()+ "\nJeu : " + this.getTitre()+"\nStudio : "+ this.getStudio() +"\nAnnee : "+this.getAnnee()+ "\nPrix : "+this.getPrix();
	}
	//GETTER & SETTERS : 
	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	
}
