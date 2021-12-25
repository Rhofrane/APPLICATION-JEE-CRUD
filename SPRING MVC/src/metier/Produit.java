package metier;

import java.io.Serializable;

public class Produit implements Serializable {
	private String reference;
	private String deseignation;
	private double prix;
	private int quantite;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDeseignation() {
		return deseignation;
	}
	public void setDeseignation(String deseignation) {
		this.deseignation = deseignation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String reference, String deseignation, double prix, int quantite) {
		super();
		this.reference = reference;
		this.deseignation = deseignation;
		this.prix = prix;
		this.quantite = quantite;
	}
	
}
