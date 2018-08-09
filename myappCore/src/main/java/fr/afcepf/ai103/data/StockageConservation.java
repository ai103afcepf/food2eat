package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//
@Entity
public class StockageConservation {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idStockageConservation;
	
	private String libelleStockageConservation;
	private Integer joursExtensionApresDlcStockageConservation;
	
	@OneToMany(mappedBy="stockageConservation",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesStockage;

	public StockageConservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StockageConservation [idStockageConservation=" + idStockageConservation
				+ ", libelleStockageConservation=" + libelleStockageConservation
				+ ", joursExtensionApresDlcStockageConservation=" + joursExtensionApresDlcStockageConservation
				+ "]";
	}

	public Integer getIdStockageConservation() {
		return idStockageConservation;
	}

	public void setIdStockageConservation(Integer idStockageConservation) {
		this.idStockageConservation = idStockageConservation;
	}

	public String getLibelleStockageConservation() {
		return libelleStockageConservation;
	}

	public void setLibelleStockageConservation(String libelleStockageConservation) {
		this.libelleStockageConservation = libelleStockageConservation;
	}

	public Integer getJoursExtensionApresDlcStockageConservation() {
		return joursExtensionApresDlcStockageConservation;
	}

	public void setJoursExtensionApresDlcStockageConservation(Integer joursExtensionApresDlcStockageConservation) {
		this.joursExtensionApresDlcStockageConservation = joursExtensionApresDlcStockageConservation;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesStockage() {
		return listeAlimentsGeneriquesStockage;
	}

	public void setListeAlimentsGeneriquesStockage(List<AlimentGenerique> listeAlimentsGeneriquesStockage) {
		this.listeAlimentsGeneriquesStockage = listeAlimentsGeneriquesStockage;
	}
	
	
	

	
}
