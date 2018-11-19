
create table product(id serial primary key, name varchar(2000), type_id int, expired_date varchar(2000), price varchar(2000))

create table type(id serial primary key, name varchar(2000))

insert into product(id, name) values (1, 'СЫР', 3, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (2, 'конфеты', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (3, 'печенье', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (4, 'капуста', 5, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (5, 'яблоки', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (6, 'мед', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (7, 'редиска', 55, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (8, 'мороженое', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (9, 'МОЛОКО', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (10, 'абрикосы', 45, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (11, 'груши', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (12, 'ягоды', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (13, 'картофель', 355, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (14, 'газировка', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (15, 'рыба', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (16, 'апельсины', 455, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (17, 'арбуз', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (18, 'дыня', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (19, 'мясо', 345, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (20, 'пирожные', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (21, 'хлеб', '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (22, 'лук', 34, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (23, 'чеснок', '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (24, 'кефир', '2018-15-11 12:13:14', 6 )

select * FROM product where name = 'СЫР';
select * FROM product where name = 'мороженое';




select * FROM product where name = 'мороженое' and name = 'СЫР';



