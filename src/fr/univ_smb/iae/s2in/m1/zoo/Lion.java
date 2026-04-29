package fr.univ_smb.iae.s2in.m1.zoo;

public class Lion extends Animal implements Felin {
		public Lion(String leNom) {
			super(leNom);
		}
		public void nourrir() {
			System.out.print("On donne des antilopes au lion nommé " + this.getNom() + "\n");
		}
		public void grimpe() {
			System.out.print("Le lion grimpe...\n");
		}
		
		public void griffe() {
			System.out.print("Le lion sort ses longues griffes\n");
		}


}
