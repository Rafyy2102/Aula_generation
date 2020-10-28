/*Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa. O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
Siga exatamente esse passo a passo: Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.
Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
(não esqueça de criar a foreign key de tb_categoria nesta tabela). Popule esta tabela Categoria com até 5 dados.
Popule esta tabela Produto com até 8 dados. Faça um select que retorne os Produtos com o valor maior do que 50 reais.
Faça um select trazendo os Produtos com valor entre 3 e 60 reais. Faça um select utilizando LIKE buscando os Produtos com as letras CI.
Faça um um select com Inner join entre tabela categoria e produto. Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica).*/
create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
create table tb_categoria( id bigint(5) auto_increment, nome varchar (250) not null, ativo boolean, primary key (id));
insert into tb_categoria (nome, ativo) values ("Bloco", true), ("Cimento", true), ("Cano",true), ("Tinta",true), ("Pisos", true);
select * from tb_categoria;
create table tb_produto(
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal(10,2),
quantidade int, 
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id));
insert into tb_produto (nome, preco, quantidade, categoria_id) values 
("Tijolo Baiano", 65.00, 1500, 1), ("Bloco de Cimento", 95.00, 1500, 1),
("Cimento CII", 25.00, 200, 2), ("Argamassa Interno", 30.00, 300, 2),
("Cano PVC", 150.00, 1000, 3), ("Cano Cobre", 250.00, 1000, 3),
("Massa Corrida", 300.00, 400, 4), ("Tinta Acrilica", 150.00, 500, 4),
("Piso Ceramico", 10.00, 1000, 5), ("Porcelanato", 20.00, 1000, 5);
select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from  tb_produto where nome like "%ci%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome = "cimento";








