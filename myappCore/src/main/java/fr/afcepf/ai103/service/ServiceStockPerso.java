package fr.afcepf.ai103.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import fr.afcepf.ai103.dao.IDaoStockPerso;
import fr.afcepf.ai103.data.StockPerso;

@Stateless
@Local
public class ServiceStockPerso implements IServiceStockPerso {

	@EJB
	private IDaoStockPerso daoStockPerso;

	@Override
	public StockPerso ajouterAlimentAuStock(StockPerso stockPerso) {
		if (stockPerso.getIdStockPerso() == null) {
			stockPerso = daoStockPerso.setAlimentAuStock(stockPerso);
		}
		return stockPerso;
	}

	@Override
	public List<StockPerso> afficherStockByIdUtilisateur(Integer idUtilisateur) {
		return daoStockPerso.getStockByIdUtilisateur(idUtilisateur);
	}

	@Override
	public StockPerso recupererAlimentById(Integer idStockPerso) {
		return daoStockPerso.getAlimentById(idStockPerso);
	}

	public IDaoStockPerso getDaoStockPerso() {
		return daoStockPerso;
	}

	public void setDaoStockPerso(IDaoStockPerso daoStockPerso) {
		this.daoStockPerso = daoStockPerso;
	}

}
