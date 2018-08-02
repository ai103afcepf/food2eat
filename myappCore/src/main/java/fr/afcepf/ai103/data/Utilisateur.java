package fr.afcepf.ai103.data;

import java.util.Date;

public class Utilisateur {
	
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
	
}
