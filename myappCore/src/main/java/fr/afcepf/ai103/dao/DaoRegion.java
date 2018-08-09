package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.Ville;

@Stateless
@Local
public class DaoRegion implements IDaoRegion {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;

	@Override
	public Region insererRegion(Region region) {

		entityManager.persist(region);
		return region;
	}

	@Override
	public void mettreAJourRegion(Region region) {

		entityManager.merge(region);
	}

	@Override
	public List<Region> rechercherRegions() {
		return entityManager.createNamedQuery("Region.findAllRegion", Region.class).getResultList();
	}

	@Override
	public Region rechercherRegionByIdRegion(Integer idRegion) {
		return entityManager.find(Region.class, idRegion);
	}

	@Override
	public List<Region> rechercherRegionByLibelleRegion(String libelleRegion) {
		return entityManager.createNamedQuery("Region.findRegionByLibelleRegion", Region.class)
				.setParameter("libelleRegion", libelleRegion).getResultList();
	}

	@Override
	public List<Ville> rechercherVilleParRegion(Integer idRegion) {
		return entityManager.createNamedQuery("Region.findVilleByLibelleRegion", Ville.class)
				.setParameter("idRegion", idRegion).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
