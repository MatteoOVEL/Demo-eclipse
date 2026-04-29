package fr.univ_smb.iae.s2in.m1.zoo;

public class Elephant extends Animal{

	public Elephant(String nom) {
		super(nom);
	}
	
	public void nourrir() {
		System.out.print("On donne des cacahuetes à " + this.getNom() + "\n");
	}
}
