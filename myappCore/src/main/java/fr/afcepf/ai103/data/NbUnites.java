package fr.afcepf.ai103.data;

public class NbUnites {
	
	private int idNbUnites;
	private int quantiteNbUnites;
	
	public NbUnites() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NbUnites [idNbUnites=" + idNbUnites + ", quantiteNbUnites=" + quantiteNbUnites + "]";
	}

	public int getIdNbUnites() {
		return idNbUnites;
	}

	public void setIdNbUnites(int idNbUnites) {
		this.idNbUnites = idNbUnites;
	}

	public int getQuantiteNbUnites() {
		return quantiteNbUnites;
	}

	public void setQuantiteNbUnites(int quantiteNbUnites) {
		this.quantiteNbUnites = quantiteNbUnites;
	}
	
}
