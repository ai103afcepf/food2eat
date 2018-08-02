package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Consommation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsommation;
	
	private Date dateManger;
	private Date dateJeter;
	private int quantiteConso;
	
	@ManyToOne
	@JoinColumn(name="idStockPerso")
	private StockPerso stockPerso;
	
	public Consommation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Consommation [idConsommation=" + idConsommation + ", dateManger=" + dateManger + ", dateJeter="
				+ dateJeter + ", quantiteConso=" + quantiteConso + "]";
	}

	public int getIdConsommation() {
		return idConsommation;
	}

	public void setIdConsommation(int idConsommation) {
		this.idConsommation = idConsommation;
	}

	public Date getDateManger() {
		return dateManger;
	}

	public void setDateManger(Date dateManger) {
		this.dateManger = dateManger;
	}

	public Date getDateJeter() {
		return dateJeter;
	}

	public void setDateJeter(Date dateJeter) {
		this.dateJeter = dateJeter;
	}

	public int getQuantiteConso() {
		return quantiteConso;
	}

	public void setQuantiteConso(int quantiteConso) {
		this.quantiteConso = quantiteConso;
	}

	public StockPerso getStockPerso() {
		return stockPerso;
	}

	public void setStockPerso(StockPerso stockPerso) {
		this.stockPerso = stockPerso;
	}
	
}
