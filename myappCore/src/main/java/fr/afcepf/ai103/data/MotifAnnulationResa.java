package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MotifAnnulationResa {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMotifAnnulationResa;
	
	private String libelleMotifAnnulationResa;
	 
	@OneToMany(mappedBy = "motifAnnulationResa", fetch = FetchType.LAZY)
	private List<Reponse> listeReponsesAnnulees;
	
	public MotifAnnulationResa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifAnnulationResa [idMotifAnnulationResa=" + idMotifAnnulationResa + ", libelleMotifAnnulationResa="
				+ libelleMotifAnnulationResa + "]";
	}

	public Integer getIdMotifAnnulationResa() {
		return idMotifAnnulationResa;
	} 

	

	public List<Reponse> getListeReponsesAnnulees() {
		return listeReponsesAnnulees;
	}

	public void setListeReponsesAnnulees(List<Reponse> listeReponsesAnnulees) {
		this.listeReponsesAnnulees = listeReponsesAnnulees;
	}

	public void setIdMotifAnnulationResa(Integer idMotifAnnulationResa) {
		this.idMotifAnnulationResa = idMotifAnnulationResa;
	}

	public String getLibelleMotifAnnulationResa() {
		return libelleMotifAnnulationResa;
	}

	public void setLibelleMotifAnnulationResa(String libelleMotifAnnulationResa) {
		this.libelleMotifAnnulationResa = libelleMotifAnnulationResa;
	}

}
