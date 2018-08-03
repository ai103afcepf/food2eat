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
	private int idSexe;
	
	private String libelleSexe;
	
	@OneToMany(mappedBy = "sexe", fetch = FetchType.LAZY)
	// @JsonIgnore
	private List<Utilisateur> listeUtilisateurs;
	
	public Sexe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sexe [idSexe=" + idSexe + ", libelleSexe=" + libelleSexe + "]";
	}

	public int getIdSexe() {
		return idSexe;
	}

	public void setIdSexe(int idSexe) {
		this.idSexe = idSexe;
	}

	public String getLibelleSexe() {
		return libelleSexe;
	}

	public void setLibelleSexe(String libelleSexe) {
		this.libelleSexe = libelleSexe;
	}

	public List<Utilisateur> getListeUtilisateurs() {
		return listeUtilisateurs;
	}

	public void setListeUtilisateurs(List<Utilisateur> listeUtilisateurs) {
		this.listeUtilisateurs = listeUtilisateurs;
	}

}
