package fr.afcepf.ai103.test;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestApp {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappCore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		/***********************
		 * Tests des classes Dao et Service
		 **************************/
		/*********************** Classe Region **************************/
		/*
		 * DaoRegion daoRegion = new DaoRegion(); daoRegion.setEntityManager(em);
		 * 
		 * Region reg = new Region(); reg.setLibelleRegion("Centre");
		 * 
		 * // Inserer ou modifier serviceRegion.creerOrModifierRegion(reg);
		 * 
		 * 
		 * ServiceRegion serviceRegion = new ServiceRegion();
		 * serviceRegion.setDaoRegion(daoRegion);
		 * 
		 * // Toutes les regions // System.out.println("Toutes Regions " + //
		 * daoRegion.rechercherRegions().toString());
		 * 
		 * // Region par IdRegion // System.out.println("Region par ID Region = " + //
		 * daoRegion.rechercherRegionByIdRegion(1));
		 * 
		 * // Region par Libelle Region //
		 * System.out.println("Region par libelle region = " + //
		 * daoRegion.rechercherRegionByLibelleRegion("IDF"));
		 * 
		 * // Ville par Region /* System.out.println("Ville par Region = " +
		 * daoRegion.rechercherVilleParRegion(1));
		 * 
		 * 
		 * daoRegion.getEntityManager().getTransaction().commit();
		 * daoRegion.getEntityManager().close();
		 */

		emf.close();

	}

}
