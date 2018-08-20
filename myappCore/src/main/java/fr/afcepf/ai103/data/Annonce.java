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

@Entity
@NamedQueries({
	//@NamedQuery(name="Annonce.find", query="")
	@NamedQuery(name="Annonce.FindAnnoncesEnCours", query="SELECT ann1 FROM Annonce ann1 WHERE ann1.stockPersoAnnonce.utilisateurStock.idUtilisateur!= :idUtilisateur")
//	@NamedQuery(name="Annonce.FindPseudoAnnonce", query="SELECT user1 FROM Utilisateur user1 WHERE user1.utilisateurStock")
})
public class Annonce { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAnnonce;

	@Temporal(TemporalType.DATE)
	private Date dateCreationAnnonce;
	@Temporal(TemporalType.DATE)
	private Date dateAnnulationCreationAnnonce;
	@Temporal(TemporalType.DATE)
	private Date datePublicationAnnonce;
	@Temporal(TemporalType.DATE)
	private Date dateAnnulationPublicationAnnonce;
	@Temporal(TemporalType.DATE)
	private Date dateFermetureAnnonce;
 
	@OneToMany(mappedBy = "annonceReponse", fetch = FetchType.LAZY)
	private List<Reponse> listeReponsesAnnonce;
	
	@OneToMany(mappedBy = "annonceRdv", fetch = FetchType.LAZY)
	private List<RendezVous> listeRdvAnnonce;
	
	@ManyToOne
	@JoinColumn(name="idStockPerso")
	private StockPerso stockPersoAnnonce;
	
	@ManyToOne
	@JoinColumn(name="idMotifAnnulationAnnonce")
	private MotifAnnulationAnnonce motifAnnulationAnnonce;

	
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

	public Integer getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Integer idAnnonce) {
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

	public List<Reponse> getListeReponsesAnnonce() {
		return listeReponsesAnnonce;
	}

	public void setListeReponsesAnnonce(List<Reponse> listeReponsesAnnonce) {
		this.listeReponsesAnnonce = listeReponsesAnnonce;
	}

	public List<RendezVous> getListeRdvAnnonce() {
		return listeRdvAnnonce;
	}

	public void setListeRdvAnnonce(List<RendezVous> listeRdvAnnonce) {
		this.listeRdvAnnonce = listeRdvAnnonce;
	}

	public StockPerso getStockPersoAnnonce() {
		return stockPersoAnnonce;
	}

	public void setStockPersoAnnonce(StockPerso stockPersoAnnonce) {
		this.stockPersoAnnonce = stockPersoAnnonce;
	}

	public MotifAnnulationAnnonce getMotifAnnulationAnnonce() {
		return motifAnnulationAnnonce;
	}

	public void setMotifAnnulationAnnonce(MotifAnnulationAnnonce motifAnnulationAnnonce) {
		this.motifAnnulationAnnonce = motifAnnulationAnnonce;
	}

	
}
