package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MotifRetraitRef {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMotifRetraitRef;
	
	private String libelleMotifRetraitRef;
	
	@OneToMany(mappedBy="motifRetraitRef",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesMotifRetraitRef;
	
	
	public MotifRetraitRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifRetraitRef [idMotifRetraitRef=" + idMotifRetraitRef + ", libelleMotifRetraitRef="
				+ libelleMotifRetraitRef + "]";
	}

	public int getIdMotifRetraitRef() {
		return idMotifRetraitRef;
	}

	public void setIdMotifRetraitRef(int idMotifRetraitRef) {
		this.idMotifRetraitRef = idMotifRetraitRef;
	}

	public String getLibelleMotifRetraitRef() {
		return libelleMotifRetraitRef;
	}

	public void setLibelleMotifRetraitRef(String libelleMotifRetraitRef) {
		this.libelleMotifRetraitRef = libelleMotifRetraitRef;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesMotifRetraitRef() {
		return listeAlimentsGeneriquesMotifRetraitRef;
	}

	public void setListeAlimentsGeneriquesMotifRetraitRef(List<AlimentGenerique> listeAlimentsGeneriquesMotifRetraitRef) {
		this.listeAlimentsGeneriquesMotifRetraitRef = listeAlimentsGeneriquesMotifRetraitRef;
	}

}
