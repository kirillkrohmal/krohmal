
create table product(
id serial primary key,
name varchar(2000),
type_id int references type(id),
expired_date timestamp without time zone,
price int);

create table type(
id serial primary key,
name varchar(2000));

insert into product(id, name, type_id, expired_date, price) values (1, 'СЫР', 3, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (2, 'конфеты', 455, '2018-01-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (3, 'печенье', 7, '2018-04-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (4, 'капуста', 5, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (5, 'яблоки', 2, '2018-08-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (6, 'мед', 29, '2018-09-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (7, 'редиска', 55, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (8, 'мороженое', 27, '2018-04-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (9, 'МОЛОКО', 25, '2018-01-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (10, 'абрикосы', 45, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (11, 'груши', 74, '2018-11-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (12, 'ягоды', 36, '2018-12-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (13, 'картофель', 27, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (14, 'газировка', 2, '2018-09-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (15, 'рыба', 6, '2018-08-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (16, 'апельсины', 4, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (17, 'арбуз', 5, '2018-05-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (18, 'дыня', 25, '2018-05-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (19, 'мясо', 95, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (20, 'пирожные', 85, '2018-01-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (21, 'хлеб', 555, '2018-03-11 12:13:14', 6 );

insert into product(id, name, type_id, expired_date, price) values (22, 'лук', 34, '2018-11-12 06:08:07', 654 );

insert into product(id, name, type_id, expired_date, price) values (23, 'чеснок', 5, '2018-07-11 12:13:14', 67 );

insert into product(id, name, type_id, expired_date, price) values (24, 'кефир', 45, '2018-11-11 12:13:14', 6 );





insert into type(id, name) values (1, 'СЫР');

insert into type(id, name) values (2, 'конфеты');

insert into type(id, name) values (3, 'печенье');

insert into type(id, name) values (4, 'капуста');

insert into type(id, name) values (5, 'яблоки');

insert into type(id, name) values (6, 'мед');

insert into type(id, name) values (7, 'редиска');

insert into type(id, name) values (8, 'мороженое');

insert into type(id, name) values (9, 'МОЛОКО');

insert into type(id, name) values (10, 'абрикосы');

insert into type(id, name) values (11, 'груши');

insert into type(id, name) values (12, 'ягоды');

insert into type(id, name) values (13, 'картофель');

insert into type(id, name) values (14, 'газировка');

insert into type(id, name) values (15, 'рыба');

insert into type(id, name) values (16, 'апельсины');

insert into type(id, name) values (17, 'арбуз');

insert into type(id, name) values (18, 'дыня');

insert into type(id, name) values (19, 'мясо');

insert into type(id, name) values (20, 'пирожные');

insert into type(id, name) values (21, 'хлеб');

insert into type(id, name) values (22, 'лук');

insert into type(id, name) values (23, 'чеснок');

insert into type(id, name) values (24, 'кефир');



select * FROM product where name = 'СЫР';
select * FROM product where name = 'мороженое';
select * FROM product where expired_date = '2020-02-19';
select * FROM product where MAX(price);
select * FROM product where name = 'хлеб' AND expired_date = '2018-11-11 12:13:14';
select * FROM type where name = 'СЫР' union all select name FROM type where name = 'МОЛОКО';
select * FROM product where type_id < 10;
select * FROM product AND type_id;






