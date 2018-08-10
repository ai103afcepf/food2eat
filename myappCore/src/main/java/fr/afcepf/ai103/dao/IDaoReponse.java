package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Reponse;

public interface IDaoReponse {

	public Reponse insererReponse(Reponse reponse);
	
	public List<Reponse> rechercherReponses();
	
	public List<Reponse> rechercherReponseParIdAnnonce(Integer idAnnonce);
	
	public List<Reponse> rechercherReponseParIdUtilisateur(Integer idUtilisateur);
}
