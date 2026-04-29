package fr.univ_smb.iae.s2in.m1.zoo;

public class Tigre extends Animal implements Felin {

	public Tigre(String leNom) {
		super(leNom);
	}
	public void nourrir() {
		System.out.print("On donne des gazelles au tigre nommé " + this.getNom() + "\n");
	}
	public void grimpe() {
		System.out.print("Le tigre grimpe...\n");
	}
	
	public void griffe() {
		System.out.print("Le tigre sort ses puissantes griffes\n");
	}
}
