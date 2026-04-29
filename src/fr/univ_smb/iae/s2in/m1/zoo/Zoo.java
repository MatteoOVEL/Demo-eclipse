package fr.univ_smb.iae.s2in.m1.zoo;

import java.util.LinkedList;

public class Zoo {
	private LinkedList<Animal> animaux = new LinkedList<Animal>();

	public LinkedList<Animal> getAnimaux() {
		return animaux;
	}
	
	public void nourrirLesAnimaux( ) {
		System.out.print("=== On nourrit tous les animaux du zoo ===\n");
		for (Animal a : this.getAnimaux()) {
			a.nourrir();
		}
	}
	
	public void heberge(Animal animal) {
		this.getAnimaux().add(animal);
	}
	
}
