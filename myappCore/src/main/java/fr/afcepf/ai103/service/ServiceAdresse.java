package fr.afcepf.ai103.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.DaoAdresse;
import fr.afcepf.ai103.dao.IDaoAdresse;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

@Stateless
@Local
public class ServiceAdresse implements IServiceAdresse {

	@EJB
	private IDaoAdresse daoAdresse;

	@Override
	public Adresse saveOrUpdateAdresse(Adresse adresse) {

		if (adresse.getIdAdresse() == null) {
			adresse = daoAdresse.insererAdresse(adresse);
		} else {
			daoAdresse.mettreAJourAdresse(adresse);
		}
		return adresse;
	}

	@Override
	public Adresse rechercherInfosAdresse(Integer idAdresse) {
		return daoAdresse.rechcherAdresseParIdAdr(idAdresse);
	}

	@Override
	public List<Adresse> rechercherAdresseParCodePostal(String codePostal) {
		return daoAdresse.getAdresseByCodePostal(codePostal);
	}

	@Override
	public List<Adresse> rechercherTousLesAdresses() {
		return daoAdresse.rechercherAdresses();
	}

	@Override
	public List<Adresse> getAdresseByIdUser(Integer idUtilisateur) {

		// Modele java8 Stream()
		/*
		 * System.out.println("getAdresseByIdUser - Liste Adresse = "); List<Adresse>
		 * adresses = daoAdresse.findAdressByIdUser().stream() .filter(adr ->
		 * adr.getUtilisateurAdresse().getIdUtilisateur() == idUtilisateur)
		 * .collect(Collectors.toList()); System.out.println(adresses.size());
		 */
		return daoAdresse.rechcherAdresseParIdUtilisateur(idUtilisateur);
		/*
		 * Calcul pour récuperer :
		 * 
		 * .stream().filter(adr -> adr.getUtilisateurAdresse().getIdUtilisateur() ==
		 * idUtilisateur) .collect(Collectors.toList());
		 */

	}

	public IDaoAdresse getDaoAdresse() {
		return daoAdresse;
	}

	public void setDaoAdresse(IDaoAdresse daoAdresse) {
		this.daoAdresse = daoAdresse;
	}

}
