create database db_ecommerce2;
/*Crie um banco de dados para um serviço de ecommerce de uma empresa, o nome do
banco deverá ter o seguinte nome db_ecommerce, onde o sistema trabalhará com as
informações dos produtos desta empresa.O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
siga exatamente esse passo a passo: Crie uma tabela de categorias utilizando a habilidade de abstração e 
determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.
Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste ecommerce (não
esqueça de criar a foreign key de tb_categoria nesta tabela).
Popule esta tabela Categoria com até 5 dados. Popule esta tabela Produto com até 15 dados.
Faça um select que retorne os Produtos com o valor maior do que 2000.Faça um select trazendo os Produtos com 
valor entre 1000 e 2000. Faça um select utilizando LIKE buscando os Produtos com a letra C.*/

use db_ecommerce2;
create table tb_categoria(
id bigint (5) auto_increment,
categoria varchar (150) not null, 
tipo char(1),
primary key(id)
);

create table tb_produto(
id bigint (5) auto_increment,
nome varchar (150) not null, 
valor decimal(10,2) not null,
quantidade int not null, 
estoque boolean,
categoria_id bigint not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id));

select * from tb_categoria;
select * from tb_produto;

-- inserindo varios dados ao mesmo tempo na tabela categoria
insert into tb_categoria (categoria, tipo) values ("Moda Femininas",'F'),("Moda Masculinas",'M'),("Moda Infantis",'I'), ("Diversos",'D'), ("Bebês",'B');

-- inserindo varios dados ao mesmo tempo na tabela produto
insert into tb_produto(nome, valor, quantidade, estoque, categoria_id) values 
("Vestido longa", 100.00, 10, true, 1),("Vestido curta", 200.00, 10, true, 1), ("Saia longa", 85.00, 30, true,1),
("Calça", 175.00, 15, true, 2),("Short", 25.00, 10, true, 2), ("Cueca", 85.00, 30, true, 2),
("Meia", 35.00, 35, true, 3),("Calça", 95.00, 20, true, 3), ("Short", 85.00, 30, true, 3),
("Biquine", 250.00, 15, true, 4),("Sunga", 250.00, 10, true, 4), ("Boné", 175.00, 30, true, 4),
("body manga longa", 35.00, 15, true, 5),("body manga curta", 25.00, 10, true, 5), ("macacão manga longa", 85.00, 30, true, 5);

select * from tb_produto where valor > 100.00;

-- selecionando valor em um determinado intervalo
select * from tb_produto where valor between 20.00 and 100.00;

 -- no meu banco de dados não foi cadastrado pessoas com a letra C.
 select * from tb_produto where nome like "C%";


