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
public class Nutriscore {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idNutriscore;
	
	private String scoreNutriscore;
	private String imageNutriscore;
	
	@OneToMany(mappedBy="nutriscore",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesNutriscore;
	
	public Nutriscore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nutriscore [idNutriscore=" + idNutriscore + ", scoreNutriscore=" + scoreNutriscore
				+ ", imageNutriscore=" + imageNutriscore + "]";
	}

	public Integer getIdNutriscore() {
		return idNutriscore;
	}

	public void setIdNutriscore(Integer idNutriscore) {
		this.idNutriscore = idNutriscore;
	}

	public String getScoreNutriscore() {
		return scoreNutriscore;
	}

	public void setScoreNutriscore(String scoreNutriscore) {
		this.scoreNutriscore = scoreNutriscore;
	}

	public String getImageNutriscore() {
		return imageNutriscore;
	}

	public void setImageNutriscore(String imageNutriscore) {
		this.imageNutriscore = imageNutriscore;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesNutriscore() {
		return listeAlimentsGeneriquesNutriscore;
	}

	public void setListeAlimentsGeneriquesNutriscore(List<AlimentGenerique> listeAlimentsGeneriquesNutriscore) {
		this.listeAlimentsGeneriquesNutriscore = listeAlimentsGeneriquesNutriscore;
	}
	
}
