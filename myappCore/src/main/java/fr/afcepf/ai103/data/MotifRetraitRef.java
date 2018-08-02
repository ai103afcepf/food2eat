package fr.afcepf.ai103.data;

public class MotifRetraitRef {
	
	private int idMotifRetraitRef;
	private String libelleMotifRetraitRef;
	
	public MotifRetraitRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifRetraitRef [idMotifRetraitRef=" + idMotifRetraitRef + ", libelleMotifRetraitRef="
				+ libelleMotifRetraitRef + "]";
	}

	public int getIdMotifRetraitRef() {
		return idMotifRetraitRef;
	}

	public void setIdMotifRetraitRef(int idMotifRetraitRef) {
		this.idMotifRetraitRef = idMotifRetraitRef;
	}

	public String getLibelleMotifRetraitRef() {
		return libelleMotifRetraitRef;
	}

	public void setLibelleMotifRetraitRef(String libelleMotifRetraitRef) {
		this.libelleMotifRetraitRef = libelleMotifRetraitRef;
	}

}
