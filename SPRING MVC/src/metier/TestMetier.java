package metier;

import java.util.List;

public class TestMetier {

	public static void main(String[] args) {
		ICatalogueMetier metier=new CatalogueMetierImp();
		
		/*
		metier.addProduit(new Produit("REF05","AA",870,3));
		metier.addProduit(new Produit("REF06","BB",345,3));
		metier.addProduit(new Produit("REF07","CC",6,3));
		*/
		List<Produit> prods=metier.listProduits();
		for(Produit p:prods) {
			System.out.println(p.getDeseignation());
			
		}
		System.out.println("-----------------");
		List<Produit> prods2=metier.produitsParMC("HP");
		for(Produit p:prods2) {
			System.out.println(p.getDeseignation());
			
		}
		System.out.println("-----------");
		try {
			Produit p=metier.getProduit("PR02");
			System.out.println(p.getDeseignation());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("--------");
		try {
			Produit p=metier.getProduit("PR01");
			p.setPrix(250);
			metier.updateProduit(p);
			Produit p2=metier.getProduit("PR01");
			
			System.out.println(p2.getPrix());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------");
		metier.deleteProduit("REF05");
		
	}

}
