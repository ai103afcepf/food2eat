package fr.afcepf.ai103.data;

public class StockageConservation {
	
	private int idStockageConservation;
	private String libelleStockageConservation;
	private int duree_extention_apres_dlcStockageConservation;
	
	public StockageConservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StockageConservation [idStockageConservation=" + idStockageConservation
				+ ", libelleStockageConservation=" + libelleStockageConservation
				+ ", duree_extention_apres_dlcStockageConservation=" + duree_extention_apres_dlcStockageConservation
				+ "]";
	}

	public int getIdStockageConservation() {
		return idStockageConservation;
	}

	public void setIdStockageConservation(int idStockageConservation) {
		this.idStockageConservation = idStockageConservation;
	}

	public String getLibelleStockageConservation() {
		return libelleStockageConservation;
	}

	public void setLibelleStockageConservation(String libelleStockageConservation) {
		this.libelleStockageConservation = libelleStockageConservation;
	}

	public int getDuree_extention_apres_dlcStockageConservation() {
		return duree_extention_apres_dlcStockageConservation;
	}

	public void setDuree_extention_apres_dlcStockageConservation(int duree_extention_apres_dlcStockageConservation) {
		this.duree_extention_apres_dlcStockageConservation = duree_extention_apres_dlcStockageConservation;
	}
	
}
