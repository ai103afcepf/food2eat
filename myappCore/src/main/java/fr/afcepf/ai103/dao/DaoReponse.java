package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Reponse;

@Stateless
@Local
public class DaoReponse implements IDaoReponse{

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;
	
	public DaoReponse() {
		super();
	}

	@Override
	public Reponse insererReponse(Reponse reponse) {
		
		entityManager.persist(reponse);
		return reponse;
	}

	@Override
	public List<Reponse> rechercherReponses() {

		return entityManager.createQuery("SELECT r FROM Reponse r", Reponse.class).getResultList();
	}

	@Override
	public List<Reponse> rechercherReponseParIdAnnonce(Integer idAnnonce) {
		
		return entityManager.createNamedQuery("Reponse.FindRepByAnnonce", Reponse.class)
				.setParameter("idAnnonce", idAnnonce).getResultList();
	}

	@Override
	public List<Reponse> rechercherReponseParIdUtilisateur(Integer idUtilisateur) {

		return entityManager.createNamedQuery("Reponse.FindRepByUser", Reponse.class)
				.setParameter("idUtilisateur", idUtilisateur).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
