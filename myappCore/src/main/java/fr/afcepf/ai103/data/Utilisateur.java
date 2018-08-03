package fr.afcepf.ai103.data;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUtilisateur;
	
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
	
	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idMotifDesinscription")
	private MotifDesinscription motifDesinscription;
	
	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idSexe")
	private Sexe sexe;
	
	@OneToMany(mappedBy = "utilisateur1", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<RelationFoodFriend> listeRelationFoodFriends1;
	
	@OneToMany(mappedBy = "utilisateur2", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<RelationFoodFriend> listeRelationFoodFriends2;
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", pseudo="
				+ pseudo + ", password=" + password + ", email=" + email + ", numeroTel=" + numeroTel
				+ ", dateNaissance=" + dateNaissance + ", dateInscription=" + dateInscription + ", dateLethargie="
				+ dateLethargie + ", dateDesinscription=" + dateDesinscription + "]";
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
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

	public List<RelationFoodFriend> getListeRelationFoodFriends1() {
		return listeRelationFoodFriends1;
	}

	public void setListeRelationFoodFriends(List<RelationFoodFriend> listeRelationFoodFriends1) {
		this.listeRelationFoodFriends1 = listeRelationFoodFriends1;
	}

	public List<RelationFoodFriend> getListeRelationFoodFriends2() {
		return listeRelationFoodFriends2;
	}

	public void setListeRelationFoodFriends1(List<RelationFoodFriend> listeRelationFoodFriends2) {
		this.listeRelationFoodFriends2 = listeRelationFoodFriends2;
	}
	
}
