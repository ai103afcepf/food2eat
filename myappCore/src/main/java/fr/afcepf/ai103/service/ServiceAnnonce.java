package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoAnnonce;
import fr.afcepf.ai103.data.Annonce;

@Stateless
@Local
public class ServiceAnnonce implements IServiceAnnonce {

	@EJB
	private IDaoAnnonce daoAnnonce;

	@Override
	public Annonce creerAnnonce(Annonce annonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> rechercherAnnoncesAccueil(Integer idUtilisateur) {

		return daoAnnonce.rechercherAnnonces(idUtilisateur);
	}

	public IDaoAnnonce getDaoAnnonce() {
		return daoAnnonce;
	}

	public void setDaoAnnonce(IDaoAnnonce daoAnnonce) {
		this.daoAnnonce = daoAnnonce;
	}

	// annonce publié
	@Override
	public Long getNbrAnnonceEnCours(Integer idUtilisateur) {

		return daoAnnonce.rechercherAnnonces(idUtilisateur).stream()
				.filter(a -> a.getDateFermetureAnnonce() == null) //l'annonce n'a pas été supprimée ou donnée
				.filter(a -> a.getDateAnnulationPublicationAnnonce() == null) //l'annonce publié n'a pas été supprimée
				.filter(a -> a.getDateAnnulationCreationAnnonce() == null).count(); //l'annonce crée n'a pas été supprimée 
	}

}
