/*Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o
seguinte nome db_cidade_das_carnes, onde o sistema trabalhará com as informações dos
produtos desta empresa. O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
siga exatamente esse passo a passo:
Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.
Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não
esqueça de criar a foreign key de tb_categoria nesta tabela).
Popule esta tabela Categoria com até 5 dados. Popule esta tabela Produto com até 8 dados.
Faça um select que retorne os Produtos com o valor maior do que 50 reais.
Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
Faça um select utilizando LIKE buscando os Produtos com as letras CO.
Faça um um select com Inner join entre tabela categoria e produto.
Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/
create database db_cidade_das_carnes;
-- indicando qual é o banco que será inserido e consulta
use db_cidade_das_carnes;
-- criando a tabela categoria
create table tb_categoria (id bigint (5) auto_increment,nome varchar(200) not null, ativo boolean, primary key (id));
-- inserindo informações na tabela categoria
insert into tb_categoria (nome, ativo) values ("Bovina", true), ("Aves", true), ("Suinos", true), ("Linguicas", true), ("Salsichas", true);
-- criando a tabela produto
select * from tb_categoria;
create table tb_produto (
id bigint (5) auto_increment, 
nome varchar(200) not null, 
preco decimal(10,2) not null, 
quantidade int not null, 
categoria_id bigint, 
primary key(id), 
foreign key (categoria_id) references tb_categoria (id)) ;
-- inserindo infomrmação na tabela produto
insert into tb_produto (nome, preco, quantidade, categoria_id) values 
("Largato", 75.90, 75, 1), ("Paleta", 23.90, 75, 1), ("Frango inteiro", 12.90, 150, 2), 
("Assa", 25.90, 100, 2), ("Orelha", 23.90, 68, 3), ("Pé de porco", 15.90, 68, 3), ("Linguiça calabresa", 11.90, 75, 4), 
("Linguiça toscana", 12.90, 75, 4), ("Salsicha tradicional", 10.90, 150, 5), ("Salsicha vegana", 23.90, 35, 5) ;
 select * from tb_produto;
-- trazendo da tabela produto o valor maior que 50.00
select *from tb_produto where preco > 50.00;
-- o select pode ser feito de duas formas assim com o raciocionio de logica 
select * from tb_produto where preco > 3 && preco < 60;
-- ou usando os comando do proprio banco de dados como o between
select * from tb_produto where preco between 3 and 60;
-- puxando da tabela os produtos com ca
select * from tb_produto where nome like "%ca%";
-- arrumando o nome frango que estava frando  
update tb_produto set nome = "Frango inteiro" where id=3;
-- buscando dados de duas tabelas e juntando
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- informações sobre busca de dados em tabelas
-- trazer informações das tabelas produto como nome / preco e categoria nome.
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
-- trazer as informações das tabelas produto e categoria e filtrando qual a categoria
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome = "Bovina";
-- trazer as informações das tabelas produto e categoria e filtrando qual a categoria usando like
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome like "%Bo%";
-- trazer as informações das tabelas produto e categoria e filtrando qual a categoria usando o like e filtando por preco
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome like "%Bo%" and tb_produto.preco < 50.00;
-- trazer as informações das tabelas produto e categoria e filtrando qual a categoria usando o like e filtando por preco nome do produto
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome like "%Bo%" and tb_produto.preco < 80.00 and tb_produto.nome like "%a%";
-- usando operadores como o or trazendo dois filtros
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.nome like "%Bo%" or tb_categoria.nome like "%Av%";
-- usando o left
select * from tb_produto left join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
-- usando o right
select * from tb_produto right join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

