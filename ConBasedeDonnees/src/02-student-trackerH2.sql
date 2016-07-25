
CREATE TABLE client (
  id int(11) NOT NULL AUTO_INCREMENT,
  nom varchar(45) DEFAULT NULL,
  prenom varchar(45) DEFAULT NULL,
  ville varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO client VALUES (1,'TOTO','toto','78180-Montigny-le Bretonneux'),(2,'COCO','coco','10000-Troyes'),(3,'KAKA','kaka','93000-Saint-Denis'),(4,'JOJO','jojo','78180-Gyancourt');

