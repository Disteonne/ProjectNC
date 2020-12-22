CREATE DATABASE sales ENCODING 'UTF-8';
CREATE TABLE customer (
        id SERIAL PRIMARY KEY ,
        name varchar(45) NOT NULL,
        email varchar(45) NOT NULL,
        address varchar(45) NOT NULL
);