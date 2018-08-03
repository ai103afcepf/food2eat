package fr.afcepf.ai103.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MotifAnnulationAnnonce {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMotifAnnulationAnnonce;
	private String libelleMotifAnnulationAnnonce;
	 
	@ManyToOne
	@JoinColumn(name="idAnnonce")
	private Annonce annonce;
	
	public MotifAnnulationAnnonce() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Annonce getAnnonce() {
		return annonce;
	} 

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	@Override
	public String toString() {
		return "MotifAnnulationAnnonce [idMotifAnnulationAnnonce=" + idMotifAnnulationAnnonce
				+ ", libelleMotifAnnulationAnnonce=" + libelleMotifAnnulationAnnonce + "]";
	}

	public int getIdMotifAnnulationAnnonce() {
		return idMotifAnnulationAnnonce;
	}

	public void setIdMotifAnnulationAnnonce(int idMotifAnnulationAnnonce) {
		this.idMotifAnnulationAnnonce = idMotifAnnulationAnnonce;
	}

	public String getLibelleMotifAnnulationAnnonce() {
		return libelleMotifAnnulationAnnonce;
	}

	public void setLibelleMotifAnnulationAnnonce(String libelleMotifAnnulationAnnonce) {
		this.libelleMotifAnnulationAnnonce = libelleMotifAnnulationAnnonce;
	}
	
}
