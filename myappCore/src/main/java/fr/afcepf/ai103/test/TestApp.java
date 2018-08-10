package fr.afcepf.ai103.test;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.afcepf.ai103.dao.DaoAdresse;
import fr.afcepf.ai103.dao.DaoRegion;
import fr.afcepf.ai103.dao.DaoVille;
import fr.afcepf.ai103.data.Adresse;
import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.StatutAdresse;
import fr.afcepf.ai103.data.TypeVoie;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.data.Ville;
import fr.afcepf.ai103.service.ServiceAdresse;
import fr.afcepf.ai103.service.ServiceRegion;
import fr.afcepf.ai103.service.ServiceVille;

public class TestApp {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappCore");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		/******* Test Ville ********/
		DaoVille daoVille = new DaoVille();
		daoVille.setEntityManager(em);

		ServiceVille serviceVille = new ServiceVille();
		serviceVille.setDaoVille(daoVille);

		System.out.println("Adresse by ville - idVille = 1 - : " + serviceVille.rechercherAdresseByNomVille(1));

		daoVille.getEntityManager().getTransaction().commit();
		daoVille.getEntityManager().close();

		/*** Test Adresse ***/
		/*
		 * DaoAdresse daoAdresse = new DaoAdresse(); daoAdresse.setEntityManager(em);
		 * 
		 * Region region = new Region(); region.setIdRegion(11);
		 * region.setLibelleRegion("Ile-de-France");
		 * 
		 * TypeVoie typeVoie = new TypeVoie(); typeVoie.setIdTypeVoie(11);
		 * typeVoie.setLibelleTypeVoie("Rue");
		 * 
		 * StatutAdresse statutAdresse = new StatutAdresse();
		 * statutAdresse.setIdStatutAdresse(10);
		 * statutAdresse.setLibelleStatutAdresse("Principale");
		 * 
		 * Ville ville = new Ville(); ville.setIdVille(11);
		 * ville.setCodePostal("95170"); ville.setNomVille("Deuil-la-Barre");
		 * ville.setRegion(region);
		 * 
		 * Utilisateur user = new Utilisateur(); user.setDateInscription(null);
		 * user.setDateLethargie(null); user.setDateNaissance(null);
		 * user.setEmail(null); user.setNom("KADRI"); user.setNumeroTel("12232323");
		 * user.setPassword("1234"); user.setPrenom("RABIE");
		 * user.setPseudo("pseudoRabie");
		 * 
		 * Adresse adr2 = new Adresse(); adr2.setIdAdresse(3);
		 * adr2.setCoordonneesGpsLat(43.8887); adr2.setCoordonneesGpsLong(2.8887);
		 * adr2.setDateDebutValidite(null); adr2.setDateFinValidite(null);
		 * adr2.setNomVoie("Rivoli"); adr2.setNumero(23);
		 * 
		 * // daoAdresse.insererAdresse(adr2);
		 * 
		 * List<Adresse> listAdresses = daoAdresse.rechercherAdresses();
		 * System.out.println("Toutes les adresses " + listAdresses.toString());
		 * System.out.println(listAdresses.toString());
		 * 
		 * List<Adresse> listByUser = daoAdresse.rechcherAdresseParIdUtilisateur(2);
		 * System.out.println("adresse by userID " + listByUser.toString());
		 * 
		 * /*********** Faire les calculs pour le DashBord
		 ************/
		/** Version jpql / hql **/
		// Méthode pour le count
		/*
		 * @NamedQuery(name="Adresse.countNbrAdresse", query="SELECT
		 * COUNT(adr5.idAdresse) FROM Adresse adr5 WHERE
		 * adr5.utilisateurAdresse.idUtilisateur = :idUtilisateur"),
		 * 
		 * public Long getNbrAdresseByUtilisateur(Integer idUtilisateur) { Long
		 * nbrAdresse = 0L; nbrAdresse =
		 * entityManager.createNamedQuery("Adresse.countNbrAdresse", Long.class)
		 * .setParameter("idUtilisateur", idUtilisateur).getSingleResult(); return
		 * nbrAdresse; }
		 */

		/** Version java8 Stream Lambdas **/
		/*
		 * long x = listByUser.stream().count(); System.out.println("Nbr Adresse = " +
		 * x); /
		 ********************************************/

		/*
		 * List<Adresse> listByCodePostal = daoAdresse.getAdresseByCodePostal("75000");
		 * System.out.println("Adresse by code postal = " + listByCodePostal);
		 * 
		 * ServiceAdresse serviceAdresse = new ServiceAdresse();
		 * serviceAdresse.setDaoAdresse(daoAdresse);
		 * 
		 * serviceAdresse.saveOrUpdateAdresse(adr2);
		 * 
		 * serviceAdresse.getAdresseByIdUser(2);
		 * 
		 * 
		 * List<Adresse> listParID = daoAdresse.rechercherAdresses().stream()
		 * .filter(adr -> adr.getUtilisateurAdresse().getIdUtilisateur() ==
		 * 2).collect(Collectors.toList()); listParID.forEach(s ->
		 * System.out.println("Affichage adresse " + s));
		 * 
		 * daoAdresse.getEntityManager().getTransaction().commit();
		 * daoAdresse.getEntityManager().close();
		 */
		emf.close();

	}

}

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
 * em.getTransaction().commit();
 * 
 * daoRegion.getEntityManager().getTransaction().commit();
 * daoRegion.getEntityManager().close();
 */
