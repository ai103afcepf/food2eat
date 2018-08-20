package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Annonce;

public interface IServiceAnnonce {

	public Annonce creerAnnonce(Annonce annonce);
	
	public List<Annonce> rechercherAnnoncesAccueil(Integer idUtilisateur);
}
