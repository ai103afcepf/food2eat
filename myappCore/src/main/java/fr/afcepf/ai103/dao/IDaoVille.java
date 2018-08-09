package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Ville;

public interface IDaoVille {
	
	public Ville insererVille(Ville ville);

	public void mettreAJourVille(Ville ville);

	public Ville rechercherVilleByIdVille(Integer idVille);

	public List<Ville> rechercherVilles();

	public List<Ville> rechercherVilleByNomVille(String nomVille); 

	public List<Adresse> rechercherAdresseParVille(Integer idVille);

}
