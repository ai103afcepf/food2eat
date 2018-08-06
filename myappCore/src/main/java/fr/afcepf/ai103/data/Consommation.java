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
	private Integer idConsommation;

	private Date dateManger;
	private Date dateJeter;
	private Integer quantiteConso;

	@ManyToOne
	@JoinColumn(name = "idStockPerso")
	private StockPerso stockPersoConso;

	@ManyToOne
	@JoinColumn(name = "idMotifJeter")
	private MotifJeter motifJeter;

	public Consommation() {
		super();
	}

	@Override
	public String toString() {
		return "Consommation [idConsommation=" + idConsommation + ", dateManger=" + dateManger + ", dateJeter="
				+ dateJeter + ", quantiteConso=" + quantiteConso + "]";
	}

	public Integer getIdConsommation() {
		return idConsommation;
	}

	public void setIdConsommation(Integer idConsommation) {
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

	public Integer getQuantiteConso() {
		return quantiteConso;
	}

	public void setQuantiteConso(Integer quantiteConso) {
		this.quantiteConso = quantiteConso;
	}

	public StockPerso getStockPersoConso() {
		return stockPersoConso;
	}

	public void setStockPersoConso(StockPerso stockPersoConso) {
		this.stockPersoConso = stockPersoConso;
	}

	public MotifJeter getMotifJeter() {
		return motifJeter;
	}

	public void setMotifJeter(MotifJeter motifJeter) {
		this.motifJeter = motifJeter;
	}

}
