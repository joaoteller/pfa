CREATE DATABASE IF NOT EXISTS pfa;

USE pfa;

create table module(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   	name VARCHAR(100) NOT NULL
);

INSERT INTO module (name)
VALUES
	('Docker'),
	('Fundamentos Arquitetura de Software'),
	('Comunicação'),
	('RabbitMQ'),
	('Autenticação e Keycloak'),
	('Domain Driven Design e Arquitetura Hexagonal'),
	('Arquitetura do projeto prático'),
	('Microsserviço: Catálogo de vídeos Laravel'),
	('Microsserviço: Catálogo de Videos React'),
	('Microsserviço: Encoder'),
	('Microsserviço: API Catálodo com Node'),
	('Microsserviço: Aplicacao do Assinante com React'),
	('Autenticação entre os microsserviços');