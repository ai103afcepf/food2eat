package fr.afcepf.ai103.data;

public class PackagingContenant {
	
	private int idPackagingContenant;
	private String libellePackagingContenant;
	private int duree_extention_apres_dlc;
	
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

}
