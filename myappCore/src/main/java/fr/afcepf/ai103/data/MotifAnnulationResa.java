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
	private int idMotifAnnulationResa;
	
	private String libelleMotifAnnulationResa;
	
	@OneToMany(mappedBy = "motifAnnulationResa", fetch = FetchType.LAZY)
	private List<Reponse> listeReponses;
	
	public MotifAnnulationResa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifAnnulationResa [idMotifAnnulationResa=" + idMotifAnnulationResa + ", libelleMotifAnnulationResa="
				+ libelleMotifAnnulationResa + "]";
	}

	public int getIdMotifAnnulationResa() {
		return idMotifAnnulationResa;
	} 

	public List<Reponse> getListeReponses() {
		return listeReponses;
	}

	public void setListeReponses(List<Reponse> listeReponses) {
		this.listeReponses = listeReponses;
	}

	public void setIdMotifAnnulationResa(int idMotifAnnulationResa) {
		this.idMotifAnnulationResa = idMotifAnnulationResa;
	}

	public String getLibelleMotifAnnulationResa() {
		return libelleMotifAnnulationResa;
	}

	public void setLibelleMotifAnnulationResa(String libelleMotifAnnulationResa) {
		this.libelleMotifAnnulationResa = libelleMotifAnnulationResa;
	}

}
