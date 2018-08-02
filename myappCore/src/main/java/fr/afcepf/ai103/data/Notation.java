package fr.afcepf.ai103.data;

public class Notation {
	
	private int idNotation;
	private int note;
	private String imageNotation;
	
	public Notation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Notation [idNotation=" + idNotation + ", note=" + note + ", imageNotation=" + imageNotation + "]";
	}

	public int getIdNotation() {
		return idNotation;
	}

	public void setIdNotation(int idNotation) {
		this.idNotation = idNotation;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getImageNotation() {
		return imageNotation;
	}

	public void setImageNotation(String imageNotation) {
		this.imageNotation = imageNotation;
	}	
	
}
