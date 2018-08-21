package fr.afcepf.ai103.dao;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Consommation;
import fr.afcepf.ai103.data.StockPerso;

public class DaoConsommation implements IDaoConsommation {
	
	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;
	
	


	@Override
	public Consommation setConsommation(Consommation conso) {
		entityManager.persist(conso);
		return conso;
	}

	@Override
	public List<Consommation> getListAlimentsStockJeter(Integer idStockPerso) {
		return entityManager.createNamedQuery("StockPerso.findJeterByIdStock", Consommation.class)
				.setParameter("idStockPerso", idStockPerso).getResultList();
	}

	@Override
	public List<Consommation> getListAlimentsStockConso(Integer idStockPerso) {
		return entityManager.createNamedQuery("StockPerso.findConsoByIdStock", Consommation.class)
				.setParameter("idStockPerso", idStockPerso).getResultList();
	}

}
