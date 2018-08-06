package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

public interface IDaoAdresse {

	public Adresse insererAdresse(Adresse adresse);

	public void mettreAJourAdresse(Adresse adresse);

	public Adresse rechcherAdresseParIdAdr(Integer idAdresse);

	// pas sur
	public List<Utilisateur> rechcherAdresseParIdUtilisateur(Integer idUtilisateur);

}
