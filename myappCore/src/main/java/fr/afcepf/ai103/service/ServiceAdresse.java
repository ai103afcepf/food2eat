package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoAdresse;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

@Stateless
@Local
public class ServiceAdresse implements IServiceAdresse {

	@EJB
	private IDaoAdresse daoAdresse;

	@Override
	public Adresse rechercherInfosAdresse() {
		return null;
	}

	@Override
	public List<Adresse> rechercherAdresseParCodePostal() {
		return null;
	}

	@Override
	public List<Utilisateur> adressePourUtilisateur(Utilisateur utilisateur) {
		return null;
	}

	@Override
	public Adresse rechercherListeAdressesParVille() {
		return null;
	}

	@Override
	public List<Adresse> rechercherListClientParId(Adresse idAdresse) {
		return null;
	}

	@Override
	public Adresse saveOrUpdateAdresse(Adresse adresse) {

		if (adresse.getIdAdresse() == -1) {
			adresse = daoAdresse.insererAdresse(adresse);
		} else {
			daoAdresse.mettreAJourAdresse(adresse);
		}
		return adresse;
	}

	@Override
	public List<Adresse> rechercherTousLesAdresses() {
		return null;
	}

}
