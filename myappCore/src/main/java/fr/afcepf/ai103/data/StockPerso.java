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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StockPerso {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idStockPerso;
	
	private Integer quantiteStockPerso;
	@Temporal(TemporalType.DATE)
	private Date dlcStockPerso;
	@Temporal(TemporalType.DATE)
	private Date dateAjoutStockPerso;
	@Temporal(TemporalType.DATE)
	private Date dateConsoChoisieStockPerso;
	
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateurStock;
	
	@OneToMany(mappedBy="stockPersoConso", fetch=FetchType.LAZY)
	private List<Consommation> listeConsommations;
	
	@OneToMany(mappedBy="stockPersoAnnonce", fetch=FetchType.LAZY)
	private List<Annonce> listesAnnoncesStock;
	
	@ManyToOne
	@JoinColumn(name="idAlimentGenerique")
	private AlimentGenerique alimentGenerique;
	
	public StockPerso() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StockPerso [idStockPerso=" + idStockPerso + ", quantiteStockPerso=" + quantiteStockPerso
				+ ", dlcStockPerso=" + dlcStockPerso + ", dateAjoutStockPerso=" + dateAjoutStockPerso
				+ ", dateConsoChoisieStockPerso=" + dateConsoChoisieStockPerso + "]";
	}
	public Integer getIdStockPerso() {
		return idStockPerso;
	}
	public void setIdStockPerso(Integer idStockPerso) {
		this.idStockPerso = idStockPerso;
	}
	public Integer getQuantiteStockPerso() {
		return quantiteStockPerso;
	}
	public void setQuantiteStockPerso(Integer quantiteStockPerso) {
		this.quantiteStockPerso = quantiteStockPerso;
	}
	public Date getDlcStockPerso() {
		return dlcStockPerso;
	}
	public void setDlcStockPerso(Date dlcStockPerso) {
		this.dlcStockPerso = dlcStockPerso;
	}
	public Date getDateAjoutStockPerso() {
		return dateAjoutStockPerso;
	}
	public void setDateAjoutStockPerso(Date dateAjoutStockPerso) {
		this.dateAjoutStockPerso = dateAjoutStockPerso;
	}
	public Date getDateConsoChoisieStockPerso() {
		return dateConsoChoisieStockPerso;
	}
	public void setDateConsoChoisieStockPerso(Date dateConsoChoisieStockPerso) {
		this.dateConsoChoisieStockPerso = dateConsoChoisieStockPerso;
	}
	public List<Consommation> getListeConsommations() {
		return listeConsommations;
	}
	public void setListeConsommations(List<Consommation> listeConsommations) {
		this.listeConsommations = listeConsommations;
	}
	public List<Annonce> getListesAnnoncesStock() {
		return listesAnnoncesStock;
	}
	public void setListesAnnoncesStock(List<Annonce> listesAnnoncesStock) {
		this.listesAnnoncesStock = listesAnnoncesStock;
	}
	public AlimentGenerique getAlimentGenerique() {
		return alimentGenerique;
	}
	public void setAlimentGenerique(AlimentGenerique alimentGenerique) {
		this.alimentGenerique = alimentGenerique;
	}
	public Utilisateur getUtilisateurStock() {
		return utilisateurStock;
	}
	public void setUtilisateurStock(Utilisateur utilisateurStock) {
		this.utilisateurStock = utilisateurStock;
	}
	

}
