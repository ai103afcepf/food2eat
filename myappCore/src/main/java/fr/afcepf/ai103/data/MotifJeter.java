package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MotifJeter {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMotifJeter;
	
	private String libelleMotifJeter;
	
	@OneToMany(mappedBy="motifJeter", fetch=FetchType.LAZY)
	private List<Consommation> listeConsommations;
	
	public MotifJeter() {
		super();
	}

	@Override
	public String toString() {
		return "MotifJeter [idMotifJeter=" + idMotifJeter + ", libelleMotifJeter=" + libelleMotifJeter + "]";
	}

	public int getIdMotifJeter() {
		return idMotifJeter;
	}

	public void setIdMotifJeter(int idMotifJeter) {
		this.idMotifJeter = idMotifJeter;
	}

	public String getLibelleMotifJeter() {
		return libelleMotifJeter;
	}

	public void setLibelleMotifJeter(String libelleMotifJeter) {
		this.libelleMotifJeter = libelleMotifJeter;
	}

}
