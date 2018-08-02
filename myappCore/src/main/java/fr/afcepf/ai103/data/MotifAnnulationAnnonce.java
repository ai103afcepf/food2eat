package fr.afcepf.ai103.data;

public class MotifAnnulationAnnonce {
	
	private int idMotifAnnulationAnnonce;
	private String libelleMotifAnnulationAnnonce;
	
	public MotifAnnulationAnnonce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifAnnulationAnnonce [idMotifAnnulationAnnonce=" + idMotifAnnulationAnnonce
				+ ", libelleMotifAnnulationAnnonce=" + libelleMotifAnnulationAnnonce + "]";
	}

	public int getIdMotifAnnulationAnnonce() {
		return idMotifAnnulationAnnonce;
	}

	public void setIdMotifAnnulationAnnonce(int idMotifAnnulationAnnonce) {
		this.idMotifAnnulationAnnonce = idMotifAnnulationAnnonce;
	}

	public String getLibelleMotifAnnulationAnnonce() {
		return libelleMotifAnnulationAnnonce;
	}

	public void setLibelleMotifAnnulationAnnonce(String libelleMotifAnnulationAnnonce) {
		this.libelleMotifAnnulationAnnonce = libelleMotifAnnulationAnnonce;
	}
	
}
