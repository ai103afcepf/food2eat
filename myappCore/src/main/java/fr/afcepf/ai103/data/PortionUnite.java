package fr.afcepf.ai103.data;

public class PortionUnite {
	
	private int idPortionUnite;
	private int quantitePortionUnite;
	private String unitePortionUnite;
	
	public PortionUnite() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PortionUnite [idPortionUnite=" + idPortionUnite + ", quantitePortionUnite=" + quantitePortionUnite
				+ ", unitePortionUnite=" + unitePortionUnite + "]";
	}

	public int getIdPortionUnite() {
		return idPortionUnite;
	}

	public void setIdPortionUnite(int idPortionUnite) {
		this.idPortionUnite = idPortionUnite;
	}

	public int getQuantitePortionUnite() {
		return quantitePortionUnite;
	}

	public void setQuantitePortionUnite(int quantitePortionUnite) {
		this.quantitePortionUnite = quantitePortionUnite;
	}

	public String getUnitePortionUnite() {
		return unitePortionUnite;
	}

	public void setUnitePortionUnite(String unitePortionUnite) {
		this.unitePortionUnite = unitePortionUnite;
	}
	
}
