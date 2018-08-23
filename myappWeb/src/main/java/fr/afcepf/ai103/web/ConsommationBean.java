package fr.afcepf.ai103.web;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

import fr.afcepf.ai103.data.Consommation;
import fr.afcepf.ai103.data.MotifJeter;
import fr.afcepf.ai103.data.StockPerso;
import fr.afcepf.ai103.service.IServiceConsommation;

@ManagedBean
@SessionScoped
public class ConsommationBean {
	
	private Integer idStockPerso;
	
	private Integer idConsommation;

	private Date dateManger;
	private Date dateJeter;
	private Integer quantiteConso;
	private StockPerso stockPersoConso;
	private MotifJeter motifJeter;
	
	private Consommation conso;
	private List<Consommation> consos;
	
	private Integer quantiteInitiale;
	private Integer quantiteRestante=4;
	private Integer sum;
	
	@EJB
	IServiceConsommation serviceConsommation;
	
	@PostConstruct
	public void init(ComponentSystemEvent event) {
		System.err.println(idStockPerso);
		calculQteRestante(idStockPerso);
		quantiteRestante=20;
		sommeQuantiteConso(idStockPerso);
		
	}
	
	public Integer calculQteRestante (Integer idStockPerso) {
		quantiteInitiale = stockPersoConso.getAlimentGenerique().getNombreUnitesAlimentGenerique();
		System.err.println(quantiteInitiale);
		
		if((conso.getIdConsommation() != null)&&(conso.getDateManger()!= null)) {
			quantiteRestante = quantiteInitiale-sommeQuantiteConso(idStockPerso);
		}
		else {
			quantiteRestante = quantiteInitiale;
		}
		quantiteRestante=10;
		return quantiteRestante;
	}
	
	public Integer quantiteInitiale (Integer idStock) {
		return stockPersoConso.getAlimentGenerique().getNombreUnitesAlimentGenerique();
		
	}
	
	public Integer sommeQuantiteConso (Integer idStockPerso) {
		sum=0;
		consos = serviceConsommation.recupererListAlimentsStockConso(idStockPerso);
		for (Consommation c : consos) {
			sum += c.getQuantiteConso();
		}
		System.err.println(sum);
		return sum;
	}
	
	

	public ConsommationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdStockPerso() {
		return idStockPerso;
	}

	public void setIdStockPerso(Integer idStockPerso) {
		this.idStockPerso = idStockPerso;
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

	public Consommation getConso() {
		return conso;
	}

	public void setConso(Consommation conso) {
		this.conso = conso;
	}

	public List<Consommation> getConsos() {
		return consos;
	}

	public void setConsos(List<Consommation> consos) {
		this.consos = consos;
	}

	public Integer getQuantiteRestante() {
		return quantiteRestante;
	}

	public void setQuantiteRestante(Integer quantiteRestante) {
		this.quantiteRestante = quantiteRestante;
	}

	public Integer getQuantiteInitiale() {
		return quantiteInitiale;
	}

	public void setQuantiteInitiale(Integer quantiteInitiale) {
		this.quantiteInitiale = quantiteInitiale;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

}
