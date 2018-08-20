package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Annonce;
import fr.afcepf.ai103.data.RendezVous;
 
public interface IDaoAnnonce {

	public Annonce insererAnnonce(Annonce annonce);

	public void mettreAJourAnnonce(Annonce annonce);

	// Afficher mes annonces
	public Annonce rechercherAnnonceByIdAnnonce(Integer idUtilisateur);

	// Afficher toute les annonces idUtilisateur diff de son idUtilisateur
	public List<Annonce> rechercherAnnonces(Integer idUtilisateur);

	// RDV par annonce
	public List<RendezVous> rechercherRendezVousParAnnonce(Integer idAnnonce);

	// Afficher les annonces crées
	public List<Annonce> getAnnonceCree(Integer idUtilisateur);

	// Récupérer aliment

}
