create database db_rh;
use db_rh;
/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará 
com as informações dos funcionários desta empresa. 
Crie uma tabela de funcionários e utilizando a habilidade de abstração e determine 5 
atributos relevantes dos funcionários para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionários com o salário maior do que 2000 e menor de 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.*/
create table tb_funcionario(
id bigint(5) auto_increment,
nome varchar(100) not null,
cargo varchar(150) not null,
salario decimal(10,2),
contrato boolean,
primary key(id)
);
select * from  tb_funcionario;
insert into tb_funcionario(nome, cargo, salario, contrato) values("Maria", "Professora", 1200.00 ,true);
insert into tb_funcionario(nome, cargo, salario, contrato) values("Katia", "ProfessoraI", 1350.00 ,true);
insert into tb_funcionario(nome, cargo, salario, contrato) values("Carlos", "ProfessorI", 1350.00 ,true);
insert into tb_funcionario(nome, cargo, salario, contrato) values("Fernando", "Professor", 1200.00 ,true);
insert into tb_funcionario(nome, cargo, salario, contrato) values("Maria Estela", "Coordenadora", 3500.00 ,true);
select * from tb_funcionario where salario >2000.00;
select * from tb_funcionario where salario < 2000.00;
update tb_funcionario set cargo = "ProfessoraI" where id=1;
update tb_funcionario set salario = 1350.00 where id = 1;
