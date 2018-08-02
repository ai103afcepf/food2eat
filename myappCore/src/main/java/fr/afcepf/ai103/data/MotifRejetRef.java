package fr.afcepf.ai103.data;

public class MotifRejetRef {
	
	private int idLabel;
	private String libelleMotifRejetRef;
	
	public MotifRejetRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MotifRejetRef [idLabel=" + idLabel + ", libelleMotifRejetRef=" + libelleMotifRejetRef + "]";
	}

	public int getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(int idLabel) {
		this.idLabel = idLabel;
	}

	public String getLibelleMotifRejetRef() {
		return libelleMotifRejetRef;
	}

	public void setLibelleMotifRejetRef(String libelleMotifRejetRef) {
		this.libelleMotifRejetRef = libelleMotifRejetRef;
	}

}
