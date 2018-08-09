package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoRegion;
import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.Ville;

@Stateless
@Local
public class ServiceRegion implements IServiceRegion {

	@EJB
	private IDaoRegion daoRegion;

	@Override
	public Region creerOrModifierRegion(Region region) {

		if (region.getIdRegion() == null) {
			region = daoRegion.insererRegion(region);
		} else {
			daoRegion.mettreAJourRegion(region);
		}
		return region;
	}

	@Override
	public List<Region> rechercherRegions() {

		return daoRegion.rechercherRegions();
	}

	@Override
	public Region rechercherRegionByIdRegion(Integer idRegion) {
		return daoRegion.rechercherRegionByIdRegion(idRegion);
	}

	@Override
	public List<Region> rechercherRegionByLibelleRegion(String libelleRegion) {
		return daoRegion.rechercherRegionByLibelleRegion(libelleRegion);
	}

	@Override
	public List<Ville> rechercherRegionByNomVille(Integer idRegion) {
		return daoRegion.rechercherVilleParRegion(idRegion);
	}

	public IDaoRegion getDaoRegion() {
		return daoRegion;
	}

	public void setDaoRegion(IDaoRegion daoRegion) {
		this.daoRegion = daoRegion;
	}

}
