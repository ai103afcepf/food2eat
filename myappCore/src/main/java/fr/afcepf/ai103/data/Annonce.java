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
public class Annonce { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnnonce;

	private Date dateCreationAnnonce;
	private Date dateAnnulationCreationAnnonce;
	private Date datePublicationAnnonce;
	private Date dateAnnulationPublicationAnnonce;
	private Date dateFermetureAnnonce;
 
	@OneToMany(mappedBy = "annonce", fetch = FetchType.LAZY)
	private List<Reponse> listeReponsesAnnonce;
	
	@ManyToOne
	@JoinColumn(name="idStockPerso")
	private StockPerso stockPerso;

	public Annonce() {
		super();
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", dateCreationAnnonce=" + dateCreationAnnonce
				+ ", dateAnnulationCreationAnnonce=" + dateAnnulationCreationAnnonce + ", datePublicationAnnonce="
				+ datePublicationAnnonce + ", dateAnnulationPublicationAnnonce=" + dateAnnulationPublicationAnnonce
				+ ", dateFermetureAnnonce=" + dateFermetureAnnonce + "]";
	}



	

	public List<Reponse> getListeReponsesAnnonce() {
		return listeReponsesAnnonce;
	}

	public void setListeReponsesAnnonce(List<Reponse> listeReponsesAnnonce) {
		this.listeReponsesAnnonce = listeReponsesAnnonce;
	}

	public int getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Date getDateCreationAnnonce() {
		return dateCreationAnnonce;
	}

	public void setDateCreationAnnonce(Date dateCreationAnnonce) {
		this.dateCreationAnnonce = dateCreationAnnonce;
	}

	public Date getDateAnnulationCreationAnnonce() {
		return dateAnnulationCreationAnnonce;
	}

	public void setDateAnnulationCreationAnnonce(Date dateAnnulationCreationAnnonce) {
		this.dateAnnulationCreationAnnonce = dateAnnulationCreationAnnonce;
	}

	public Date getDatePublicationAnnonce() {
		return datePublicationAnnonce;
	}

	public void setDatePublicationAnnonce(Date datePublicationAnnonce) {
		this.datePublicationAnnonce = datePublicationAnnonce;
	}

	public Date getDateAnnulationPublicationAnnonce() {
		return dateAnnulationPublicationAnnonce;
	}

	public void setDateAnnulationPublicationAnnonce(Date dateAnnulationPublicationAnnonce) {
		this.dateAnnulationPublicationAnnonce = dateAnnulationPublicationAnnonce;
	}

	public Date getDateFermetureAnnonce() {
		return dateFermetureAnnonce;
	}

	public void setDateFermetureAnnonce(Date dateFermetureAnnonce) {
		this.dateFermetureAnnonce = dateFermetureAnnonce;
	}

	public StockPerso getStockPerso() {
		return stockPerso;
	}

	public void setStockPerso(StockPerso stockPerso) {
		this.stockPerso = stockPerso;
	}

}
