package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Utilisateur;

@Stateless
@Local
public class DaoUtilisateur implements IDaoUtilisateur {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;

	@Override
	public Utilisateur insererUtilisateur(Utilisateur utilisateur) {

		entityManager.persist(utilisateur);
		return utilisateur;
	}

	@Override
	public void mettreAJourUtilisateur(Utilisateur utilisateur) {

		entityManager.merge(utilisateur);
	}

	@Override
	public Utilisateur getInfosUtilisateur(Integer idUtilisateur) {
		return entityManager.find(Utilisateur.class, idUtilisateur);
	}

	@Override
	public List<Utilisateur> rechercherUtilisateurByIdUtilisateur(Integer idUtilisateur) {
		return null;
	}
}
