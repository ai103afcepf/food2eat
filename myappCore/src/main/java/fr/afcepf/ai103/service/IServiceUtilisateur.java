package fr.afcepf.ai103.service;

import fr.afcepf.ai103.data.Utilisateur;

public interface IServiceUtilisateur {

	public Utilisateur creerOrMettreAJour(Utilisateur utilisateur);

	public Utilisateur afficherProfilUtilisateur(Integer idUtilisateur);

}
