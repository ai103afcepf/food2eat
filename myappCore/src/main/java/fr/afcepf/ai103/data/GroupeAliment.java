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
public class GroupeAliment {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGroupeAliment;
	
	private String libelleGroupeAliment;
	
	@OneToMany(mappedBy = "groupeAliment", fetch = FetchType.LAZY)
	private List<CategorieAliment> listeCategorieAliments;
	
	public GroupeAliment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GroupeAliment [idGroupeAliment=" + idGroupeAliment + ", libelleGroupeAliment=" + libelleGroupeAliment
				+ "]";
	}

	public Integer getIdGroupeAliment() {
		return idGroupeAliment;
	}

	public void setIdGroupeAliment(Integer idGroupeAliment) {
		this.idGroupeAliment = idGroupeAliment;
	}

	public String getLibelleGroupeAliment() {
		return libelleGroupeAliment;
	}

	public void setLibelleGroupeAliment(String libelleGroupeAliment) {
		this.libelleGroupeAliment = libelleGroupeAliment;
	}

	public List<CategorieAliment> getListeCategorieAliments() {
		return listeCategorieAliments;
	}

	public void setListeCategorieAliments(List<CategorieAliment> listeCategorieAliments) {
		this.listeCategorieAliments = listeCategorieAliments;
	}
	
}
