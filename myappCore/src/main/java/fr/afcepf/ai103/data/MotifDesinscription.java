package fr.afcepf.ai103.data;

public class MotifDesinscription {
	
	private int idMotifDesinscription;
	private String libelleMotifDesinscription;
	
	public MotifDesinscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifDesinscription [idMotifDesinscription=" + idMotifDesinscription + ", libelleMotifDesinscription="
				+ libelleMotifDesinscription + "]";
	}

	public int getIdMotifDesinscription() {
		return idMotifDesinscription;
	}

	public void setIdMotifDesinscription(int idMotifDesinscription) {
		this.idMotifDesinscription = idMotifDesinscription;
	}

	public String getLibelleMotifDesinscription() {
		return libelleMotifDesinscription;
	}

	public void setLibelleMotifDesinscription(String libelleMotifDesinscription) {
		this.libelleMotifDesinscription = libelleMotifDesinscription;
	}

}
