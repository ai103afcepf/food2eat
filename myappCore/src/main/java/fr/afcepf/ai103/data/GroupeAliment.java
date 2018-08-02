package fr.afcepf.ai103.data;

public class GroupeAliment {
	
	private int idGroupeAliment;
	private String libelleGroupeAliment;
	
	public GroupeAliment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GroupeAliment [idGroupeAliment=" + idGroupeAliment + ", libelleGroupeAliment=" + libelleGroupeAliment
				+ "]";
	}

	public int getIdGroupeAliment() {
		return idGroupeAliment;
	}

	public void setIdGroupeAliment(int idGroupeAliment) {
		this.idGroupeAliment = idGroupeAliment;
	}

	public String getLibelleGroupeAliment() {
		return libelleGroupeAliment;
	}

	public void setLibelleGroupeAliment(String libelleGroupeAliment) {
		this.libelleGroupeAliment = libelleGroupeAliment;
	}
	
}
