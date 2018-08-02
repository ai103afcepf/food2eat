package fr.afcepf.ai103.data;

public class Label {
	
	private int idLabel;
	private String libelleLabel;
	private String imageLabel;
	
	public Label() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Label [idLabel=" + idLabel + ", libelleLabel=" + libelleLabel + ", imageLabel=" + imageLabel + "]";
	}

	public int getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(int idLabel) {
		this.idLabel = idLabel;
	}

	public String getLibelleLabel() {
		return libelleLabel;
	}

	public void setLibelleLabel(String libelleLabel) {
		this.libelleLabel = libelleLabel;
	}

	public String getImageLabel() {
		return imageLabel;
	}

	public void setImageLabel(String imageLabel) {
		this.imageLabel = imageLabel;
	}
	
}
