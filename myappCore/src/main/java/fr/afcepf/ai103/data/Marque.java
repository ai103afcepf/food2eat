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
public class Marque {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMarque;
	
	private String libelleMarque;
	
	@OneToMany(mappedBy="marque",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesMarque;

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marque [idMarque=" + idMarque + ", libelleMarque=" + libelleMarque + ", listeAlimentsGeneriquesMarque="
				+ listeAlimentsGeneriquesMarque + "]";
	}

	public Integer getIdMarque() {
		return idMarque;
	}

	public void setIdMarque(Integer idMarque) {
		this.idMarque = idMarque;
	}

	public String getLibelleMarque() {
		return libelleMarque;
	}

	public void setLibelleMarque(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesMarque() {
		return listeAlimentsGeneriquesMarque;
	}

	public void setListeAlimentsGeneriquesMarque(List<AlimentGenerique> listeAlimentsGeneriquesMarque) {
		this.listeAlimentsGeneriquesMarque = listeAlimentsGeneriquesMarque;
	}
	
	
	
	
}
