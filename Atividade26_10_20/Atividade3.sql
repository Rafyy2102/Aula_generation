-- create database db_escola;
/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as 
informações dos alunos deste registro dessa escola. 
Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos 
relevantes dos alunos/a para se trabalhar com o serviço dessa escola.
Popule esta tabela com até 8 dados;
Faça um select que retorne o/as alunos/a com a nota maior e menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.*/
use db_escola;
create table tb_alunos(
id bigint(5) auto_increment,
nome varchar(100) not null,
turma char (1) ,
nota decimal(10,2),
matricula boolean,
primary key(id)
);
select * from tb_alunos;
insert into tb_alunos(nome, turma, nota, matricula) values ("Ricardo",'A', 7.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Cristina",'A', 8.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Miguel",'A', 4.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Jaqueline",'A', 5.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Mara",'B', 10.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Rogerio",'B', 7.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Caroline",'B', 6.00, true);
insert into tb_alunos(nome, turma, nota, matricula) values ("Marcelo",'B', 9.00, true);
select * from tb_alunos where nota > 7.00;
select * from tb_alunos where nota < 7.00;
update tb_alunos set nota = 4.00 where id = 3;
update tb_alunos set nota = 4.00 where id = 8;
update tb_alunos set matricula = false  where id = 8;
