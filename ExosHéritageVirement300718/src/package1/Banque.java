package package1;

public class Banque {

	// Class mère Banque qui contient le main, la ou je vais appeler toutes mes instances de class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Nouvelle Instances qui relit toutes mes classes entre elles
		
		Client Pierre = new Client();
		Client Aurelia = new Client();
		AccountMain pierreAccount = new AccountMain();
		AccountMain aureliaAccount = new AccountMain();
		AccountPEL pierrePEL = new AccountPEL();
		AccountPEL aureliaPEL = new AccountPEL();
		
		// Je déclare mes valeurs 
		
		Pierre.setNom("Brogard");
		Pierre.setPrenom("Pierre");
		Pierre.setAdresse("4 rue serpollet 75020 Paris");
		Pierre.setNumeroId(618942858);
		
		Aurelia.setNom("Perrot");
		Aurelia.setPrenom("Aurélia");
		Aurelia.setAdresse("7 résidence la plaine");
		Aurelia.setNumeroId(689889480);
		
		
		pierreAccount.setSolde(200.0);
		aureliaAccount.setSolde(100.0);
		pierrePEL.setSolde(10000.0);
		aureliaPEL.setSolde(5000.0);
		
		// Je print mon résultat, en l'occurence  mes comptes avant le virement 
		
		System.out.println("Le virement va être effectué il s'agit du compte de Aurélia qui va être débité de 25 euros et celui de Pierre qui va être crédité de  ses 25 euros");
		System.out.println("Voici les comptes avant le virement");
		System.out.println(pierreAccount.getSolde());
		System.out.println(aureliaAccount.getSolde());
		
		// J'appelle ma méthode virement qui va effectuer le calcul du virement avec le montant que je souhaite sur le compte de Pierre(créditeur) et le compte d'Aurélia(débiteur)
		
		pierreAccount.virement(25.0, aureliaAccount);
		
		// Je print à nouveau mes comptes bancaires pour voir si le résultat est correcte et que mon virement à bien été effectué
		
		System.out.println("Le virement a eu lieu. Voici le solde restant sur le compte de Aurélia et celui de Pierre");
		System.out.println(pierreAccount.getSolde());
		System.out.println(aureliaAccount.getSolde());
	}

}
