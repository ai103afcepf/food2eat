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
	private Integer idPackagingContenant;
	
	private String libellePackagingContenant;
	private Integer joursExtentionApresDlc;
	
	@OneToMany(mappedBy="packagingContenant",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesPackaging;
	
	public PackagingContenant() {
		super();
	}

	

	@Override
	public String toString() {
		return "PackagingContenant [idPackagingContenant=" + idPackagingContenant + ", libellePackagingContenant="
				+ libellePackagingContenant + "]";
	}



	public Integer getIdPackagingContenant() {
		return idPackagingContenant;
	}

	public void setIdPackagingContenant(Integer idPackagingContenant) {
		this.idPackagingContenant = idPackagingContenant;
	}

	public String getLibellePackagingContenant() {
		return libellePackagingContenant;
	}

	public void setLibellePackagingContenant(String libellePackagingContenant) {
		this.libellePackagingContenant = libellePackagingContenant;
	}



	public Integer getJoursExtentionApresDlc() {
		return joursExtentionApresDlc;
	}

	public void setJoursExtentionApresDlc(Integer joursExtentionApresDlc) {
		this.joursExtentionApresDlc = joursExtentionApresDlc;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesPackaging() {
		return listeAlimentsGeneriquesPackaging;
	}

	public void setListeAlimentsGeneriquesPackaging(List<AlimentGenerique> listeAlimentsGeneriquesPackaging) {
		this.listeAlimentsGeneriquesPackaging = listeAlimentsGeneriquesPackaging;
	}

}
