create table IF NOT EXISTS medicos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    telefone varchar(20) not null,
    crm varchar(6) not null unique,
    especialidade varchar(100) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero integer,
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)
);
create table IF NOT EXISTS pacientes(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    telefone varchar(20) not null,
    cpf varchar(15) not null unique,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero integer,
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)
    );