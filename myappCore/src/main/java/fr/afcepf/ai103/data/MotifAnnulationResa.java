package fr.afcepf.ai103.data;

public class MotifAnnulationResa {
	
	private int idMotifAnnulationResa;
	private String libelleMotifAnnulationResa;
	
	public MotifAnnulationResa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifAnnulationResa [idMotifAnnulationResa=" + idMotifAnnulationResa + ", libelleMotifAnnulationResa="
				+ libelleMotifAnnulationResa + "]";
	}

	public int getIdMotifAnnulationResa() {
		return idMotifAnnulationResa;
	}

	public void setIdMotifAnnulationResa(int idMotifAnnulationResa) {
		this.idMotifAnnulationResa = idMotifAnnulationResa;
	}

	public String getLibelleMotifAnnulationResa() {
		return libelleMotifAnnulationResa;
	}

	public void setLibelleMotifAnnulationResa(String libelleMotifAnnulationResa) {
		this.libelleMotifAnnulationResa = libelleMotifAnnulationResa;
	}

}
