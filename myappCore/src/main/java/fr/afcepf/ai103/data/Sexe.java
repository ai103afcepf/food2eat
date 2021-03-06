package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sexe {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSexe;
	
	private String libelleSexe;
	
	@OneToMany(mappedBy = "sexe", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<Utilisateur> listeUtilisateursSexe;
	
	public Sexe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sexe [idSexe=" + idSexe + ", libelleSexe=" + libelleSexe + "]";
	}

	public Integer getIdSexe() {
		return idSexe;
	}

	public void setIdSexe(Integer idSexe) {
		this.idSexe = idSexe;
	}

	public String getLibelleSexe() {
		return libelleSexe;
	}

	public void setLibelleSexe(String libelleSexe) {
		this.libelleSexe = libelleSexe;
	}

	public List<Utilisateur> getListeUtilisateursSexe() {
		return listeUtilisateursSexe;
	}

	public void setListeUtilisateursSexe(List<Utilisateur> listeUtilisateursSexe) {
		this.listeUtilisateursSexe = listeUtilisateursSexe;
	}


}
