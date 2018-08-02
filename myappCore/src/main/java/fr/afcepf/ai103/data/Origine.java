package fr.afcepf.ai103.data;


public class Origine {

	private int idOrigine;
	private String libelleOrigine;

	public Origine() {
		super();
	}

	@Override
	public String toString() {
		return "Origine [idOrigine=" + idOrigine + ", libelleOrigine=" + libelleOrigine + "]";
	}

	public int getIdOrigine() {
		return idOrigine;
	}

	public void setIdOrigine(int idOrigine) {
		this.idOrigine = idOrigine;
	}

	public String getLibelleOrigine() {
		return libelleOrigine;
	}

	public void setLibelleOrigine(String libelleOrigine) {
		this.libelleOrigine = libelleOrigine;
	}

}
