package chiara;

public class Smartphone extends Produit{
	//Attributs spécifiques :
	private String marque, modele;

	
	//Créateur de smartphone :
	public Smartphone(int reference, double prix, int annee, String marque, String modele) {
		super(reference,prix,annee);
		this.marque = marque;
		this.modele = modele;
	}
	//toString :
	public String toString() {
		   return "\nSmartphone : " + this.getModele()+"\nMarque : "+ this.getMarque() +"\nAnnee de sortie: "+this.getAnnee()+ "\nPrix : "+this.getPrix();
	}
	//GETTERS & SETTERS :

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}
}
