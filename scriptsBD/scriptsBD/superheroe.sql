DROP DATABASE IF EXISTS superheroe;
CREATE DATABASE superheroe CHARACTER SET utf8mb4;
USE superheroe;

CREATE TABLE creador (
  id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personaje (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
);

INSERT INTO creador (id_creador, `nombre`)
VALUES (1, 'Marvel'),
(2, 'DC Comics');

INSERT INTO personaje (id_personaje, `nombre_real`,`personaje`, inteligencia, `fuerza`, 
velocidad, poder, aparicion, `ocupacion`, id_creador)
VALUES 
(1, 'Bruce Banner'  , 'Hulk'			, 160, '600 mil' , 75 , 98 , 1962, 'Fisico Nuclear'			, 1),
(2, 'Tony Stark'    , 'Iron Man'		, 170, '200 mil' , 70 , 123, 1963, 'Inventor Industrial'	, 1),
(3, 'Thor Odinson'  , 'Thor'			, 145, 'infinita', 100, 235, 1962, 'Rey de Asgard'			, 1),
(4, 'Wanda Maximoff', 'Bruja Escarlata' , 170, '100 mil' , 90 , 345, 1964, 'Bruja'					, 1),
(5, 'Carol Danvers' , 'Capitana America', 157, '250 mil' , 85 , 128, 1968, 'Oficial de inteligencia', 1),
(6, 'Thanos'	    , 'Thanos'			, 170, 'Infinita', 40 , 306, 1973, 'Adorador de la muerte'	, 1),
(7, 'Peter Parker'  , 'Spiderman'		, 165, '25 mil'  , 80 , 74 , 1962, 'Fotografo'				, 1),
(8, 'Stece Rogers'  , 'Capitan America' , 145, '600'     , 45 , 60 , 1941, 'Oficial Federal'		, 1),
(9, 'Bobby Drake'   , 'Ice Man'			, 140, '2 mil'   , 64 , 122, 1963, 'Cientifico forense'		, 1),
(10, 'Barry Allen'  , 'Flash'			, 160, '10 mil'  , 120, 188, 1948, 'Reportero'				, 2),
(11, 'Bruce Wayne'  , 'Batman'			, 170, '500'     , 32 , 47 , 1939, 'Hombre de negocios'		, 2),
(12, 'Clarck Kent'  , 'Superman'		, 165, 'Infinita', 120, 182, 1948, 'Reportero'				, 2),
(13, 'Diana Prince' , 'Mujer Maravilla' , 160, 'Infinita', 95 , 127, 1949, 'Princesa guerrera'		, 2);

UPDATE personaje
SET aparicion=1948 WHERE aparicion=1938;

DELETE FROM personaje WHERE personaje= 'Flash';

