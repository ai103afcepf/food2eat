package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.StockPerso;

public interface IDaoStockPerso {
	
	public  StockPerso setAlimentAuStock(StockPerso stockPerso);
	
	public List<StockPerso> getStockByIdUtilisateur(Integer idUtilisateur);

	public StockPerso getAlimentById (Integer idStockPerso);
}
