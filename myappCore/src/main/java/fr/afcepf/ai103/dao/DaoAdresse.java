package fr.afcepf.ai103.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

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
		// affichage
		System.out.println(adresse.toString());
		
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
	public List<Utilisateur> rechcherAdresseParIdUtilisateur(Integer idUtilisateur) {

		return null;
	}

}
