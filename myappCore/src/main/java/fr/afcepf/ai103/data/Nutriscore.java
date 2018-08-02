package fr.afcepf.ai103.data;

public class Nutriscore {
	
	private int idNutriscore;
	private String scoreNutriscore;
	private String imageNutriscore;
	
	public Nutriscore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nutriscore [idNutriscore=" + idNutriscore + ", scoreNutriscore=" + scoreNutriscore
				+ ", imageNutriscore=" + imageNutriscore + "]";
	}

	public int getIdNutriscore() {
		return idNutriscore;
	}

	public void setIdNutriscore(int idNutriscore) {
		this.idNutriscore = idNutriscore;
	}

	public String getScoreNutriscore() {
		return scoreNutriscore;
	}

	public void setScoreNutriscore(String scoreNutriscore) {
		this.scoreNutriscore = scoreNutriscore;
	}

	public String getImageNutriscore() {
		return imageNutriscore;
	}

	public void setImageNutriscore(String imageNutriscore) {
		this.imageNutriscore = imageNutriscore;
	}
	
}
