CREATE DATABASE Loja_de_Doce ;
USE Loja_de_Doce ;

CREATE TABLE CLIENTE (
Id_Cliente Int not null auto_increment primary key,
Nome Varchar (60),
Idade Int,
Email Varchar (50),
Tel Varchar (13),
CPF Varchar (14)
);

CREATE TABLE FUNCIONARIO (
Id_Func Int not null auto_increment primary key,
Nome Varchar (60),
Idade Int,
Email Varchar (50),
Tel Varchar (13),
CPF Varchar (14)
);

CREATE TABLE DOCES (
Id_Doce Int not null auto_increment primary key,
Nome Varchar (50),
Descricao Varchar (200),
Preco_Uni int,
Quant Int
);


SELECT * FROM FUNCIONARIO;

INSERT INTO CLIENTE (Nome, Idade, Email, Tel)
VALUES
    ('João da Silva', 35, 'joao.silva@email.com', '(11) 1234-5678'),
    ('Maria Oliveira', 28, 'maria.oliveira@email.com', '(22) 9876-5432'),
    ('Pedro Santos', 40, 'pedro.santos@email.com', '(33) 5555-5555'),
    ('Ana Souza', 23, 'ana.souza@email.com', '(44) 7777-7777'),
    ('Carlos Pereira', 50, 'carlos.pereira@email.com', '(55) 9999-9999'),
    ('Laura Almeida', 32, 'laura.almeida@email.com', '(66) 1111-1111'),
    ('José Ferreira', 45, 'jose.ferreira@email.com', '(77) 3333-3333'),
    ('Fernanda Lima', 29, 'fernanda.lima@email.com', '(88) 2222-2222'),
    ('Paulo Ribeiro', 38, 'paulo.ribeiro@email.com', '(99) 4444-4444'),
    ('Beatriz Santos', 26, 'beatriz.santos@email.com', '(00) 6666-6666');
