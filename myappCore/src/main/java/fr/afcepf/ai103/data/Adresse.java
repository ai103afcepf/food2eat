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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//1. Ajouter une balise <class> dans persistence.xml
//2. Ajouter les annotations @Entity pour la classe (pour faire le lien avec la table dans BDD)
// @Id pour définir la Primary Key (clé primaire) et @GeneratedValue(strategy=GenerationType.IDENTITY) 

@Entity
@NamedQueries({
		// Peut être que cette requete sera dans la classe Utilisateur :: query="SELECT
		// adr FROM Adresse adr INNER JOIN adr.utilisateurAdresse userAdr WHERE
		// userAdr.idUtilisateur = :idUtilisateur")
		@NamedQuery(name = "Adresse.findAllAdresse", query = "SELECT adr1 FROM Adresse adr1"),
		@NamedQuery(name = "Adresse.findAdresseByUser", query = "SELECT adr2 FROM Adresse adr2 WHERE adr2.utilisateurAdresse.idUtilisateur= :idUtilisateur"),
		@NamedQuery(name = "Adresse.findAdresseByCodePostal", query = "SELECT adr3 FROM Adresse adr3 WHERE adr3.villeAdresse.codePostal = :codePostal "),
		@NamedQuery(name = "Adresse.findAdresseByRegion", query = "SELECT adr4 FROM Adresse adr4 WHERE adr4.villeAdresse.region.libelleRegion = :libelleRegion "),
		@NamedQuery(name = "RendezVous.rendezVousAdresse", query = "SELECT rdv FROM Adresse adr LEFT JOIN adr.listeRdvAdresse rdv WHERE adr.idAdresse = :idAdresse")})

/*
 * SELECT a.numero, t.libelleTypeVoie, a.nomVoie, v.codePostal, v.nomVille FROM
 * adresse a LEFT JOIN Ville v ON a.idVille = v.idVille LEFT JOIN TypeVoie t ON
 * t.idTypeVoie = a.idTypeVoie LEFT JOIN Region r ON v.idRegion = r.idRegion
 */

public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAdresse;

	private Integer numero;
	private String nomVoie;
	private Double coordonneesGpsLat;
	private Double coordonneesGpsLong;
	@Temporal(TemporalType.DATE)
	private Date dateDebutValidite;
	@Temporal(TemporalType.DATE)
	private Date dateFinValidite;

	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idTypeVoie")
	private TypeVoie typeVoie;

	@ManyToOne
	@JoinColumn(name = "idStatutAdresse")
	private StatutAdresse statutAdresse;

	@ManyToOne
	@JoinColumn(name = "idVille")
	private Ville villeAdresse;

	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateurAdresse;

	@OneToMany(mappedBy = "adresseRdv", fetch = FetchType.EAGER)
	private List<RendezVous> listeRdvAdresse;

	public Adresse() {
		super();
	}

	// consctructeur surcharge

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numero=" + numero + ", nomVoie=" + nomVoie
				+ ", coordonneesGpsLat=" + coordonneesGpsLat + ", coordonneesGpsLong=" + coordonneesGpsLong
				+ ", dateDebutValidite=" + dateDebutValidite + ", dateFinValidite=" + dateFinValidite + "]";
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

	public Double getCoordonneesGpsLat() {
		return coordonneesGpsLat;
	}

	public void setCoordonneesGpsLat(Double coordonneesGpsLat) {
		this.coordonneesGpsLat = coordonneesGpsLat;
	}

	public Double getCoordonneesGpsLong() {
		return coordonneesGpsLong;
	}

	public void setCoordonneesGpsLong(Double coordonneesGpsLong) {
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

	public Ville getVilleAdresse() {
		return villeAdresse;
	}

	public void setVilleAdresse(Ville villeAdresse) {
		this.villeAdresse = villeAdresse;
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

}
