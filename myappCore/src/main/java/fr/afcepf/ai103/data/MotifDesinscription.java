package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MotifDesinscription {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMotifDesinscription;
	private String libelleMotifDesinscription;
	
	@OneToMany(mappedBy = "motifDesinscription", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<Utilisateur> listeUtilisateursDesinscription;
	
	public MotifDesinscription() {
		super();
	}

	@Override
	public String toString() {
		return "MotifDesinscription [idMotifDesinscription=" + idMotifDesinscription + ", libelleMotifDesinscription="
				+ libelleMotifDesinscription + "]";
	}

	public Integer getIdMotifDesinscription() {
		return idMotifDesinscription;
	}

	public void setIdMotifDesinscription(Integer idMotifDesinscription) {
		this.idMotifDesinscription = idMotifDesinscription;
	}

	public String getLibelleMotifDesinscription() {
		return libelleMotifDesinscription;
	}

	public void setLibelleMotifDesinscription(String libelleMotifDesinscription) {
		this.libelleMotifDesinscription = libelleMotifDesinscription;
	}

	public List<Utilisateur> getListeUtilisateursDesinscription() {
		return listeUtilisateursDesinscription;
	}

	public void setListeUtilisateursDesinscription(List<Utilisateur> listeUtilisateursDesinscription) {
		this.listeUtilisateursDesinscription = listeUtilisateursDesinscription;
	}

	
}
