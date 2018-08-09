//import.sql est un script SQL automatiquement déclenché par hibernate 
//au démarrage de appli (ou test) en mode hibernate.hbm2ddl.auto=create  

/** DEMO PROF **/
INSERT INTO Client(numClient,prenom,nom,email,adresse,telephone,password) VALUES (1,'alex','Therieur','alex.therieur@gmail.com','1 rue elle 75000 Paris','0102030405','pwd1')

INSERT INTO Compte(numCompte,label,solde) VALUES (1,'compte courant 1',500.1) 

INSERT INTO Client_Compte(client_id,compte_id) VALUES (1,1) 

INSERT INTO Operation(numero,dateOp,montant,label,numCpt) VALUES (4,'2018-07-12',-4.5 ,'achat 4',1)

/** FOOD2EAT **/
insert into MotifDesinscription (idMotifDesinscription, libelleMotifDesinscription) values (1, 'Je ne suis pas satisfait des fonctionnalites proposees');
insert into MotifDesinscription (idMotifDesinscription, libelleMotifDesinscription) values (2, 'L''ergonomie n''est pas bonne');
insert into MotifDesinscription (idMotifDesinscription, libelleMotifDesinscription) values (3, 'Je n''ai plus besoin des services de l''outil');
insert into MotifDesinscription (idMotifDesinscription, libelleMotifDesinscription) values (4, 'Aucune raison particuliere');

insert into Sexe (idSexe, libelleSexe) values (1, 'Homme');
insert into Sexe (idSexe, libelleSexe) values (2, 'Femme');

insert into Utilisateur (idUtilisateur, nom, prenom, pseudo, password, email, numeroTel, dateNaissance, dateInscription, idSexe) values (1, 'Kadri','Rabie','Meghnaoui13','tacos5v','rabie@live.fr','0676614024','1987-07-14','2018-08-06','1');
insert into Utilisateur (idUtilisateur, nom, prenom, pseudo, password, email, numeroTel, dateNaissance, dateInscription, idSexe) values (2, 'Gondran','Nicolas','Giroud18','Olivier','nico75@live.fr','0611565869','1987-06-15','2018-08-07','1');
insert into Utilisateur (idUtilisateur, nom, prenom, pseudo, password, email, numeroTel, dateNaissance, dateInscription, idSexe) values (3, 'Jan','Issa','IssaBejita','sayan','CR7@live.fr','0699896598','1991-01-22','2018-08-09','1');
insert into Utilisateur (idUtilisateur, nom, prenom, pseudo, password, email, numeroTel, dateNaissance, dateInscription, idSexe) values (4, 'Nicolas','Audrey','Pique','Gerard','audrette@live.fr','0625659878','1986-08-18','2018-08-08','2');
insert into Utilisateur (idUtilisateur, nom, prenom, pseudo, password, email, numeroTel, dateNaissance, dateInscription, idSexe) values (5, 'Guendouz','Kamel','G12','speculos','kml@live.fr','064364113','1987-04-05','2018-04-08','1');

insert into Region (idRegion, libelleRegion) values (1, 'Ile de France');
insert into Region (idRegion, libelleRegion) values (2, 'Grand Est');
insert into Region (idRegion, libelleRegion) values (3, 'Rhone-Alpes Auvergne');
insert into Region (idRegion, libelleRegion) values (4, 'Nouvelle-Aquitaine');
insert into Region (idRegion, libelleRegion) values (5, 'Bourgogne-Franche-Comte');
insert into Region (idRegion, libelleRegion) values (6, 'Bretagne');
insert into Region (idRegion, libelleRegion) values (7, 'Normandie');
insert into Region (idRegion, libelleRegion) values (8, 'Provence-Alpes-Cote-d Azur');
insert into Region (idRegion, libelleRegion) values (9, 'Occitanie');
insert into Region (idRegion, libelleRegion) values (10, 'Hauts-de-France');
insert into Region (idRegion, libelleRegion) values (11, 'Corse');
insert into Region (idRegion, libelleRegion) values (12, 'Pays de la Loire');

insert into Ville (idVille ,codePostal, nomVille ,idRegion) values (1, '75000','Paris', 1);
insert into Ville (idVille ,codePostal, nomVille ,idRegion) values (2, '92120','Montrouge', 1);
insert into Ville (idVille ,codePostal, nomVille ,idRegion) values (3, '17000','La Rochelle', 4);

insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (1, 'Allee');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (2, 'Rue');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (3, 'Boulevard');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (4, 'Avenue');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (5, 'Rond-point');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (6, 'Ruelle');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (7, 'Route');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (8, 'Passage');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (9, 'Faubourg');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (10, 'Impasse');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (11, 'Quai');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (12, 'Chaussee');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (13, 'Pont');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (14, 'Voie');
insert into TypeVoie (idTypeVoie, libelleTypeVoie) values (15, 'Chemin');

insert into StatutAdresse (idStatutAdresse,libelleStatutAdresse) values (1, 'Principale');
insert into StatutAdresse (idStatutAdresse,libelleStatutAdresse) values (2, 'Secondaire');
insert into StatutAdresse (idStatutAdresse,libelleStatutAdresse) values (3, 'Temporaire');

insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (1,12,'Général de Gaulle',48.8164002,2.326921,'2018-08-06',3,2,1,1);
insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (2,76,'Plantes',48.825365,2.318571,'2018-08-07',2,1,1,2);
insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (3,115,'Jean Jaurès',48.814095,2.308081,'2018-08-08',4,2,1,3);
insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (4,8,'Friant',48.826177,2.32437,'2018-08-09',2,1,1,5);
insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (5,4,'sur les Murs',46.1558198,1.1547798,'2018-08-07',2,3,2,2);
insert into Adresse (idAdresse,numero,nomVoie,coordonneesGpsLat,coordonneesGpsLong,dateDebutValidite,idTypeVoie,idVille,idStatutAdresse,idUtilisateur) values (6,4,'Valin',46.1567358,1.1495355,'2018-08-07',11,3,1,4);

insert into MotifRejetRef (idMotifRejetRef, libelleMotifRejetRef) values (1, 'L''aliment n''est pas valide');
insert into MotifRejetRef (idMotifRejetRef, libelleMotifRejetRef) values (2, 'L''aliment n''existe pas');

insert into MotifRetraitRef (idMotifRetraitRef, libelleMotifRetraitRef) values (1, 'N''est plus distribué');
insert into MotifRetraitRef (idMotifRetraitRef, libelleMotifRetraitRef) values (2, 'Autres');

insert into Nutriscore (idNutriscore, scoreNutriscore,imageNutriscore) values (1,'A','https://static.openfoodfacts.org/images/misc/nutriscore-a.svg');
insert into Nutriscore (idNutriscore, scoreNutriscore,imageNutriscore) values (2,'B','https://static.openfoodfacts.org/images/misc/nutriscore-b.svg');
insert into Nutriscore (idNutriscore, scoreNutriscore,imageNutriscore) values (3,'C','https://static.openfoodfacts.org/images/misc/nutriscore-c.svg');
insert into Nutriscore (idNutriscore, scoreNutriscore,imageNutriscore) values (4,'D','https://static.openfoodfacts.org/images/misc/nutriscore-c.svg');
insert into Nutriscore (idNutriscore, scoreNutriscore,imageNutriscore) values (5,'E','https://static.openfoodfacts.org/images/misc/nutriscore-e.svg');

insert into Label (idLabel, libelleLabel,imageLabel) values (1,'AOP','https://static.openfoodfacts.org/images/lang/fr/labels/aop.90x90.png');
insert into Label (idLabel, libelleLabel,imageLabel) values (2,'IGP','https://static.openfoodfacts.org/images/lang/fr/labels/igp.90x90.png');
insert into Label (idLabel, libelleLabel) values (3,'STG');
insert into Label (idLabel, libelleLabel,imageLabel) values (4,'AB','https://static.openfoodfacts.org/images/lang/fr/labels/ab-agriculture-biologique.74x90.svg');
insert into Label (idLabel, libelleLabel,imageLabel) values (5,'Bio europe','https://static.openfoodfacts.org/images/lang/fr/labels/bio-europeen.135x90.png');
insert into Label (idLabel, libelleLabel) values (6,'Label Rouge');
insert into Label (idLabel, libelleLabel,imageLabel) values (7,'MSC','https://static.openfoodfacts.org/images/lang/fr/labels/peche-durable-msc.67x90.png');
insert into Label (idLabel, libelleLabel,imageLabel) values (8,'Viande bovine française','https://static.openfoodfacts.org/images/lang/fr/labels/viande-bovine-francaise.94x90.png');
insert into Label (idLabel, libelleLabel) values (9,'Sans colorants,Sans conservateurs');
insert into Label (idLabel, libelleLabel) values (10,'Sans huile de palme');
insert into Label (idLabel, libelleLabel) values (11,'Sans huile de palme,Sans colorant,Sans conservateur');
insert into Label (idLabel, libelleLabel) values (12,'Sans sucre ajouté, Teneur en fruits 100%');
insert into Label (idLabel, libelleLabel) values (13,'Sans gluten, Sans colorant');
insert into Label (idLabel, libelleLabel) values (14,'Sans OGM');
insert into Label (idLabel, libelleLabel) values (15,'Kascher');
insert into Label (idLabel, libelleLabel,imageLabel) values (16,'Halal','https://static.openfoodfacts.org/images/lang/fr/labels/halal.90x90.png');
insert into Label (idLabel, libelleLabel) values (17,'Vegan');
insert into Label (idLabel, libelleLabel) values (18,'Contre cholestérol');

insert into Origine(idOrigine, libelleOrigine) values (1,'NC');
insert into Origine(idOrigine, libelleOrigine) values (2,'France');
insert into Origine(idOrigine, libelleOrigine) values (3,'Biars,France');
insert into Origine(idOrigine, libelleOrigine) values (4,'Bretagne, France');
insert into Origine(idOrigine, libelleOrigine) values (5,'Normandie,France');
insert into Origine(idOrigine, libelleOrigine) values (6,'Sud-ouest, France');
insert into Origine(idOrigine, libelleOrigine) values (7,'Busigny, Nord, France');
insert into Origine(idOrigine, libelleOrigine) values (8,'Parc naturel régional des Ballons des Vosges,Alsace,Lorraine,Franche-Comté,France');
insert into Origine(idOrigine, libelleOrigine) values (9,'Aqualande,Landes,Aquitaine,France');
insert into Origine(idOrigine, libelleOrigine) values (10,'Basilic: France / Huile d''olive vierge extra: Espagne');
insert into Origine(idOrigine, libelleOrigine) values (11,'Suisse, France');
insert into Origine(idOrigine, libelleOrigine) values (12,'Pacifique Nord');

insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (1,'Légumes');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (2,'Fruits');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (3,'Produits sucrés');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (4,'Viandes Poissons Œufs');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (5,'Produits laitiers');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (6,'Boissons');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (7,'Féculents');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (8,'Matières grasses');
insert into GroupeAliment (idGroupeAliment, libelleGroupeAliment) values (9,'Autres');

insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (1, 'légumes',0, 1);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (2, 'fruits rouges frais',7, 2);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (3, 'fruits jaunes frais',14, 2);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (4, 'fruits à peau épaisse',20, 2);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (5, 'fruits secs et oléagineux',150, 2);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (6, 'fruits séchés',180, 2);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (7, 'sucre',1825, 3);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (8, 'chocolat',180, 3);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (9, 'miel',73000, 3);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (10, 'viandes de grande surface',0, 4);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (11, 'viandes du marché',5, 4);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (12, 'poissons de grande surface',0, 4);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (13, 'poissons du marché',5, 4);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (14, 'œufs',27, 4);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (15, 'yaourt',9, 5);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (16, 'fromage',14, 5);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (17, 'lait',60, 5);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (18, 'eau',60, 6);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (19, 'produits de la panification',0, 7);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (20, 'céréales',0, 7);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (21, 'légumineuses',0, 7);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (22, 'pomme de terre',0, 7);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (23, 'huile',0, 8);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (24, 'beurre',0, 8);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (25, 'crème fraîche',0, 8);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (26, 'plat préparé',0, 9);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (27, 'sauce',0, 8);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (28, 'condiment',0, 9);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (29, 'jus de fruit',60, 6);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (30, 'soda',60, 6);
insert into CategorieAliment (idCategorieAliment ,libelleCategorieAliment ,joursExtensionApresDlcCategorieAliment ,idGroupeAliment) values (31, 'gâteaux',0, 3);

insert into StockageConservation (idStockageConservation, libelleStockageConservation, joursExtensionApresDlcStockageConservation) values (1, 'frais',0);
insert into StockageConservation (idStockageConservation, libelleStockageConservation, joursExtensionApresDlcStockageConservation) values (2, 'épicerie',1095);
insert into StockageConservation (idStockageConservation, libelleStockageConservation, joursExtensionApresDlcStockageConservation) values (3, 'conserve',365);
insert into StockageConservation (idStockageConservation, libelleStockageConservation, joursExtensionApresDlcStockageConservation) values (4, 'surgelé',730);
insert into StockageConservation (idStockageConservation, libelleStockageConservation, joursExtensionApresDlcStockageConservation) values (5, 'épicerie fine',0);

insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (1, 'metallique');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (2, 'bouteille plastique');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (3, 'materiaux cellulosique');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (4, 'bocal verre');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (5, 'boîte carton');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (6, 'barquette film plastique');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (7, 'sous-vide');
insert into PackagingContenant (idPackagingContenant,libellePackagingContenant) values (8, 'sachet plastique');

insert into Marque (idMarque,libelleMarque) values (1, 'Maggi,Nestlé,Kub');
insert into Marque (idMarque,libelleMarque) values (2, 'Picard');
insert into Marque (idMarque,libelleMarque) values (3, 'Harrys');
insert into Marque (idMarque,libelleMarque) values (4, 'Ebly');
insert into Marque (idMarque,libelleMarque) values (5, 'Ducros,McCormick France');
insert into Marque (idMarque,libelleMarque) values (6, 'Amora,Unilever');
insert into Marque (idMarque,libelleMarque) values (7, 'U');
insert into Marque (idMarque,libelleMarque) values (8, 'Bonduelle');
insert into Marque (idMarque,libelleMarque) values (9, 'Carrefour');
insert into Marque (idMarque,libelleMarque) values (10, 'Wattwiller');
insert into Marque (idMarque,libelleMarque) values (11, 'Cristaline');
insert into Marque (idMarque,libelleMarque) values (12, 'Monoprix');
insert into Marque (idMarque,libelleMarque) values (13, 'Reflets de France');
insert into Marque (idMarque,libelleMarque) values (14, 'Huile d''Olive de Nyons');
insert into Marque (idMarque,libelleMarque) values (15, 'Joker');
insert into Marque (idMarque,libelleMarque) values (16, 'Andros');
insert into Marque (idMarque,libelleMarque) values (17, 'Réo');
insert into Marque (idMarque,libelleMarque) values (18, 'St-Michel');
insert into Marque (idMarque,libelleMarque) values (19, 'Loué');
insert into Marque (idMarque,libelleMarque) values (20, 'Belle France');
insert into Marque (idMarque,libelleMarque) values (21, 'Via Nature');
insert into Marque (idMarque,libelleMarque) values (22, 'Riou Bio');
insert into Marque (idMarque,libelleMarque) values (23, 'Oceane');
insert into Marque (idMarque,libelleMarque) values (24, 'Danone');
insert into Marque (idMarque,libelleMarque) values (25, 'Mamie Nova');
insert into Marque (idMarque,libelleMarque) values (26, 'Yoplait');
insert into Marque (idMarque,libelleMarque) values (27, 'Sveltesse,Nestlé');
insert into Marque (idMarque,libelleMarque) values (28, 'Bio des Peupliers');
insert into Marque (idMarque,libelleMarque) values (29, 'Jeanette');
insert into Marque (idMarque,libelleMarque) values (30, 'Géant Vert');
insert into Marque (idMarque,libelleMarque) values (31, 'Aoste');
insert into Marque (idMarque,libelleMarque) values (32, 'Maayane');

insert into Mesure (idMesure,uniteMesure) values (1, 'g');
insert into Mesure (idMesure,uniteMesure) values (2, 'l');
insert into Mesure (idMesure,uniteMesure) values (3, 'cl');
insert into Mesure (idMesure,uniteMesure) values (4, 'unite');
insert into Mesure (idMesure,uniteMesure) values (5, 'kg');

insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idLabel,idOrigine) values (1, 7613033687983, 'Bouillon Kub Bœuf',18, 10, 1,' https://static.openfoodfacts.org/images/products/761/303/368/7983/front_fr.38.400.jpg', 'https://static.openfoodfacts.org/images/products/761/303/368/7983/front_fr.38.100.jpg', 'https://static.openfoodfacts.org/images/products/761/303/368/7983/ingredients_fr.43.400.jpg', 'https://static.openfoodfacts.org/images/products/761/303/368/7983/nutrition_fr.30.400.jpg', 28, 2, 5, 9, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (2, 3270160147151, 'Biftecks hachés, 8% de matière grasse',8, 140, 1,' https://static.openfoodfacts.org/images/products/327/016/014/7151/front_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/327/016/014/7151/front_fr.8.200.jpg', 'https://static.openfoodfacts.org/images/products/327/016/014/7151/ingredients_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/327/016/014/7151/nutrition_fr.10.400.jpg', 10, 1, 5, 1, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (3, 3228857000166, 'Pain de mie Complet',1, 500, 1,' https://static.openfoodfacts.org/images/products/322/885/700/0166/front_fr.42.400.jpg', 'https://static.openfoodfacts.org/images/products/322/885/700/0166/front_fr.42.200.jpg', 'https://static.openfoodfacts.org/images/products/322/885/700/0166/ingredients_fr.51.400.jpg', 'https://static.openfoodfacts.org/images/products/322/885/700/0166/nutrition_fr.53.400.jpg', 19, 1, 8, 1, 10, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (4, 3487400000415, 'Ebly',4, 125, 1,' https://static.openfoodfacts.org/images/products/348/740/000/0415/front_fr.18.400.jpg', 'https://static.openfoodfacts.org/images/products/348/740/000/0415/front_fr.18.200.jpg', 'https://static.openfoodfacts.org/images/products/348/740/000/0415/ingredients_fr.44.400.jpg', 'https://static.openfoodfacts.org/images/products/348/740/000/0415/nutrition_fr.45.400.jpg', 20, 2, 8, 1, 9, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idOrigine) values (5, 3166291010801, 'Persil',1, 30, 1,' https://static.openfoodfacts.org/images/products/316/629/101/0801/front_fr.6.400.jpg', 'https://static.openfoodfacts.org/images/products/316/629/101/0801/front_fr.6.200.jpg', 'https://static.openfoodfacts.org/images/products/316/629/101/0801/ingredients_fr.8.400.jpg', '0', 28, 2, 4, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (6, 3250546606267, 'Mayonnaise de Dijon',1, 175, 1,' https://static.openfoodfacts.org/images/products/325/054/660/6267/front_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/325/054/660/6267/front_fr.8.200.jpg', 'https://static.openfoodfacts.org/images/products/325/054/660/6267/ingredients_fr.21.400.jpg', 'https://static.openfoodfacts.org/images/products/325/054/660/6267/nutrition_fr.19.400.jpg', 27, 5, 2, 5, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (7, 3256225736249, 'Cornichons aigres-doux',1, 360, 1,' https://static.openfoodfacts.org/images/products/325/622/573/6249/front_fr.14.400.jpg', 'https://static.openfoodfacts.org/images/products/325/622/573/6249/front_fr.14.200.jpg', 'https://static.openfoodfacts.org/images/products/325/622/573/6249/ingredients_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/325/622/573/6249/nutrition_fr.11.400.jpg', 28, 5, 2, 3, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (8, 3270160103133, 'Courgettes en rondelles Bio',1, 600, 1,' https://static.openfoodfacts.org/images/products/327/016/010/3133/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/327/016/010/3133/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/327/016/010/3133/ingredients_fr.6.400.jpg', 'https://static.openfoodfacts.org/images/products/327/016/010/3133/nutrition_fr.8.400.jpg', 1, 4, 8, 1, 4, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (9, 3083681066838, 'Purée Délice Harricot vert, Courgettes, Epinards,  Pois,  Crème',1, 780, 1,' https://static.openfoodfacts.org/images/products/308/368/106/6838/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/308/368/106/6838/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/308/368/106/6838/ingredients_fr.13.400.jpg', 'https://static.openfoodfacts.org/images/products/308/368/106/6838/nutrition_fr.9.400.jpg', 1, 4, 8, 1, 9, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (10, 3245414091238, 'Colin d''Alaska à  la Provençale',2, 200, 1,' https://static.openfoodfacts.org/images/products/324/541/409/1238/front_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/324/541/409/1238/front_fr.9.200.jpg', 'https://static.openfoodfacts.org/images/products/324/541/409/1238/ingredients_fr.10.400.jpg', 'https://static.openfoodfacts.org/images/products/324/541/409/1238/nutrition_fr.11.400.jpg', 12, 4, 8, 1, 7, 12);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idOrigine) values (11, 3448781102006, 'Eau de source',6, 1.5, 2,' https://static.openfoodfacts.org/images/products/344/878/110/2006/front_fr.6.400.jpg', 'https://static.openfoodfacts.org/images/products/344/878/110/2006/front_fr.6.200.jpg', 'https://static.openfoodfacts.org/images/products/344/878/110/2006/ingredients_fr.7.400.jpg', '0', 18, 2, 2, 8);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idOrigine) values (12, 3254382025886, 'Eau de source',6, 1, 2,' https://static.openfoodfacts.org/images/products/325/438/202/5886/front_fr.5.400.jpg', 'https://static.openfoodfacts.org/images/products/325/438/202/5886/front_fr.5.100.jpg', '0', '0', 18, 2, 2, 7);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (13, 3350030158255, 'Truite fumée élevée en eau douce en France',4, 30, 1,' https://static.openfoodfacts.org/images/products/335/003/015/8255/front_fr.7.400.jpg', 'https://static.openfoodfacts.org/images/products/335/003/015/8255/front_fr.7.200.jpg', 'https://static.openfoodfacts.org/images/products/335/003/015/8255/ingredients_fr.12.400.jpg', 'https://static.openfoodfacts.org/images/products/335/003/015/8255/nutrition_fr.15.400.jpg', 12, 1, 7, 4, 9);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (14, 3245390036063, 'Pistou Recette provençale',1, 190, 1,' https://static.openfoodfacts.org/images/products/324/539/003/6063/front_fr.6.400.jpg', 'https://static.openfoodfacts.org/images/products/324/539/003/6063/front_fr.6.200.jpg', 'https://static.openfoodfacts.org/images/products/324/539/003/6063/ingredients_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/324/539/003/6063/nutrition_fr.7.400.jpg', 28, 2, 4, 4, 10);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (15, 3760084810236, 'Huile d''olive vierge extra',1, 50, 3,' https://static.openfoodfacts.org/images/products/376/008/481/0236/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/376/008/481/0236/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/376/008/481/0236/ingredients_fr.10.400.jpg', 'https://static.openfoodfacts.org/images/products/376/008/481/0236/nutrition_fr.11.400.jpg', 23, 2, 4, 4, 1, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (16, 3123340000077, 'Jus de pomme',1, 2, 2,' https://static.openfoodfacts.org/images/products/312/334/000/0077/front_fr.12.400.jpg', 'https://static.openfoodfacts.org/images/products/312/334/000/0077/front_fr.12.200.jpg', 'https://static.openfoodfacts.org/images/products/312/334/000/0077/ingredients_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/312/334/000/0077/nutrition_fr.14.400.jpg', 29, 1, 5, 3, 12, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (17, 3045320104127, 'Oranges pressées',1, 1, 2,' https://static.openfoodfacts.org/images/products/304/532/010/4127/front_fr.49.400.jpg', 'https://static.openfoodfacts.org/images/products/304/532/010/4127/front_fr.49.200.jpg', 'https://static.openfoodfacts.org/images/products/304/532/010/4127/ingredients_fr.6.400.jpg', 'https://static.openfoodfacts.org/images/products/304/532/010/4127/nutrition_fr.7.400.jpg', 29, 1, 2, 3, 3);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (18, 3332621044253, 'Camembert de normandie au lait cru moulé à  la louche',1, 250, 1,' https://static.openfoodfacts.org/images/products/333/262/104/4253/front_fr.12.400.jpg', 'https://static.openfoodfacts.org/images/products/333/262/104/4253/front_fr.12.200.jpg', 'https://static.openfoodfacts.org/images/products/333/262/104/4253/ingredients_fr.14.400.jpg', '0', 16, 1, 5, 4, 1, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (19, 3178531008127, 'Madeleines',1, 500, 1,' https://static.openfoodfacts.org/images/products/317/853/100/8127/front_fr.28.400.jpg', 'https://static.openfoodfacts.org/images/products/317/853/100/8127/front_fr.28.200.jpg', 'https://static.openfoodfacts.org/images/products/317/853/100/8127/ingredients_fr.26.400.jpg', 'https://static.openfoodfacts.org/images/products/317/853/100/8127/nutrition_fr.25.400.jpg', 31, 1, 8, 4, 11, 3);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (20, 3270190021179, 'Oeufs de poule élevées en plein air',6, 1, 4,' https://static.openfoodfacts.org/images/products/327/019/002/1179/front_fr.73.400.jpg', 'https://static.openfoodfacts.org/images/products/327/019/002/1179/front_fr.73.200.jpg', 'https://static.openfoodfacts.org/images/products/327/019/002/1179/ingredients_fr.67.400.jpg', 'https://static.openfoodfacts.org/images/products/327/019/002/1179/nutrition_fr.11.400.jpg', 14, 1, 5, 1, 5, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idLabel,idOrigine) values (21, 8434782687777, 'Oeufs bio fermiers',10, 1, 4,' https://static.openfoodfacts.org/images/products/843/478/268/7777/front_fr.3.400.jpg', 'https://static.openfoodfacts.org/images/products/843/478/268/7777/front_fr.3.200.jpg', '0', '0', 14, 1, 5, 5, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (22, 3258561400075, 'Pains au Lait',10, 35, 1,' https://static.openfoodfacts.org/images/products/325/856/140/0075/front_fr.3.400.jpg', 'https://static.openfoodfacts.org/images/products/325/856/140/0075/front_fr.3.200.jpg', 'https://static.openfoodfacts.org/images/products/325/856/140/0075/ingredients_fr.10.400.jpg', 'https://static.openfoodfacts.org/images/products/325/856/140/0075/nutrition_fr.9.400.jpg', 31, 1, 8, 4, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (23, 3270190119210, ' Jus de raisin à  base de concentré',6, 20, 3,' https://static.openfoodfacts.org/images/products/327/019/011/9210/front_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/327/019/011/9210/front_fr.9.200.jpg', 'https://static.openfoodfacts.org/images/products/327/019/011/9210/ingredients_fr.16.400.jpg', 'https://static.openfoodfacts.org/images/products/327/019/011/9210/nutrition_fr.11.400.jpg', 29, 1, 5, 5, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idLabel,idOrigine) values (24, 3760211990152, 'Raisin bio noir',1, 500, 1,' https://static.openfoodfacts.org/images/products/376/021/199/0152/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/376/021/199/0152/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/376/021/199/0152/ingredients_fr.5.400.jpg', '0', 2, 1, 6, 5, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idLabel,idOrigine) values (25, 3413930307359, 'Tomates grappe bio',1, 600, 1,' https://static.openfoodfacts.org/images/products/341/393/030/7359/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/341/393/030/7359/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/341/393/030/7359/ingredients_fr.7.400.jpg', '0', 1, 1, 6, 5, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idOrigine) values (26, 3590941000902, 'Tomates cerises mélangées',1, 350, 1,' https://static.openfoodfacts.org/images/products/359/094/100/0902/front_fr.5.400.jpg', 'https://static.openfoodfacts.org/images/products/359/094/100/0902/front_fr.5.200.jpg', '0', '0', 1, 1, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (27, 3033490178000, 'Fjord',4, 125, 1,' https://static.openfoodfacts.org/images/products/303/349/017/8000/front_fr.33.400.jpg', 'https://static.openfoodfacts.org/images/products/303/349/017/8000/front_fr.33.200.jpg', 'https://static.openfoodfacts.org/images/products/303/349/017/8000/ingredients_fr.41.400.jpg', 'https://static.openfoodfacts.org/images/products/303/349/017/8000/nutrition_fr.35.400.jpg', 15, 1, 2, 3, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (28, 3177630005006, 'Le Nature Sucre de Canne au Lait Breton',4, 125, 1,' https://static.openfoodfacts.org/images/products/317/763/000/5006/front_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/317/763/000/5006/front_fr.8.200.jpg', 'https://static.openfoodfacts.org/images/products/317/763/000/5006/ingredients_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/317/763/000/5006/nutrition_fr.10.400.jpg', 15, 1, 2, 3, 4);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (29, 3033490081751, 'Danacol fraise / peche abricot',1, 1, 5,' https://static.openfoodfacts.org/images/products/303/349/008/1751/front_fr.3.400.jpg', 'https://static.openfoodfacts.org/images/products/303/349/008/1751/front_fr.3.200.jpg', 'https://static.openfoodfacts.org/images/products/303/349/008/1751/ingredients_fr.13.400.jpg', '0', 15, 1, 2, 1, 18, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (30, 3329770055643, 'Yaourt aux fruits Tentation',8, 125, 1,' https://static.openfoodfacts.org/images/products/332/977/005/5643/front_fr.5.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/5643/front_fr.5.200.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/5643/ingredients_fr.8.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/5643/nutrition_fr.11.400.jpg', 15, 1, 2, 3, 9, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idOrigine) values (31, 3023290232804, 'Be Active - Yogurt alla Greca',1, 150, 1,' https://static.openfoodfacts.org/images/products/302/329/023/2804/front_fr.16.400.jpg', 'https://static.openfoodfacts.org/images/products/302/329/023/2804/front_fr.16.200.jpg', 'https://static.openfoodfacts.org/images/products/302/329/023/2804/ingredients_it.17.400.jpg', 'https://static.openfoodfacts.org/images/products/302/329/023/2804/nutrition_it.18.400.jpg', 15, 1, 2, 1, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (32, 3329770058538, 'Panier de Yoplait - l''Original (Mûre, Myrtille)',4, 125, 1,' https://static.openfoodfacts.org/images/products/332/977/005/8538/front_fr.32.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/8538/front_fr.32.200.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/8538/ingredients_fr.34.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/005/8538/nutrition_fr.36.400.jpg', 15, 1, 2, 3, 13, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (33, 3329770049413, 'Panier de Yoplait - Exotique (Mangue, Coco, Ananas)',8, 125, 1,' https://static.openfoodfacts.org/images/products/332/977/004/9413/front_fr.13.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/004/9413/front_fr.13.200.jpg', 'https://static.openfoodfacts.org/images/products/332/977/004/9413/ingredients_fr.14.400.jpg', 'https://static.openfoodfacts.org/images/products/332/977/004/9413/nutrition_fr.15.400.jpg', 15, 1, 2, 3, 9, 1);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idLabel,idOrigine) values (34, 3374270900016, 'Yaourt nature biologique',1, 125, 1,' https://static.openfoodfacts.org/images/products/337/427/090/0016/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/337/427/090/0016/front_fr.4.100.jpg', 'https://static.openfoodfacts.org/images/products/337/427/090/0016/ingredients_fr.15.400.jpg', 'https://static.openfoodfacts.org/images/products/337/427/090/0016/nutrition_fr.16.400.jpg', 15, 1, 2, 4, 5);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (35, 3701005300405, 'Madeleines Nature',1, 1, 5,' https://static.openfoodfacts.org/images/products/370/100/530/0405/front_fr.7.400.jpg', 'https://static.openfoodfacts.org/images/products/370/100/530/0405/front_fr.7.200.jpg', 'https://static.openfoodfacts.org/images/products/370/100/530/0405/ingredients_fr.9.400.jpg', 'https://static.openfoodfacts.org/images/products/370/100/530/0405/nutrition_fr.16.400.jpg', 31, 1, 8, 5, 1, 5);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (36, 3254474010622, 'Maïs doux L''Original Ultra Tendre',3, 140, 1,' https://static.openfoodfacts.org/images/products/325/447/401/0622/front_fr.7.400.jpg', 'https://static.openfoodfacts.org/images/products/325/447/401/0622/front_fr.7.200.jpg', 'https://static.openfoodfacts.org/images/products/325/447/401/0622/ingredients_fr.14.400.jpg', 'https://static.openfoodfacts.org/images/products/325/447/401/0622/nutrition_fr.10.400.jpg', 1, 3, 1, 1, 14, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (37, 3023082560016, 'MaÏs doux L''Original Ultra Tendre',1, 300, 1,' https://static.openfoodfacts.org/images/products/302/308/256/0016/front_fr.3.400.jpg', 'https://static.openfoodfacts.org/images/products/302/308/256/0016/front_fr.3.200.jpg', 'https://static.openfoodfacts.org/images/products/302/308/256/0016/ingredients_fr.5.400.jpg', 'https://static.openfoodfacts.org/images/products/302/308/256/0016/nutrition_fr.7.400.jpg', 1, 3, 1, 1, 14, 6);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (38, 3449860407975, 'Viande des grisons',1, 80, 1,' https://static.openfoodfacts.org/images/products/344/986/040/7975/front_fr.28.400.jpg', 'https://static.openfoodfacts.org/images/products/344/986/040/7975/front_fr.28.200.jpg', 'https://static.openfoodfacts.org/images/products/344/986/040/7975/ingredients_fr.30.400.jpg', 'https://static.openfoodfacts.org/images/products/344/986/040/7975/nutrition_fr.16.400.jpg', 10, 1, 7, 4, 2, 11);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (39, 3700029205314, 'Burgers ',10, 80, 1,' https://static.openfoodfacts.org/images/products/370/002/920/5314/front_fr.10.400.jpg', 'https://static.openfoodfacts.org/images/products/370/002/920/5314/front_fr.10.200.jpg', 'https://static.openfoodfacts.org/images/products/370/002/920/5314/ingredients_fr.11.400.jpg', 'https://static.openfoodfacts.org/images/products/370/002/920/5314/nutrition_fr.12.400.jpg', 10, 1, 5, 4, 15, 2);
insert into AlimentGenerique (idAlimentGenerique , codeBarreAlimentGenerique, libelleAlimentGenerique ,nombreUnitesAlimentGenerique,portionParUniteAlimentGenerique,idMesure,imageAlimentGenerique,imageZoomAlimentGenerique,imageIngredientsAlimentGenerique,imageNutritionAlimentGenerique,idCategorieAliment,idStockageConservation,idPackagingContenant,idNutriscore,idLabel,idOrigine) values (40, 3560070749805, 'Viande Hachée Pur Boeuf',1, 1, 5,' https://static.openfoodfacts.org/images/products/356/007/074/9805/front_fr.4.400.jpg', 'https://static.openfoodfacts.org/images/products/356/007/074/9805/front_fr.4.200.jpg', 'https://static.openfoodfacts.org/images/products/356/007/074/9805/ingredients_fr.12.400.jpg', 'https://static.openfoodfacts.org/images/products/356/007/074/9805/nutrition_fr.13.400.jpg', 10, 1, 8, 4, 16, 2);


insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (1,1,25,'2018-08-20','2018-09-02');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (2,1,15,'2018-07-02','2019-11-16');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (3,1,4,'2018-07-02','2020-03-11');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (4,1,7,'2018-07-02','2019-02-05');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (5,1,16,'2018-08-20','2018-09-09');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (6,2,18,'2018-07-02','2019-11-16');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (7,2,20,'2018-08-21','2018-09-15');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (8,2,36,'2018-08-21','2020-07-23');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (9,2,19,'2018-08-21','2019-02-25','2022-02-25');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (10,2,32,'2018-08-21','2018-09-14','2018-10-07');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (11,2,10,'2018-08-21','2019-11-03','2022-11-03');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (12,2,6,'2018-08-21','2019-12-08');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (13,3,27,'2018-08-18','2018-09-02','2018-09-23');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (14,3,21,'2018-08-18','2018-08-29','2018-10-10');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (15,3,13,'2018-08-18','2018-08-26');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (16,4,39,'2018-08-15','2018-08-22');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (17,4,8,'2018-04-15','2019-11-16','2022-11-16');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (18,4,3,'2018-08-15','2018-08-28');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (19,2,8,'2018-08-21','2019-11-16','2022-11-16');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (20,2,17,'2018-08-21','2018-12-17');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (21,2,14,'2018-08-21','2019-10-27','2020-10-27');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (22,3,5,'2018-06-03','2019-02-14','2022-02-14');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso,dateConsoChoisieStockPerso) values (23,4,1,'2018-05-06','2019-04-28','2010-04-28');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (24,2,40,'2018-08-15','2018-08-23');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (25,2,26,'2018-07-03','2018-07-10');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (26,2,23,'2018-01-01','2018-03-05');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (27,2,9,'2018-01-01','2020-06-20');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (28,2,2,'2018-01-01','2018-01-07');
insert into StockPerso (idStockPerso,idUtilisateur,idAlimentGenerique,dateAjoutStockPerso,dlcStockPerso) values (29,2,33,'2018-01-01','2018-01-23');

insert into MotifJeter (idMotifJeter, libelleMotifJeter) values (1, 'Produit abimé non consommable');
insert into MotifJeter (idMotifJeter, libelleMotifJeter) values (2, 'DLC dépassée, pas le temps de poster une annonce');
insert into MotifJeter (idMotifJeter, libelleMotifJeter) values (3, 'Aucune réponse à l''annonce publiée et DLC depassée');

insert into Consommation (idConsommation,idStockPerso,quantiteConso,dateManger) values (1,14,4,'2018-08-20');
insert into Consommation (idConsommation,idStockPerso,quantiteConso,dateManger) values (2,11,1,'2018-08-22');
insert into Consommation (idConsommation,idStockPerso,quantiteConso,dateManger) values (3,19,1,'2018-08-22');
insert into Consommation (idConsommation,idStockPerso,quantiteConso,dateJeter,idMotifJeter) values (4,25,1,'2018-08-05',1);

insert into MotifAnnulationAnnonce (idMotifAnnulationAnnonce, libelleMotifAnnulationAnnonce) values (1, 'Je souhaite consommer le produit.');
insert into MotifAnnulationAnnonce (idMotifAnnulationAnnonce, libelleMotifAnnulationAnnonce) values (2, 'Je souhaite garder en stock le produit.');
insert into MotifAnnulationAnnonce (idMotifAnnulationAnnonce, libelleMotifAnnulationAnnonce) values (3, 'Le produit n''est plus consommable avant la DLC ou DDM du produit.');

insert into Annonce (idAnnonce,idStockPerso,dateCreationAnnonce,datePublicationAnnonce) values (1,26,'2018-01-15','2018-01-20');
insert into Annonce (idAnnonce,idStockPerso,dateCreationAnnonce,datePublicationAnnonce) values (2,27,'2018-01-15','2018-01-20');
insert into Annonce (idAnnonce,idStockPerso,dateCreationAnnonce,datePublicationAnnonce) values (3,28,'2018-01-05','2018-01-05');
insert into Annonce (idAnnonce,idStockPerso,dateCreationAnnonce,datePublicationAnnonce) values (4,29,'2018-01-15','2018-01-20');

insert into RendezVous (idRendezVous,dateRendezVous,idAdresse,idAnnonce) values (1,'2018-08-20',4,1);

insert into MotifAnnulationResa (idMotifAnnulationResa, libelleMotifAnnulationResa) values (1, 'Les modalites de rendez-vous ne me conviennent plus.');
insert into MotifAnnulationResa (idMotifAnnulationResa, libelleMotifAnnulationResa) values (2, 'Je ne souhaite plus consommer le produit.');
insert into MotifAnnulationResa (idMotifAnnulationResa, libelleMotifAnnulationResa) values (3, 'J''ai trouve une alternative au produit.');

insert into Evaluation (idEvaluation,noteEvaluation,CommentaireEvaluation) values (1,3,'blabla');
insert into Evaluation (idEvaluation,noteEvaluation,CommentaireEvaluation) values (2,2,'tratataa');
insert into Evaluation (idEvaluation,noteEvaluation) values (3,5);
insert into Evaluation (idEvaluation,noteEvaluation) values (4,1);

insert into Reponse (idReponse, idUtilisateur, idAnnonce,dateReponseAnnonce,dateFermetureAnnonce,dateAcceptationReservation,idEvaluation) values (1,1,1,'2018-01-26','2018-01-30','2018-01-26',1);
insert into Reponse (idReponse, idUtilisateur, idAnnonce,dateReponseAnnonce,dateFermetureAnnonce,dateAcceptationReservation,idEvaluation) values (2,1,2,'2018-01-26','2018-01-30','2018-01-26',2);
insert into Reponse (idReponse, idUtilisateur, idAnnonce,dateReponseAnnonce,dateFermetureAnnonce,dateAcceptationReservation,idEvaluation) values (3,1,3,'2018-01-06','2018-01-10','2018-01-06',3);
insert into Reponse (idReponse, idUtilisateur, idAnnonce,dateReponseAnnonce,dateFermetureAnnonce,dateAcceptationReservation,idEvaluation) values (4,1,4,'2018-01-06','2018-01-10','2018-01-06',4);











