package package1;

// Mon client hérite de la class Account

public class Client extends Account {
	
// Je déclare mes variables
	
String nom;
String prenom;
String adresse;
int numeroId;

// Je génère mes getters - setters

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getNumeroId() {
	return numeroId;
}
public void setNumeroId(int numeroId) {
	this.numeroId = numeroId;
}
}
