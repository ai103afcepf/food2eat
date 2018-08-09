package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoVille;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Ville;

@Stateless
@Local
public class ServiceVille implements IServiceVille {

	@EJB
	private IDaoVille daoVille;

	@Override
	public Ville creerOrModifierVille(Ville ville) {
		if (ville.getIdVille() == null) {
			ville = daoVille.insererVille(ville);
		} else {
			daoVille.mettreAJourVille(ville);
		}
		return ville;
	}

	@Override
	public List<Ville> rechercherVilles() {
		return daoVille.rechercherVilles();
	}

	@Override
	public Ville rechercherRegionByIdRegion(Integer idVille) {
		return daoVille.rechercherVilleByIdVille(idVille);
	}

	@Override
	public List<Ville> rechercherVilleByLibelleVille(String nomVille) {
		return daoVille.rechercherVilleByNomVille(nomVille);
	}

	@Override
	public List<Adresse> rechercherAdresseByNomVille(Integer idVille) {
		return daoVille.rechercherAdresseParVille(idVille);
	}

	public IDaoVille getDaoVille() {
		return daoVille;
	}

	public void setDaoVille(IDaoVille daoVille) {
		this.daoVille = daoVille;
	}

}
