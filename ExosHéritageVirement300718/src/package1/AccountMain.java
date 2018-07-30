package package1;

// Mon AccountMain hérite de classe Account lui aussi

public class AccountMain extends Account {
double tauxAgios;

public AccountMain () {
	
}

// Je fais ma méthode virement qui calcule le virement quelque soit le montant
// J'effecture mon opération, montantVirement - le solde du compte que j'ai nommé débiteur
// Le montantVirement sera rajouté au solde du compte créditeur du montantVirement qui aura donc un nouveau solde

public void virement(double montantVirement,AccountMain debiteur) {
		debiteur.setSolde(debiteur.getSolde() - montantVirement);
		solde = solde + montantVirement;
	}


public double getTauxAgios() {
	return tauxAgios;
}
public void setTauxAgios(double tauxAgios) {
	this.tauxAgios = tauxAgios;
}


}
