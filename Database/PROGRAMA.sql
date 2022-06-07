CREATE DATABASE PROGRAMA;

CREATE TABLE usuario (
    userid int auto_increment,
    ticket_id varchar(50),
    coche_id varchar(50),
    tarjeta_id varchar(50),
    DNI varchar(9),
    telefono int,
    correo varchar(50),
    nombre varchar(20),
    contraseña varchar(100),
    primary key (userid)
);


alter table usuario
	drop apellidos;
    
    
-- CREATE TABLE admin (
--    userid varchar(50),
--    DNI varchar(9),
--   telefono int,
--   correo varchar(50),
--    nombre varchar(20),
--    apellidos varchar(20),
--   contraseña varchar(100),
--    matricula varchar(7)
-- );

CREATE TABLE coche (
	id int auto_increment,
    color_id int,
    matricula varchar(7),
    marca_id int,
    primary key (id)
);

CREATE TABLE tarjeta (
	id int auto_increment,
    numero int,
    nombre varchar(25),
    primary key (id)
);

CREATE TABLE ticket (
	id int auto_increment,
    coche_id int,
    zona_id int,
    hora_inicio time,
    hora_final time,
    primary key (id)
);

CREATE TABLE zonas (
	id int auto_increment,
    zona varchar(50),
    primary key (id)
);

CREATE TABLE marcas (
	id int auto_increment,
    nombre varchar(50),
    primary key (id)
);

CREATE TABLE color (
	id int auto_increment,
    color varchar(50),
    primary key (id)
);
