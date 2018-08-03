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
	private int idMotifDesinscription;
	private String libelleMotifDesinscription;
	
	@OneToMany(mappedBy = "motifDesinscription", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<Utilisateur> listeUtilisateurs;
	
	public MotifDesinscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifDesinscription [idMotifDesinscription=" + idMotifDesinscription + ", libelleMotifDesinscription="
				+ libelleMotifDesinscription + "]";
	}

	public int getIdMotifDesinscription() {
		return idMotifDesinscription;
	}

	public void setIdMotifDesinscription(int idMotifDesinscription) {
		this.idMotifDesinscription = idMotifDesinscription;
	}

	public String getLibelleMotifDesinscription() {
		return libelleMotifDesinscription;
	}

	public void setLibelleMotifDesinscription(String libelleMotifDesinscription) {
		this.libelleMotifDesinscription = libelleMotifDesinscription;
	}

	public List<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}

	public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
		this.listeUtilisateurs = listeUtilisateurs;
	}

}
