package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Region {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRegion;
	private String libelleRegion;
	
	@OneToMany(mappedBy="region", fetch = FetchType.LAZY)
	private List<Ville> listeVilles;



	public Region() {
		super();

	}

	
	@Override
	public String toString() {
		return "Region [idRegion=" + idRegion + ", libelleRegion=" + libelleRegion + ", listeVilles=" + listeVilles
				+ "]";
	}


	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public String getLibelleRegion() {
		return libelleRegion;
	}

	public void setLibelleRegion(String libelleRegion) {
		this.libelleRegion = libelleRegion;
	}

	public List<Ville> getListeVilles() {
		return listeVilles;
	}

	public void setListeVilles(List<Ville> listeVilles) {
		this.listeVilles = listeVilles;
	}


}
