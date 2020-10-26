create database db_ecommerce;
/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações 
dos produtos deste ecommerce. 
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos 
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500 e menor que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.tb_funcionario*/
use db_ecommerce;
CREATE TABLE tb_produto (
    id BIGINT(5) AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10 , 2 ),
    quantidade INT(10),
    estoque BOOLEAN,
    PRIMARY KEY (id)
);
SELECT * FROM tb_produto;
insert into tb_produto(nome, valor, quantidade, estoque) values("Pneu", 300.00, 5, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Freio", 250.00, 15, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Lanterna", 1000.00, 10, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Pedal", 500.00, 5, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Aro16", 350.00, 5, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Aro18", 600.00, 5, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Pastilhas", 1200.00, 5, true);
insert into tb_produto(nome, valor, quantidade, estoque) values("Graxa", 350.00, 5, true);
select * from tb_produto where valor > 500;
select * from tb_produto where valor < 500;
update tb_produto set nome ="Pneus" where id=1;
update tb_produto set nome ="Freios" where id = 2;

