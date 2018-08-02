package fr.afcepf.ai103.data;

public class MotifJeter {
	
	private int idMotifJeter;
	private String libelleMotifJeter;
	
	public MotifJeter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifJeter [idMotifJeter=" + idMotifJeter + ", libelleMotifJeter=" + libelleMotifJeter + "]";
	}

	public int getIdMotifJeter() {
		return idMotifJeter;
	}

	public void setIdMotifJeter(int idMotifJeter) {
		this.idMotifJeter = idMotifJeter;
	}

	public String getLibelleMotifJeter() {
		return libelleMotifJeter;
	}

	public void setLibelleMotifJeter(String libelleMotifJeter) {
		this.libelleMotifJeter = libelleMotifJeter;
	}

}
