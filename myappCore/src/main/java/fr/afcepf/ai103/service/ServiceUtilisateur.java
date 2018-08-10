package fr.afcepf.ai103.service;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoUtilisateur;
import fr.afcepf.ai103.data.Utilisateur;

@Stateless
@Local
public class ServiceUtilisateur implements IServiceUtilisateur {

	@EJB
	private IDaoUtilisateur daoUtilisateur;

	@Override
	public Utilisateur creerOrMettreAJour(Utilisateur utilisateur) {

		if (utilisateur.getIdUtilisateur() == null) {
			utilisateur = daoUtilisateur.insererUtilisateur(utilisateur);
		} else {
			daoUtilisateur.mettreAJourUtilisateur(utilisateur);
		}

		return utilisateur;
	}

	@Override
	public Utilisateur afficherProfilUtilisateur(Integer idUtilisateur) {

		return daoUtilisateur.getInfosUtilisateur(idUtilisateur);
	}

	

}
