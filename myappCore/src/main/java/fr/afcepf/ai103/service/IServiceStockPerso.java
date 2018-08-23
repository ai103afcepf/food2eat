package fr.afcepf.ai103.service;
 
import java.util.List;

import fr.afcepf.ai103.data.Consommation;
import fr.afcepf.ai103.data.StockPerso;

public interface IServiceStockPerso {
	
	public StockPerso ajouterAlimentAuStock(StockPerso stockPerso);
	
	public List<StockPerso> afficherStockByIdUtilisateur(Integer idUtilisateur);
	
	public StockPerso recupererAlimentById(Integer idStockPerso);
	
	public List<Consommation> afficherConsoByIdStock(Integer idStockPerso);
	
	public Integer sommeQuantitesConso (Integer idStockPerso);
	public Integer calculQuantitesRestante (Integer idStockPerso);

}
