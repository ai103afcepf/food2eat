package fr.afcepf.ai103.dao;


import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.data.Ville;

public interface IDaoAdresse {

	public Adresse insererAdresse(Adresse adresse);

	public void mettreAJourAdresse(Adresse adresse);

	public Adresse rechcherAdresseParIdAdr(Integer idAdresse);
	
	public List<Adresse> getAdresseByCodePostal(String codePostal);
	
	public List<Adresse> rechercherAdresses();

	// pas sur
	public List<Adresse> rechcherAdresseParIdUtilisateur(Integer idUtilisateur);

}
