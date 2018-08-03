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
//
@Entity
public class CategorieAliment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategorieAliment;
	
	private String libelleCategorieAliment;
	private int dureeExtensionApresDlcCategorieAliment;
	
	@ManyToOne
	@JoinColumn(name="idGroupeAliment")
	private GroupeAliment groupeAliment;
	
	@OneToMany(mappedBy="categorieAliment",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesCategorie;
	
	
	public CategorieAliment() {
		super();
	}

	@Override
	public String toString() {
		return "CategorieAliment [idCategorieAliment=" + idCategorieAliment + ", libelleCategorieAliment="
				+ libelleCategorieAliment + ", dureeExtensionApresDlcCategorieAliment="
				+ dureeExtensionApresDlcCategorieAliment + "]";
	}

	public int getIdCategorieAliment() {
		return idCategorieAliment;
	}

	public void setIdCategorieAliment(int idCategorieAliment) {
		this.idCategorieAliment = idCategorieAliment;
	}

	public String getLibelleCategorieAliment() {
		return libelleCategorieAliment;
	}

	public void setLibelleCategorieAliment(String libelleCategorieAliment) {
		this.libelleCategorieAliment = libelleCategorieAliment;
	}

	public int getDureeExtensionApresDlcCategorieAliment() {
		return dureeExtensionApresDlcCategorieAliment;
	}

	public void setDureeExtensionApresDlcCategorieAliment(int dureeExtensionApresDlcCategorieAliment) {
		this.dureeExtensionApresDlcCategorieAliment = dureeExtensionApresDlcCategorieAliment;
	}

	public GroupeAliment getGroupeAliment() {
		return groupeAliment;
	}

	public void setGroupeAliment(GroupeAliment groupeAliment) {
		this.groupeAliment = groupeAliment;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesCategorie() {
		return listeAlimentsGeneriquesCategorie;
	}

	public void setListeAlimentsGeneriquesCategorie(List<AlimentGenerique> listeAlimentsGeneriquesCategorie) {
		this.listeAlimentsGeneriquesCategorie = listeAlimentsGeneriquesCategorie;
	}

	
	
}
