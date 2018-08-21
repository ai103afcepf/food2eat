package fr.afcepf.ai103.dao;
 
import java.util.List;

import fr.afcepf.ai103.data.Consommation;

public interface IDaoConsommation {
	
	public Consommation setConsommation (Consommation conso);
	public List<Consommation> getListAlimentsStockJeter (Integer idStockPerso);
	public List<Consommation> getListAlimentsStockConso (Integer idStockPerso);
	
}
