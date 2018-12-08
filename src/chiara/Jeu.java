package chiara;

public class Jeu extends Produit{
	//Attributs spécifiques : 
	private String titre,studio;
	
	//Créateur de jeux : 
	public Jeu(int reference, double prix,String titre, int annee, String studio) {
		super(reference,prix,annee);
		this.titre = titre;
		this.studio = studio;
	}
	//toString :
	public String toString() {
		   return "\nJeu : " + this.getTitre()+"\nStudio : "+ this.getStudio() +"\nAnnee : "+this.getAnnee()+ "\nPrix : "+this.getPrix();
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
