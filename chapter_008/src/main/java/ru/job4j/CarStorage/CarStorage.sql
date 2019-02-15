create table Машина (
id serial primary key,
name varchar(200)
);


create table Кузов (
id serial primary key,
name varchar(200),
Машина_id int references Машина(id)

);

create table Двигатель (
id serial primary key,
name varchar(200),
Машина_id int references Машина(id)
);

create table Коробка_передач (
id serial primary key,
name varchar(200),
Машина_id int references Машина(id)
);



insert into Машина(id, name) values (1, 'СЫР', 3, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (2, 'конфеты', 455, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (3, 'печенье', 7, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (4, 'капуста', 5, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (5, 'яблоки', 2, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (6, 'мед', 29, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (7, 'редиска', 55, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (8, 'мороженое', 27, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (9, 'МОЛОКО', 25, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (10, 'абрикосы', 45, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (11, 'груши', 74, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (12, 'ягоды', 36, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (13, 'картофель', 27, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (14, 'газировка', 2, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (15, 'рыба', 6, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (16, 'апельсины', 4, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (17, 'арбуз', 5, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (18, 'дыня', 25, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (19, 'мясо', 95, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (20, 'пирожные', 85, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (21, 'хлеб', 555, '2018-15-11 12:13:14', 6 )

insert into product(id, name) values (22, 'лук', 34, '2018-11-12 06:08:07', 654 )

insert into product(id, name) values (23, 'чеснок', 5, '2018-15-11 12:13:14', 67 )

insert into product(id, name) values (24, 'кефир', 45, '2018-15-11 12:13:14', 6 )


select * from Машина