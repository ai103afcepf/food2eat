package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Utilisateur;

public interface IServiceAdresse {

	public Adresse saveOrUpdateAdresse(Adresse adresse);

	public Adresse rechercherInfosAdresse(Integer idAdresse);

	public List<Adresse> rechercherAdresseParCodePostal(String codePostal);

	public List<Adresse> rechercherTousLesAdresses();

	public List<Adresse> getAdresseByIdUser(Integer idUtilisateur);

}
