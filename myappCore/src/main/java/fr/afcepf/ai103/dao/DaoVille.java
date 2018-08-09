package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Ville;

@Stateless
@Local
public class DaoVille implements IDaoVille {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;

	@Override
	public Ville insererVille(Ville ville) {
		entityManager.persist(ville);
		return ville;
	}

	@Override
	public void mettreAJourVille(Ville ville) {
		entityManager.merge(ville);
	}

	@Override
	public Ville rechercherVilleByIdVille(Integer idVille) {
		return entityManager.find(Ville.class, idVille);
	}

	@Override
	public List<Ville> rechercherVilles() {
		return entityManager.createNamedQuery("Ville.findAllVille", Ville.class).getResultList();
	}

	@Override
	public List<Ville> rechercherVilleByNomVille(String nomVille) {
		return entityManager.createNamedQuery("Ville.findVilleByNomVille", Ville.class)
				.setParameter("nomVillle", nomVille).getResultList();
	}

	@Override
	public List<Adresse> rechercherAdresseParVille(Integer idVille) {
		return entityManager.createNamedQuery("Ville.findAdresseByIdVille", Adresse.class)
				.setParameter("idVille", idVille).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
