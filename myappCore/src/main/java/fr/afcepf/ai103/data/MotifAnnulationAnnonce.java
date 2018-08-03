package fr.afcepf.ai103.data;

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
public class MotifAnnulationAnnonce {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMotifAnnulationAnnonce;
	private String libelleMotifAnnulationAnnonce;
	 
	@OneToMany(mappedBy="motifAnnulationAnnonce",fetch=FetchType.LAZY)
	private List<Annonce> listeAnnoncesAnnulees;
	
	
	public MotifAnnulationAnnonce() {
		super();
		// TODO Auto-generated constructor stub
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


	public List<Annonce> getListeAnnoncesAnnulees() {
		return listeAnnoncesAnnulees;
	}


	public void setListeAnnoncesAnnulees(List<Annonce> listeAnnoncesAnnulees) {
		this.listeAnnoncesAnnulees = listeAnnoncesAnnulees;
	}

	
}
