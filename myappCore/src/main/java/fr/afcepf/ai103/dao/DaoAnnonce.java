package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Annonce;
import fr.afcepf.ai103.data.RendezVous;


@Stateless
@Local
public class DaoAnnonce implements IDaoAnnonce {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;

	@Override
	public Annonce insererAnnonce(Annonce annonce) {
		entityManager.persist(annonce);
		return annonce;

	}

	@Override
	public void mettreAJourAnnonce(Annonce annonce) {
		entityManager.merge(annonce);
	}

	@Override
	public Annonce rechercherAnnonceByIdAnnonce(Integer idUtilisateur) {
		return null;
	}

	@Override
	public List<Annonce> rechercherAnnonces(Integer idUtilisateur) {
		return null;
	}

	@Override
	public List<RendezVous> rechercherRendezVousParAnnonce(Integer idAnnonce) {
		return null;
	}

	@Override
	public List<Annonce> getAnnonceCree(Integer idUtilisateur) {
		return null;
	}

}
