package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Annonce;
import fr.afcepf.ai103.data.RendezVous;

public interface IServiceAnnonce {

	public Annonce creerAnnonce(Annonce annonce);

	public List<Annonce> rechercherAnnoncesAccueil(Integer idUtilisateur);

	public List<RendezVous> afficherListeRdvByAnnonce(Integer idAnnonce);

	public Long getNbrAnnonceEnCours(Integer idUtilisateur);
}
