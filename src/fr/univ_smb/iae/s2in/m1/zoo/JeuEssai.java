package fr.univ_smb.iae.s2in.m1.zoo;

public class JeuEssai {
	
	public static void main(String[] args) {
		JeuEssai.essai1();
	}
	
	public static void essai1() {
		// 1er jeu d'essai
		Elephant e = new Elephant("Dumbo");
		e.afficheConsole();
		Tigre t1 = new Tigre("Tigrou");
		t1.grimpe();
		Zoo zoo = new Zoo();
		zoo.heberge(e);
		zoo.heberge(t1);
		
		Lion l1 = new Lion("Simba");
		zoo.heberge(l1);
		zoo.nourrirLesAnimaux();
		VetoFelin v = new VetoFelin();
		
		v.soigne(l1);
		v.soigne(t1);
		v.soigneGriffesDesFelins();
	}

	
	
}
