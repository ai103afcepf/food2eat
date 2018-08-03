package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatutAdresse {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStatutAdresse;
	private String libelleStatutAdresse;

	@OneToMany(mappedBy = "statutAdresse", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<Adresse> listeAdresses; 

	public StatutAdresse() {
		super(); 
	}

	@Override
	public String toString() {
		return "StatutAdresse [idStatutAdresse=" + idStatutAdresse + ", libelleStatutAdresse=" + libelleStatutAdresse
				+ "]";
	}

	public int getIdStatutAdresse() {
		return idStatutAdresse;
	}

	public void setIdStatutAdresse(int idStatutAdresse) {
		this.idStatutAdresse = idStatutAdresse;
	}

	public String getLibelleStatutAdresse() {
		return libelleStatutAdresse;
	}

	public void setLibelleStatutAdresse(String libelleStatutAdresse) {
		this.libelleStatutAdresse = libelleStatutAdresse;
	}

	public List<Adresse> getListeAdresses() {
		return listeAdresses;
	}

	public void setListeAdresses(List<Adresse> listeAdresses) {
		this.listeAdresses = listeAdresses;
	}

}
