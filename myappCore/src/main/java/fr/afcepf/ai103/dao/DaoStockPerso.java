package fr.afcepf.ai103.dao;
 
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Consommation;
import fr.afcepf.ai103.data.StockPerso;

@Stateless
@Local
public class DaoStockPerso implements IDaoStockPerso {

	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;


	@Override
	public StockPerso setAlimentAuStock(StockPerso stockPerso) {
		entityManager.persist(stockPerso);
		return stockPerso;
	}

	@Override
	public List<StockPerso> getStockByIdUtilisateur(Integer idUtilisateur) {
		return entityManager.createNamedQuery("StockPerso.findStockByIdUtilisateur", StockPerso.class)
				.setParameter("idUtilisateur", idUtilisateur).getResultList();
	}

	@Override
	public StockPerso getAlimentById(Integer idStockPerso) {
		return entityManager.find(StockPerso.class, idStockPerso);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Consommation> getDesConsommations(Integer idStockPerso) {
		return entityManager.createNamedQuery("Consommation.findConsoByIdStock", Consommation.class)
				.setParameter("idStockPerso", idStockPerso).getResultList();
	}

}
