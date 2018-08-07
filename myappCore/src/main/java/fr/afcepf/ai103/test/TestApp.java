package fr.afcepf.ai103.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.afcepf.ai103.dao.DaoAdresse;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.StatutAdresse;
import fr.afcepf.ai103.data.TypeVoie;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.data.Ville;
import fr.afcepf.ai103.service.ServiceAdresse;

public class TestApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappCore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		DaoAdresse daoAdresse = new DaoAdresse();
		daoAdresse.setEntityManager(em);

		Region region = new Region();
		region.setIdRegion(11);
		region.setLibelleRegion("Ile-de-France");

		TypeVoie typeVoie = new TypeVoie();
		typeVoie.setIdTypeVoie(11);
		typeVoie.setLibelleTypeVoie("Rue");

		StatutAdresse statutAdresse = new StatutAdresse();
		statutAdresse.setIdStatutAdresse(10);
		statutAdresse.setLibelleStatutAdresse("Principale");

		Ville ville = new Ville();
		ville.setIdVille(11);
		ville.setCodePostal("95170");
		ville.setNomVille("Deuil-la-Barre");
		ville.setRegion(region);

		Utilisateur user = new Utilisateur();
		// 1, null, null, null, null, 'email@gmail.com', 'GUENDOUZ', '071616123',
		// '1234', 'Kamel', 'gkamel', null, 2
		user.setIdUtilisateur(11);
		user.setDateDesinscription(null);
		user.setDateInscription(null);
		user.setDateLethargie(null);
		user.setDateNaissance(null);
		user.setEmail(null);
		user.setNom("KADRI");
		user.setNumeroTel("12232323");
		user.setPassword("1234");
		user.setPrenom("RABIE");
		user.setPseudo("pseudoRabie");

		Adresse adr2 = new Adresse();

		adr2.setCoordonneesGpsLat(43.8887);
		adr2.setCoordonneesGpsLong(2.8887);
		adr2.setDateDebutValidite(null);
		adr2.setDateFinValidite(null);
		adr2.setNomVoie("Charles de Gaulle");
		adr2.setNumero(23);

		// daoAdresse.insererAdresse(adr2);

		List<Adresse> listAdresses = daoAdresse.rechercherAdresses();
		System.out.println("Toutes les adresses " + listAdresses.toString());
		System.out.println(listAdresses.toString());

		List<Adresse> listByUser = daoAdresse.rechcherAdresseParIdUtilisateur(2);
		System.out.println("adresse by userID " + listByUser.toString());
	
		List<Adresse> listByCodePostal = daoAdresse.getAdresseByCodePostal("75000");
		System.out.println("Adresse by code postal = " + listByCodePostal);

		ServiceAdresse serviceAdresse = new ServiceAdresse();
		serviceAdresse.setDaoAdresse(daoAdresse);

		em.getTransaction().commit();
		daoAdresse.getEntityManager().getTransaction().commit();
		daoAdresse.getEntityManager().close();
		emf.close();

	}

}
