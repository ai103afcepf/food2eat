package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ville {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVille;

	private String codePostal;
	private String nomVille;
	
	@OneToMany(mappedBy="villeAdresse",fetch=FetchType.LAZY)
	private List<Adresse> listeAdressesVille;

	@ManyToOne
	@JoinColumn(name="idRegion")
	private Region region;

	public Ville() {
		super(); 

	} 

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", codePostal=" + codePostal + ", nomVille=" + nomVille + "]";
	}

	public Integer getIdVille() {
		return idVille;
	}

	public void setIdVille(Integer idVille) {
		this.idVille = idVille;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public List<Adresse> getListeAdressesVille() {
		return listeAdressesVille;
	}

	public void setListeAdressesVille(List<Adresse> listeAdressesVille) {
		this.listeAdressesVille = listeAdressesVille;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	

}
