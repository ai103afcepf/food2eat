package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Ville;


public interface IServiceVille {
	
	public Ville creerOrModifierVille(Ville ville);

	public List<Ville> rechercherVilles();

	public Ville rechercherRegionByIdRegion(Integer idVille);

	public List<Ville> rechercherVilleByLibelleVille(String nomVille);

	public List<Adresse> rechercherAdresseByNomVille(Integer idRegion);

}
