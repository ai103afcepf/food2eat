package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Utilisateur;

public interface IDaoUtilisateur {

	public Utilisateur insererUtilisateur(Utilisateur utilisateur);

	public void mettreAJourUtilisateur(Utilisateur utilisateur);
	
	public Utilisateur getInfosUtilisateur(Integer idUtilisateur);
	
	// Afficher la liste d'adresse a partir de la classe Adresse 
	public List<Utilisateur> rechercherUtilisateurByIdUtilisateur(Integer idUtilisateur);
	
	// Rechercher food friend

}
