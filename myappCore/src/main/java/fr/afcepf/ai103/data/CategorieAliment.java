package fr.afcepf.ai103.data;

public class CategorieAliment {
	
	private int idCategorieAliment;
	private String libelleCategorieAliment;
	private int dureeExtensionApresDlcCategorieAliment;
	
	public CategorieAliment() {
		super();
		// TODO Auto-generated constructor stub
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
	
}
