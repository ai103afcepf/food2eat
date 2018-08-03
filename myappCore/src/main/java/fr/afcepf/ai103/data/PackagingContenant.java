package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PackagingContenant {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)//
	private int idPackagingContenant;
	
	private String libellePackagingContenant;
	private int duree_extention_apres_dlc;
	
	@OneToMany(mappedBy="packagingContenant",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesPackaging;
	
	public PackagingContenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PackagingContenant [idPackagingContenant=" + idPackagingContenant + ", libellePackagingContenant="
				+ libellePackagingContenant + ", duree_extention_apres_dlc=" + duree_extention_apres_dlc + "]";
	}

	public int getIdPackagingContenant() {
		return idPackagingContenant;
	}

	public void setIdPackagingContenant(int idPackagingContenant) {
		this.idPackagingContenant = idPackagingContenant;
	}

	public String getLibellePackagingContenant() {
		return libellePackagingContenant;
	}

	public void setLibellePackagingContenant(String libellePackagingContenant) {
		this.libellePackagingContenant = libellePackagingContenant;
	}

	public int getDuree_extention_apres_dlc() {
		return duree_extention_apres_dlc;
	}

	public void setDuree_extention_apres_dlc(int duree_extention_apres_dlc) {
		this.duree_extention_apres_dlc = duree_extention_apres_dlc;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesPackaging() {
		return listeAlimentsGeneriquesPackaging;
	}

	public void setListeAlimentsGeneriquesPackaging(List<AlimentGenerique> listeAlimentsGeneriquesPackaging) {
		this.listeAlimentsGeneriquesPackaging = listeAlimentsGeneriquesPackaging;
	}

}
