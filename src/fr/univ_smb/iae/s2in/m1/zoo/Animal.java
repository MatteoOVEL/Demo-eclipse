package fr.univ_smb.iae.s2in.m1.zoo;

public abstract class Animal {
	private String nom;
	private int age;
	
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Animal(String n) {
		this.setNom(n);
	}
	public String toString() {
		return "Un animal nommé " + this.getNom();
	}
	
	public void afficheConsole() {
		System.out.print(this.toString() + "\n");
	}
	
	public abstract void nourrir();
	
}
