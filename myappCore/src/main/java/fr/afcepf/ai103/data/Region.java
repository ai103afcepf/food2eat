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
	private int idRegion;
	private String labelRegion;
	
	@OneToMany(mappedBy="regions", fetch = FetchType.LAZY)
	private List<Ville> villes;

	public List<Ville> getVilles() {
		return villes;
	}   

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public Region() {
		super();

	}

	@Override
	public String toString() {
		return "Region [idRegion=" + idRegion + ", labelRegion=" + labelRegion + "]";
	}

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getLabelRegion() {
		return labelRegion;
	}

	public void setLabelRegion(String labelRegion) {
		this.labelRegion = labelRegion;
	}

}
