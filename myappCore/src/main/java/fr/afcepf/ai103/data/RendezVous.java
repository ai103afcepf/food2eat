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
public class RendezVous {  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRendezVous;
	// Date et Heure c pourquoi il n'y a pas eu de @Temporal(TemporalType.DATE)
	private Date dateRendezVous;
	
	@ManyToOne
	@JoinColumn(name="idAdresse")
	private Adresse adresseRdv;
	
	@ManyToOne
	@JoinColumn(name="idAnnonce")
	private Annonce annonceRdv;
	
	@OneToMany(mappedBy="rdvReponse",fetch=FetchType.LAZY)
	private List<Reponse> listeReponsesRdv;
	
	
	
	
	public RendezVous() {
		super();
	}


	@Override
	public String toString() {
		return "RendezVous [idRendezVous=" + idRendezVous + ", dateRendezVous=" + dateRendezVous + "]";
	}


	public Integer getIdRendezVous() {
		return idRendezVous;
	}


	public void setIdRendezVous(Integer idRendezVous) {
		this.idRendezVous = idRendezVous;
	}


	public Date getDateRendezVous() {
		return dateRendezVous;
	}


	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}
	
	

}
