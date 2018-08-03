package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//1. Ajouter une balise <class> dans persistence.xml
//2. Ajouter les annotations @Entity pour la classe (pour faire le lien avec la table dans BDD)
// @Id pour définir la Primary Key (clé primaire) et @GeneratedValue(strategy=GenerationType.IDENTITY) 

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdresse;

	private int numero;
	private String nomVoie;
	private Long coordonneesGpsLat;
	private Long coordonneesGpsLong;
	private Date dateDebutValidite;
	private Date dateFinValidite;

	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idTypeVoie")
	private TypeVoie typeVoie;

	@ManyToOne
	@JoinColumn(name = "idStatutAdresse")
	private StatutAdresse statutAdresse; 

	@ManyToOne
	@JoinColumn(name = "idVille")
	private Ville villesAdresse;

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

	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public Long getCoordonneesGpsLat() {
		return coordonneesGpsLat;
	}

	public void setCoordonneesGpsLat(Long coordonneesGpsLat) {
		this.coordonneesGpsLat = coordonneesGpsLat;
	}

	public Long getCoordonneesGpsLong() {
		return coordonneesGpsLong;
	}

	public void setCoordonneesGpsLong(Long coordonneesGpsLong) {
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

	public StatutAdresse getStatutAdresse() {
		return statutAdresse;
	}

	public void setStatutAdresse(StatutAdresse statutAdresse) {
		this.statutAdresse = statutAdresse;
	}

	public TypeVoie getTypeVoie() {
		return typeVoie;
	}

	public void setTypeVoie(TypeVoie typeVoie) {
		this.typeVoie = typeVoie;
	}

	public Ville getVillesAdresse() {
		return villesAdresse;
	}

	public void setVillesAdresse(Ville villesAdresse) {
		this.villesAdresse = villesAdresse;
	}
}
