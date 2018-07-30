package package1;

public class Banque {

	// Class m�re Banque qui contient le main, la ou je vais appeler toutes mes instances de class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Nouvelle Instances qui relit toutes mes classes entre elles
		
		Client Pierre = new Client();
		Client Aurelia = new Client();
		AccountMain pierreAccount = new AccountMain();
		AccountMain aureliaAccount = new AccountMain();
		AccountPEL pierrePEL = new AccountPEL();
		AccountPEL aureliaPEL = new AccountPEL();
		
		// Je d�clare mes valeurs 
		
		Pierre.setNom("Brogard");
		Pierre.setPrenom("Pierre");
		Pierre.setAdresse("4 rue serpollet 75020 Paris");
		Pierre.setNumeroId(618942858);
		
		Aurelia.setNom("Perrot");
		Aurelia.setPrenom("Aur�lia");
		Aurelia.setAdresse("7 r�sidence la plaine");
		Aurelia.setNumeroId(689889480);
		
		
		pierreAccount.setSolde(200.0);
		aureliaAccount.setSolde(100.0);
		pierrePEL.setSolde(10000.0);
		aureliaPEL.setSolde(5000.0);
		
		// Je print mon r�sultat, en l'occurence  mes comptes avant le virement 
		
		System.out.println("Le virement va �tre effectu� il s'agit du compte de Aur�lia qui va �tre d�bit� de 25 euros et celui de Pierre qui va �tre cr�dit� de  ses 25 euros");
		System.out.println("Voici les comptes avant le virement");
		System.out.println(pierreAccount.getSolde());
		System.out.println(aureliaAccount.getSolde());
		
		// J'appelle ma m�thode virement qui va effectuer le calcul du virement avec le montant que je souhaite sur le compte de Pierre(cr�diteur) et le compte d'Aur�lia(d�biteur)
		
		pierreAccount.virement(25.0, aureliaAccount);
		
		// Je print � nouveau mes comptes bancaires pour voir si le r�sultat est correcte et que mon virement � bien �t� effectu�
		
		System.out.println("Le virement a eu lieu. Voici le solde restant sur le compte de Aur�lia et celui de Pierre");
		System.out.println(pierreAccount.getSolde());
		System.out.println(aureliaAccount.getSolde());
	}

}
