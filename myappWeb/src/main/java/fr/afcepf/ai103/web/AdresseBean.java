package fr.afcepf.ai103.web;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.RendezVous;
import fr.afcepf.ai103.data.StatutAdresse;
import fr.afcepf.ai103.data.TypeVoie;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.service.IServiceAdresse;

@ManagedBean
@SessionScoped
//@Default
public class AdresseBean {

	private Integer idAdresse;
	private Integer numero;
	private String nomVoie;
	private long coordonneesGpsLat;
	private long coordonneesGpsLong;
	private Date dateDebutValidite;
	private Date dateFinValidite;

	private TypeVoie typeVoie;
	private StatutAdresse statutAdresse;
	private Utilisateur utilisateurAdresse;
	private List<RendezVous> listeRdvAdresse;
	private Adresse adresse;

	@EJB
	private IServiceAdresse serviceAdresse;

	public AdresseBean() {
	}

	@PostConstruct
	private void init() {
		adresse = serviceAdresse.rechercherInfosAdresse(1);
		System.out.println("dans methode prefixée par @PostConstruct, serviceAdresse=" + serviceAdresse);
	}

	public Integer getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(Integer idAdresse) {
		this.idAdresse = idAdresse;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public long getCoordonneesGpsLat() {
		return coordonneesGpsLat;
	}

	public void setCoordonneesGpsLat(long coordonneesGpsLat) {
		this.coordonneesGpsLat = coordonneesGpsLat;
	}

	public long getCoordonneesGpsLong() {
		return coordonneesGpsLong;
	}

	public void setCoordonneesGpsLong(long coordonneesGpsLong) {
		this.coordonneesGpsLong = coordonneesGpsLong;
	}

	public Date getDateDebutValidite() {
		return dateDebutValidite;
	}

	public void setDateDebutValidite(Date dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

	public Date getDateFinValidite() {
		return dateFinValidite;
	}

	public void setDateFinValidite(Date dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public TypeVoie getTypeVoie() {
		return typeVoie;
	}

	public void setTypeVoie(TypeVoie typeVoie) {
		this.typeVoie = typeVoie;
	}

	public StatutAdresse getStatutAdresse() {
		return statutAdresse;
	}

	public void setStatutAdresse(StatutAdresse statutAdresse) {
		this.statutAdresse = statutAdresse;
	}

	public Utilisateur getUtilisateurAdresse() {
		return utilisateurAdresse;
	}

	public void setUtilisateurAdresse(Utilisateur utilisateurAdresse) {
		this.utilisateurAdresse = utilisateurAdresse;
	}

	public List<RendezVous> getListeRdvAdresse() {
		return listeRdvAdresse;
	}

	public void setListeRdvAdresse(List<RendezVous> listeRdvAdresse) {
		this.listeRdvAdresse = listeRdvAdresse;
	}

	public IServiceAdresse getServiceAdresse() {
		return serviceAdresse;
	}

	public void setServiceAdresse(IServiceAdresse serviceAdresse) {
		this.serviceAdresse = serviceAdresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
