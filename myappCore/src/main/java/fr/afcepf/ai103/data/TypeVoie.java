package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeVoie {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTypeVoie;
	private String libelleTypeVoie;
 
	@OneToMany(mappedBy = "typeVoie", fetch = FetchType.LAZY)
	private List<Adresse> listeAdresseTypeVoie;  

	public TypeVoie() {
		super();
	}

	@Override
	public String toString() {
		return "TypeVoie [idTypeVoie=" + idTypeVoie + ", libelleTypeVoie=" + libelleTypeVoie + "]";
	}

	public Integer getIdTypeVoie() {
		return idTypeVoie;
	}

	public void setIdTypeVoie(Integer idTypeVoie) {
		this.idTypeVoie = idTypeVoie;
	}

	public String getLibelleTypeVoie() {
		return libelleTypeVoie;
	}

	public void setLibelleTypeVoie(String libelleTypeVoie) {
		this.libelleTypeVoie = libelleTypeVoie;
	}

	public List<Adresse> getListeAdresseTypeVoie() {
		return listeAdresseTypeVoie;
	}

	public void setListeAdresseTypeVoie(List<Adresse> listeAdresseTypeVoie) {
		this.listeAdresseTypeVoie = listeAdresseTypeVoie;
	}


}
