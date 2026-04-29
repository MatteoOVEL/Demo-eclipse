package fr.univ_smb.iae.s2in.m1.zoo;

import java.util.LinkedList;

public class VetoFelin {

	private String nom;
	private LinkedList<Felin> felinsSoignes = new LinkedList<Felin>();

	public LinkedList<Felin> getFelinsSoignes() {
		return this.felinsSoignes;
	}
	
	public void soigneGriffesDesFelins() {
		System.out.print("=== Le veto soigne les griffes de tous ses félins ===\n");
		for (Felin felin : this.getFelinsSoignes()) {
			felin.griffe();
			System.out.print(felin.getNom()+"\n");
		}
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void soigne(Felin f) {
		this.getFelinsSoignes().add(f);
	}

}
