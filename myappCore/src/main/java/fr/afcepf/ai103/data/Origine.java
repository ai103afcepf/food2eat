
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
public class Origine {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idOrigine;
	
	private String libelleOrigine;
	
	@OneToMany(mappedBy="origine",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesOrigine;
	

	public Origine() {
		super();
	}

	@Override
	public String toString() {
		return "Origine [idOrigine=" + idOrigine + ", libelleOrigine=" + libelleOrigine + "]";
	}

	public Integer getIdOrigine() {
		return idOrigine;
	}

	public void setIdOrigine(Integer idOrigine) {
		this.idOrigine = idOrigine;
	}

	public String getLibelleOrigine() {
		return libelleOrigine;
	}

	public void setLibelleOrigine(String libelleOrigine) {
		this.libelleOrigine = libelleOrigine;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesOrigine() {
		return listeAlimentsGeneriquesOrigine;
	}

	public void setListeAlimentsGeneriquesOrigine(List<AlimentGenerique> listeAlimentsGeneriquesOrigine) {
		this.listeAlimentsGeneriquesOrigine = listeAlimentsGeneriquesOrigine;
	}

}
