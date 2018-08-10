package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Reponse;

public interface IServiceReponse {
	
	public Reponse repondreAnnonce(Reponse reponse);
	
	public List<Reponse> rechercherReponsesByAnnonce(Integer idAnnonce);
	
	public List<Reponse> rechercherReponsesByUser(Integer idUtilisateur);

}
