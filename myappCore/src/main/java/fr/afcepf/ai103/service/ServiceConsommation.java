package fr.afcepf.ai103.service;
 
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoConsommation;
import fr.afcepf.ai103.data.Consommation;

@Stateless
@Local
public class ServiceConsommation implements IServiceConsommation {
	
	@EJB
	private IDaoConsommation daoConsommation;

	@Override
	public Consommation ajouterConsommation(Consommation conso) {
		conso = daoConsommation.setConsommation(conso);
		return conso;
	}

	@Override
	public List<Consommation> recupererListAlimentsStockConso(Integer idStockPerso) {
		return daoConsommation.getListAlimentsStockConso(idStockPerso);
	}
	
	@Override
	public List<Consommation> recupererListAlimentsStockJeter(Integer idStockPerso) {
		return daoConsommation.getListAlimentsStockJeter(idStockPerso);
	}
	
	
	
	

	public IDaoConsommation getDaoConsommation() {
		return daoConsommation;
	}

	public void setDaoConsommation(IDaoConsommation daoConsommation) {
		this.daoConsommation = daoConsommation;
	}

	

}
