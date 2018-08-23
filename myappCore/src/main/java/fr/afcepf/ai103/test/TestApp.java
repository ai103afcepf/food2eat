package fr.afcepf.ai103.test;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.afcepf.ai103.dao.DaoAnnonce;
import fr.afcepf.ai103.dao.DaoConsommation;
import fr.afcepf.ai103.dao.DaoReponse;
import fr.afcepf.ai103.dao.DaoStockPerso;
import fr.afcepf.ai103.data.Reponse;
import fr.afcepf.ai103.service.ServiceAnnonce;
import fr.afcepf.ai103.service.ServiceConsommation;
import fr.afcepf.ai103.service.ServiceReponse;
import fr.afcepf.ai103.service.ServiceStockPerso;



public class TestApp {

	public static void main(String[] args) throws ParseException {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappCore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		DaoConsommation daoC = new DaoConsommation();
		daoC.setEntityManager(em);
		
		ServiceConsommation servC=new ServiceConsommation();
		servC.setDaoConsommation(daoC);
		
		System.out.println("conso id stock 14: " + servC.recupererListAlimentsStockConso(14));
		
//		DaoStockPerso daoSP = new DaoStockPerso();
//		daoSP.setEntityManager(em);
//		
//		ServiceStockPerso servSP =new ServiceStockPerso();
//		servSP.setDaoStockPerso(daoSP);
//		
//		System.out.println("stock user 2: " + servSP.afficherStockByIdUtilisateur(2));
		
//		DaoReponse daoReponse = new DaoReponse();
//		daoReponse.setEntityManager(em);
//		
//		ServiceReponse serviceReponse = new ServiceReponse();
//		serviceReponse.setDaoReponse(daoReponse);
//		
//		DaoAnnonce daoAnnonce = new DaoAnnonce();
//		daoAnnonce.setEntityManager(em);
//		
//		ServiceAnnonce serviceAnnonce = new ServiceAnnonce();
//		serviceAnnonce.setDaoAnnonce(daoAnnonce);
//		
//		System.out.println("annonce " + serviceAnnonce.rechercherAnnoncesAccueil(1));
//		
//		System.out.println("reponse by annonce = " + serviceReponse.rechercherReponsesByAnnonce(1));
//		
//		System.out.println("reponse by user = " + serviceReponse.rechercherReponsesByUser(1));
//		
//		Reponse rep = new Reponse();
//		
//	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		String date1 = "22/06/2006";
//		rep.setDateReponseAnnonce(simpleDateFormat.parse(date1));
//		
//		daoReponse.insererReponse(rep);
		
		
		daoC.getEntityManager().getTransaction().commit();
		daoC.getEntityManager().close();

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
