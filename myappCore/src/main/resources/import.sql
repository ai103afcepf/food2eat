//import.sql est un script SQL automatiquement déclenché par hibernate 
//au démarrage de appli (ou test) en mode hibernate.hbm2ddl.auto=create  

INSERT INTO Client(numClient,prenom,nom,email,adresse,telephone,password) VALUES (1,'alex','Therieur','alex.therieur@gmail.com','1 rue elle 75000 Paris','0102030405','pwd1')

INSERT INTO Compte(numCompte,label,solde) VALUES (1,'compte courant 1',500.1) 

INSERT INTO Client_Compte(client_id,compte_id) VALUES (1,1) 

INSERT INTO Operation(numero,dateOp,montant,label,numCpt) VALUES (4,'2018-07-12',-4.5 ,'achat 4',1)

/** StatutAdresse **/
INSERT INTO StatutAdresse(idStatutAdresse,libelleStatutAdresse) VALUES (1,'Principale') 
INSERT INTO StatutAdresse(idStatutAdresse,libelleStatutAdresse) VALUES (2,'Temporaire') 

/** Type Voie **/
INSERT INTO TypeVoie(idTypeVoie,libelleTypeVoie) VALUES (1, 'Rue')
INSERT INTO TypeVoie(idTypeVoie,libelleTypeVoie) VALUES (2, 'Avenue')
INSERT INTO TypeVoie(idTypeVoie,libelleTypeVoie) VALUES (3, 'Boulevard')
INSERT INTO TypeVoie(idTypeVoie,libelleTypeVoie) VALUES (4, 'Avenue')

/** Region **/
INSERT INTO Region(idRegion, libelleRegion) VALUES (1, 'IDF')
INSERT INTO Region(idRegion, libelleRegion) VALUES (2, 'Normandie')
INSERT INTO Region(idRegion, libelleRegion) VALUES (3, 'Bretagne')

/** Ville **/
INSERT INTO Ville(idVille, codePostal, nomVille, idRegion) VALUES (1, 75000, 'Paris', 1)
INSERT INTO Ville(idVille, codePostal, nomVille, idRegion) VALUES (2, 29000,'Brest', 3)
INSERT INTO Ville(idVille, codePostal, nomVille, idRegion) VALUES (3, 93000,'Saint-Denis', 1)


/** Sexe **/
INSERT INTO Sexe (idSexe, libelleSexe) VALUES (1, 'Femme')
INSERT INTO Sexe (idSexe, libelleSexe) VALUES (2, 'Homme')

/** Motif Desinscription **/
INSERT INTO motifdesinscription (idMotifDesinscription, libelleMotifDesinscription) VALUES (1, 'Je ne lutilise plus')

/** Utilisateur **/
INSERT INTO Utilisateur (idUtilisateur, dateDesinscription, dateInscription, dateLethargie,dateNaissance, email, nom, numeroTel, password, prenom, pseudo, idMotifDesinscription, idSexe ) VALUES (1, null, null, null, null, 'email@gmail.com', 'GUENDOUZ', '071616123', '1234', 'Kamel', 'gkamel', null, 2)
INSERT INTO Utilisateur (idUtilisateur, dateDesinscription, dateInscription, dateLethargie,dateNaissance, email, nom, numeroTel, password, prenom, pseudo, idMotifDesinscription, idSexe ) VALUES (2, null, null, null, null, 'email@gmail.com', 'nomAmel', '071616123', '1234', 'amel', 'amel', null, 1)

/** Adresse **/
INSERT INTO Adresse(idAdresse, numero, nomVoie, coordonneesGpsLat, coordonneesGpsLong, dateDebutValidite, dateFinValidite, idStatutAdresse, idTypeVoie, idVille, idUtilisateur) VALUES (1, 40, 'Château', 48.816517, 2.326962, '2018-07-12', '2018-07-12',1, 1, 1, 1 )
INSERT INTO Adresse(idAdresse, numero, nomVoie, coordonneesGpsLat, coordonneesGpsLong, dateDebutValidite, dateFinValidite, idStatutAdresse, idTypeVoie, idVille, idUtilisateur) VALUES (2, 12, 'Général de Gaulles', 48.816517, 2.326962, null, null,2, 1, 1, 2 )
