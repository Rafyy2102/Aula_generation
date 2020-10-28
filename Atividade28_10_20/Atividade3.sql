/*Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
informações dos produtos desta empresa. O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.
siga exatamente esse passo a passo: Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.
Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).
Popule esta tabela Categoria com até 5 dados. Popule esta tabela Produto com até 8 dados.
Faça um select que retorne os Produtos com o valor maior do que 50 reais. 
Faça um select trazendo os Produtos com valor entre 3 e 60 reais.Faça um select utilizando LIKE buscando os Produtos com as letras JAV.
Faça um um select com Inner join entre tabela categoria e produto.
Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria Java).*/
-- create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table tb_categoria( id bigint(5) auto_increment, nome varchar (255) not null, ativo boolean, primary key (id));
insert into tb_categoria (nome, ativo) values ("Programação I", true), ("Programação II", true), ("Programação III", true), ("Programação IV", true), ("Programação V", true);
select * from tb_categoria;
create table tb_produto(
id bigint(5) auto_increment,
nome varchar (255) not null, 
valor decimal not null,
numero_horas int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria(id));
insert into tb_produto (nome, valor, numero_horas, categoria_id) values 
("HTML-CSS", 75.00, 150, 1), ("HTML5-CSS 3", 85.00, 150, 1),
("JAVASCRIPT BASICO", 100.00, 170, 2), ("JAVASCRIPT INTERMEDIARIO-AVANÇADO", 350.00, 450, 2),
("JAVA BASICO I", 150.00, 250, 3), ("JAVA BASICO II", 160.00, 260, 3),
("JAVA INTERMEDIARIO I", 200.00, 350, 4), ("JAVA INTERMEDIARIO II", 300.00, 360, 4),
("JAVA AVANÇADO I", 400.00, 400, 5), ("JAVA AVANÇADO II", 500.00, 450, 5);
select * from tb_produto;
select * from tb_produto where valor > 50.00;
select * from tb_produto where valor between  50 and 100;
select * from tb_produto where nome like "%JAV%";
select tb_produto.nome, tb_produto.valor, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_produto.nome like "%java%";




