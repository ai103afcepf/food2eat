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
public class MotifRejetRef {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMotifRejetRef;
	
	private String libelleMotifRejetRef;
	
	@OneToMany(mappedBy="motifRejetRef",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesMotifRejetRef;
	
	public MotifRejetRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifRejetRef [idLabel=" + idMotifRejetRef + ", libelleMotifRejetRef=" + libelleMotifRejetRef + "]";
	}

	public Integer getIdMotifRejetRef() {
		return idMotifRejetRef;
	}

	public void setIdMotifRejetRef(Integer idMotifRejetRef) {
		this.idMotifRejetRef = idMotifRejetRef;
	}

	public String getLibelleMotifRejetRef() {
		return libelleMotifRejetRef;
	}

	public void setLibelleMotifRejetRef(String libelleMotifRejetRef) {
		this.libelleMotifRejetRef = libelleMotifRejetRef;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesMotifRejetRef() {
		return listeAlimentsGeneriquesMotifRejetRef;
	}

	public void setListeAlimentsGeneriquesMotifRejetRef(List<AlimentGenerique> listeAlimentsGeneriquesMotifRejetRef) {
		this.listeAlimentsGeneriquesMotifRejetRef = listeAlimentsGeneriquesMotifRejetRef;
	}

	

}
