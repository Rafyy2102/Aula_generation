-- create database db_rh2;
/*Crie um banco de dados para um serviço de RH de uma empresa, o nome do banco deverá ter o seguinte nome 
db_RH2, onde o sistema trabalhará com as informações dos funcionários desta empresa. O sistema trabalhará 
com 2 tabelas tb_funcionário e tb_cargo. Siga exatamente esse passo a passo:
Crie uma tabela tb_cargo utilizando a habilidade de abstração e determine 3 atributos relevantes do 
Cargos para se trabalhar com o serviço deste RH. Crie uma tabela tb_funcionário e utilizando a habilidade 
de abstração e determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH (não
esqueça de criar a foreign key de tb_cargo nesta tabela). Popule esta tabela cargos com até 5 dados. Popule 
esta tabela funcionarios com até 15 dados. Faça um select que retorne os funcionários com o salário maior 
do que 2000. Faça um select trazendo os funcionários com salário entre 1000 e 2000. Faça um select utilizando 
LIKE buscando os Funcionários com a letra C.*/
-- use db_rh2;
create table tb_cargo(
id bigint(5) auto_increment,
cargo varchar(100) not null,
departamento varchar (150) not null,
primary key (id));

create table tb_funcionario(
id bigint(5) auto_increment,
nome varchar(100) not null,
cpf varchar(11) not null,
salario decimal(10,2) not null,
contrato boolean,
cargo_id bigint not null,
primary key(id),
foreign key(cargo_id) references tb_cargo (id));

select * from tb_cargo;
select * from tb_funcionario;

-- inserindo varios dados ao mesmo tempo na tabela cargo
insert into tb_cargo(cargo, departamento) values ("Auxiliar Administrativo", "Administrativo"), 
("Auxiliar de RH","Recurso Humanos"), ("Assistente Administrativo","Administrativo"),
("Analista de RH","Recurso Humanos"), ("Gerente de RH","Recurso Humanos");
 
 -- inserindo varios dados ao mesmo tempo na tabela funcionario
 insert into tb_funcionario (nome, CPF, salario, contrato, cargo_id)  values 
 ("Jose Silva",'36925814712', 2000.00, true, 3), ("Maria Goncalves", '45612378996', 2500.00, true, 4), 
 ("Marcela de Oliveira",'78945612336', 1500.00, true, 1), ("Mara Albuquerque", '14725836945', 3600.00, true, 4), 
 ("Jaciano da Costa", '45612378945', 4500.00, true, 5), ("Guilherme Santos", '36345888944', 2000.00, true, 2),
 ("Mario Goncalves", '45612378895', 2500.00, true, 3),  ("Marcos de Oliver", '45645612336', 1500.00, true, 2), 
 ("Ricardo Jucas", '78425836945', 3600.00, true, 4), ("Jaqueline da Costa", '45612312545', 4500.00, true, 5), 
 ("Donatelo Silva", '36316978944', 2000.00, true, 2),  ("Nancy Goncalves", '45854378996', 2500.00, true, 1), 
 ("Eduardo de Oliveira", '78945745336', 1500.00, true, 2), ("Kaio Milque", '14693836945', 3600.00, true, 4), 
 ("Piter Malaquias", '45685278945', 4500.00, true, 5);
 
 select * from tb_funcionario where salario > 2000.00;
 
 -- selecionando valor em um determinado intervalo
 select * from tb_funcionario where salario  BETWEEN 1000.00 and 2000.00 ;
 
 -- no meu banco de dados não foi cadastrado pessoas com a letra C então farei com a letra M.
 select * from tb_funcionario where nome  like "M%";
 
 