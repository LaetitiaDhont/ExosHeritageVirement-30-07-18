package package1;

// Mon AccountMain h�rite de classe Account lui aussi

public class AccountMain extends Account {
double tauxAgios;

public AccountMain () {
	
}

// Je fais ma m�thode virement qui calcule le virement quelque soit le montant
// J'effecture mon op�ration, montantVirement - le solde du compte que j'ai nomm� d�biteur
// Le montantVirement sera rajout� au solde du compte cr�diteur du montantVirement qui aura donc un nouveau solde

public void virement(double montantVirement,AccountMain debiteur) {
		debiteur.setSolde(debiteur.getSolde() - montantVirement);
		solde = solde + montantVirement;
	}

// Taux Agios 

public double getTauxAgios() {
	return tauxAgios;
}
public void setTauxAgios(double tauxAgios) {
	this.tauxAgios = tauxAgios;
}


}
