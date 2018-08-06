package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

public interface IServiceAdresse {

	public Adresse rechercherInfosAdresse();

	public List<Adresse> rechercherAdresseParCodePostal();

	public List<Utilisateur> adressePourUtilisateur(Utilisateur idUtilisateur);

	public Adresse rechercherListeAdressesParVille();

	public List<Adresse> rechercherListClientParId(Adresse idAdresse);

	public Adresse saveOrUpdateAdresse(Adresse adresse);

	public List<Adresse> rechercherTousLesAdresses();

}
