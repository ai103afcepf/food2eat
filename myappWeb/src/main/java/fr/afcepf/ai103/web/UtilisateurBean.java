package fr.afcepf.ai103.web;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.MotifDesinscription;
import fr.afcepf.ai103.data.RelationFoodFriend;
import fr.afcepf.ai103.data.Reponse;
import fr.afcepf.ai103.data.Sexe;
import fr.afcepf.ai103.data.StockPerso;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.service.IServiceAdresse;
import fr.afcepf.ai103.service.IServiceUtilisateur;

@ManagedBean
@SessionScoped
public class UtilisateurBean {

	@EJB
	private IServiceUtilisateur serviceUtilisateur;

	@EJB
	private IServiceAdresse serviceAdresse;

	private Integer idUtilisateur;

	private String nom;
	private String prenom;
	private String pseudo;
	private String password;
	private String email;
	private String numeroTel;
	private Date dateNaissance;
	private Date dateInscription;
	private Date dateLethargie;
	private Date dateDesinscription;
	private String photoProfil;

	private List<Adresse> listeAdressesUtilisateur;
	private MotifDesinscription motifDesinscription;
	private Sexe sexe;
	private List<StockPerso> listeStockPersoUtilisateur;
	private List<Reponse> listeReponsesUtilisateur;
	private List<RelationFoodFriend> listeRelationFoodFriends1;
	private List<RelationFoodFriend> listeRelationFoodFriends2;

	private Utilisateur utilisateur;

	/*********************/
	// var test calculs
	private long nbr;

	public long getNbr() {
		return nbr;
	}

	public void setNbr(long nbr) {
		this.nbr = nbr;
	}

	/*********************/
	public UtilisateurBean() {
		super();
	}

	// teste postConstructor
	@PostConstruct
	public void init() {
		System.out.println("Avant init - ");
		utilisateur = serviceUtilisateur.afficherProfilUtilisateur(2);
		System.out.println("Après init - " + serviceUtilisateur);
		nbr = serviceAdresse.getNbrAdresseByUtilisateur(2);
	}

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateLethargie() {
		return dateLethargie;
	}

	public void setDateLethargie(Date dateLethargie) {
		this.dateLethargie = dateLethargie;
	}

	public Date getDateDesinscription() {
		return dateDesinscription;
	}

	public void setDateDesinscription(Date dateDesinscription) {
		this.dateDesinscription = dateDesinscription;
	}

	public String getPhotoProfil() {
		return photoProfil;
	}

	public void setPhotoProfil(String photoProfil) {
		this.photoProfil = photoProfil;
	}

	public List<Adresse> getListeAdressesUtilisateur() {
		return listeAdressesUtilisateur;
	}

	public void setListeAdressesUtilisateur(List<Adresse> listeAdressesUtilisateur) {
		this.listeAdressesUtilisateur = listeAdressesUtilisateur;
	}

	public MotifDesinscription getMotifDesinscription() {
		return motifDesinscription;
	}

	public void setMotifDesinscription(MotifDesinscription motifDesinscription) {
		this.motifDesinscription = motifDesinscription;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public List<StockPerso> getListeStockPersoUtilisateur() {
		return listeStockPersoUtilisateur;
	}

	public void setListeStockPersoUtilisateur(List<StockPerso> listeStockPersoUtilisateur) {
		this.listeStockPersoUtilisateur = listeStockPersoUtilisateur;
	}

	public List<Reponse> getListeReponsesUtilisateur() {
		return listeReponsesUtilisateur;
	}

	public void setListeReponsesUtilisateur(List<Reponse> listeReponsesUtilisateur) {
		this.listeReponsesUtilisateur = listeReponsesUtilisateur;
	}

	public List<RelationFoodFriend> getListeRelationFoodFriends1() {
		return listeRelationFoodFriends1;
	}

	public void setListeRelationFoodFriends1(List<RelationFoodFriend> listeRelationFoodFriends1) {
		this.listeRelationFoodFriends1 = listeRelationFoodFriends1;
	}

	public List<RelationFoodFriend> getListeRelationFoodFriends2() {
		return listeRelationFoodFriends2;
	}

	public void setListeRelationFoodFriends2(List<RelationFoodFriend> listeRelationFoodFriends2) {
		this.listeRelationFoodFriends2 = listeRelationFoodFriends2;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
