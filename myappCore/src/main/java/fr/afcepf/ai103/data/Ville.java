package fr.afcepf.ai103.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ville {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVille;

	private String codePostal;
	private String nomVille;

	@ManyToOne
	private Region regions;

	public Ville() {
		super(); 

	} 

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", codePostal=" + codePostal + ", nomVille=" + nomVille + "]";
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
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

	public Region getRegions() {
		return regions;
	}

	public void setRegions(Region regions) {
		this.regions = regions;
	}

}
