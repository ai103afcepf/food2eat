package fr.afcepf.ai103.data;

public class TypeVoie {
	
	private int idTypeVoie;
	private String libelleTypeVoie;
	
	public TypeVoie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TypeVoie [idTypeVoie=" + idTypeVoie + ", libelleTypeVoie=" + libelleTypeVoie + "]";
	}

	public int getIdTypeVoie() {
		return idTypeVoie;
	}

	public void setIdTypeVoie(int idTypeVoie) {
		this.idTypeVoie = idTypeVoie;
	}

	public String getLibelleTypeVoie() {
		return libelleTypeVoie;
	}

	public void setLibelleTypeVoie(String libelleTypeVoie) {
		this.libelleTypeVoie = libelleTypeVoie;
	}
	
}
