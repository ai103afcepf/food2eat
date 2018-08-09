package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.mail.Address;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.RendezVous;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.data.Ville;

@Stateless
@Local
public class DaoAdresse implements IDaoAdresse {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;

	public DaoAdresse() {
		super();
	}

	@Override
	public Adresse insererAdresse(Adresse adresse) {

		entityManager.persist(adresse);
		return adresse;
	}

	@Override
	public void mettreAJourAdresse(Adresse adresse) {
		entityManager.merge(adresse);
	}

	@Override
	public Adresse rechcherAdresseParIdAdr(Integer idAdresse) {
		return entityManager.find(Adresse.class, idAdresse);
	}

	@Override
	public List<Adresse> rechcherAdresseParIdUtilisateur(Integer idUtilisateur) {

		return entityManager.createNamedQuery("Adresse.findAdresseByUser", Adresse.class)
				.setParameter("idUtilisateur", idUtilisateur).getResultList();
	}

	@Override
	public List<Adresse> rechercherAdresses() {

		return entityManager.createQuery("SELECT a FROM Adresse a", Adresse.class).getResultList();
	}

	@Override
	public List<Adresse> getAdresseByCodePostal(String codePostal) {

		return entityManager.createNamedQuery("Adresse.findAdresseByCodePostal", Adresse.class)
				.setParameter("codePostal", codePostal).getResultList();
	}

	@Override
	public List<RendezVous> rechercherRDVParIdAdresse(Integer idAdresse) {
		return entityManager.createNamedQuery("RendezVous.rendezVousAdresse", RendezVous.class)
				.setParameter("idAdresse", idAdresse).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
