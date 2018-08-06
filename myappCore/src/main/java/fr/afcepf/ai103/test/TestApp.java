package fr.afcepf.ai103.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.afcepf.ai103.dao.DaoAdresse;
import fr.afcepf.ai103.dao.IDaoAdresse;
import fr.afcepf.ai103.data.Adresse;

public class TestApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myappCore") ;
        EntityManager em = emf.createEntityManager() ;
        em.getTransaction().begin() ;
    
        IDaoAdresse daoAdresse = new DaoAdresse();
        
        Adresse adr2 = new Adresse();
        adr2.setNumero(23);
		adr2.setNomVoie("Rabie");
		daoAdresse.insererAdresse(adr2);
		
		
		
		
        em.getTransaction().commit() ;
        
        
        
        
        
        
        
        
        /*
        System.out.println("Id = " + marin.getId()) ;
		IDaoAdresse daoAdresse = new DaoAdresse();
		for(Adresse adr : daoAdresse.rechercherAdresses()) {
			System.out.println(adr.toString());
		}
		
		
		
		Adresse adr2 = new Adresse();
		adr2.setNumero(23);
		adr2.setNomVoie("Rabie");
		daoAdresse.insererAdresse(adr2);
		*/
		/*
		IDaoClient daoClient =  new DaoClientJpa();
		for(Client c :daoClient.rechercherClients()) {
			System.out.println(c.toString());
		}
		Client cc = new Client();
		cc.setNom("toto");
		daoClient.insererNouveauClient(cc);
		System.out.println("nouveau numClient" + cc.getNumClient());
		//...
		System.exit(0);//pour forcer l'arrêt (pour compenser entityManager.close() )
		
*/
	}
	
	
	
	
	/* NB: via un double click sur h2...jar (situé dans 
	C:\Users\formation\.m2\repository\com\h2database\h2\1.4.197)
	on peut lancer une console préfini de H2 permettant de visualiser le contenu des tables
	Attention :
	    * URL = jdbc:h2:~/bank_db (plutot que jdbc:h2:~/test)
	    * bien se déconnecter pour ne pas bloquer d'autres programmes (ex: appli java)
	*/
}
