package fr.afcepf.ai103.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import fr.afcepf.ai103.dao.DaoAdresse;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.service.IServiceAdresse;
import fr.afcepf.ai103.service.ServiceAdresse;

public class TestAdresse {

	@Test
	public void adresseInserer() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myappCore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		DaoAdresse daoAdresse = new DaoAdresse();
		daoAdresse.setEntityManager(entityManager);

		Adresse adr2 = new Adresse();

		adr2.setIdAdresse(11);
		adr2.setCoordonneesGpsLat((long) 48.7889);
		adr2.setCoordonneesGpsLong((long) 2.7889);
		adr2.setNomVoie("Rabie");

		IServiceAdresse iServiceAdresse = new ServiceAdresse();
		iServiceAdresse.saveOrUpdateAdresse(adr2);
		System.out.println("Adresse " + adr2.toString());

		daoAdresse.getEntityManager().getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
