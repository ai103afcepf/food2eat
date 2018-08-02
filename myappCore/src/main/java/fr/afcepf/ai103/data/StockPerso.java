package fr.afcepf.ai103.data;

import java.util.Date;

public class StockPerso {
	
	private int idStockPerso;
	private int quantiteStockPerso;
	private Date dlcStockPerso;
	private Date dateAjoutStockPerso;
	private Date dateConsoChisieStockPerso;
	public StockPerso() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StockPerso [idStockPerso=" + idStockPerso + ", quantiteStockPerso=" + quantiteStockPerso
				+ ", dlcStockPerso=" + dlcStockPerso + ", dateAjoutStockPerso=" + dateAjoutStockPerso
				+ ", dateConsoChisieStockPerso=" + dateConsoChisieStockPerso + "]";
	}
	public int getIdStockPerso() {
		return idStockPerso;
	}
	public void setIdStockPerso(int idStockPerso) {
		this.idStockPerso = idStockPerso;
	}
	public int getQuantiteStockPerso() {
		return quantiteStockPerso;
	}
	public void setQuantiteStockPerso(int quantiteStockPerso) {
		this.quantiteStockPerso = quantiteStockPerso;
	}
	public Date getDlcStockPerso() {
		return dlcStockPerso;
	}
	public void setDlcStockPerso(Date dlcStockPerso) {
		this.dlcStockPerso = dlcStockPerso;
	}
	public Date getDateAjoutStockPerso() {
		return dateAjoutStockPerso;
	}
	public void setDateAjoutStockPerso(Date dateAjoutStockPerso) {
		this.dateAjoutStockPerso = dateAjoutStockPerso;
	}
	public Date getDateConsoChisieStockPerso() {
		return dateConsoChisieStockPerso;
	}
	public void setDateConsoChisieStockPerso(Date dateConsoChisieStockPerso) {
		this.dateConsoChisieStockPerso = dateConsoChisieStockPerso;
	}
}
