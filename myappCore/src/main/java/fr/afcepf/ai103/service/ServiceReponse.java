package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoReponse;
import fr.afcepf.ai103.data.Reponse;

@Stateless
@Local
public class ServiceReponse implements IServiceReponse{

	@EJB
	private IDaoReponse daoReponse;
	
	@Override
	public Reponse repondreAnnonce(Reponse reponse) {
		
		return daoReponse.insererReponse(reponse);
	}

	@Override
	public List<Reponse> rechercherReponsesByAnnonce(Integer idAnnonce) {
		
		return daoReponse.rechercherReponseParIdAnnonce(idAnnonce);
	}

	@Override
	public List<Reponse> rechercherReponsesByUser(Integer idUtilisateur) {
		
		return daoReponse.rechercherReponseParIdUtilisateur(idUtilisateur);
	}

	public IDaoReponse getDaoReponse() {
		return daoReponse;
	}

	public void setDaoReponse(IDaoReponse daoReponse) {
		this.daoReponse = daoReponse;
	}
	
}
