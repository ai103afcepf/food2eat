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
public class StockPerso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStockPerso;
	
	private int quantiteStockPerso;
	private Date dlcStockPerso;
	private Date dateAjoutStockPerso;
	private Date dateConsoChoisieStockPerso;
	
	@OneToMany(mappedBy="stockPerso", fetch=FetchType.LAZY)
	private List<Consommation> listeConsommations;
	
	@OneToMany(mappedBy="stockPerso", fetch=FetchType.LAZY)
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
	public int getIdStockPerso() {
		return idStockPerso;
	}
	public void setIdStockPerso(int idStockPerso) {
		this.idStockPerso = idStockPerso;
	}
	public int getQuantiteStockPerso() {
		return quantiteStockPerso;
	}
	public void setQuantiteStockPerso(int quantiteStockPerso) {
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

}
