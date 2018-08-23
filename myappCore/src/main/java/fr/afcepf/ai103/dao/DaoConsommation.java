package fr.afcepf.ai103.dao;
 
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.afcepf.ai103.data.Consommation;

@Stateless
@Local
public class DaoConsommation implements IDaoConsommation {
	
	@PersistenceContext(unitName = "myappCore")
	private EntityManager entityManager;
	
	
	@Override
	public Consommation setConsommation(Consommation conso) {
		entityManager.persist(conso);
		return conso;
	}

	@Override
	public List<Consommation> getListAlimentsStockConso(Integer idStockPerso) {
		return entityManager.createNamedQuery("Consommation.findConsoByIdStock", Consommation.class)
				.setParameter("idStockPerso", idStockPerso).getResultList();
	}
	
	@Override
	public List<Consommation> getListAlimentsStockJeter(Integer idStockPerso) {
		return entityManager.createNamedQuery("Consommation.findJeterByIdStock", Consommation.class)
				.setParameter("idStockPerso", idStockPerso).getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}




	

}
