//import.sql est un script SQL automatiquement déclenché par hibernate 
//au démarrage de appli (ou test) en mode hibernate.hbm2ddl.auto=create  

INSERT INTO Client(numClient,prenom,nom,email,adresse,telephone,password) VALUES (1,'alex','Therieur','alex.therieur@gmail.com','1 rue elle 75000 Paris','0102030405','pwd1')

INSERT INTO Compte(numCompte,label,solde) VALUES (1,'compte courant 1',500.1) 

INSERT INTO Client_Compte(client_id,compte_id) VALUES (1,1) 

INSERT INTO Operation(numero,dateOp,montant,label,numCpt) VALUES (4,'2018-07-12',-4.5 ,'achat 4',1)

/** StatutAdresse **/
INSERT INTO StatutAdresse(idStatutAdresse,libelleStatutAdresse) VALUES (1,'rue') 
INSERT INTO StatutAdresse(idStatutAdresse,libelleStatutAdresse) VALUES (2,'avenue') 

/** Adresse **/
INSERT INTO Adresse(idAdresse, numero, nomVoie, coordonneesGpsLat, coordonneesGpsLong, dateDebutValidite, dateFinValidite,idStatutAdresse) VALUES (1, 40, 'Château', 48.816517, 2.326962, '2018-07-12', '2018-07-12',1 )
INSERT INTO Adresse(idAdresse, numero, nomVoie, coordonneesGpsLat, coordonneesGpsLong, dateDebutValidite, dateFinValidite,idStatutAdresse) VALUES (2, 12, 'Château', 48.816517, 2.326962, '2018-07-12', '2018-07-12',2 )
