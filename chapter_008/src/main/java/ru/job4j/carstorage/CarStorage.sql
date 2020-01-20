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



insert into Машина(id, name) values (1, 'Mersedes');

insert into Кузов(id, name, Машина_id) values (1, 'универсал', 1);

insert into Двигатель(id, name, Машина_id) values (1, 'b-26', 1);

insert into Коробка_передач(id, name, Машина_id) values (1, 'ZF', 1);

insert into Машина(id, name) values (2, 'BMW');

insert into Кузов(id, name, Машина_id) values (2, 'купе', 2);

insert into Двигатель(id, name, Машина_id) values (2, 'm252', 2);

insert into Коробка_передач(id, name, Машина_id) values (2, 'ZF', 2);

insert into Машина(id, name) values (3, 'Opel');

insert into Кузов(id, name, Машина_id) values (3, 'универсал', 3);

insert into Двигатель(id, name, Машина_id) values (3, 'D53', 3);

insert into Коробка_передач(id, name, Машина_id) values (3, 'F17', 3);

insert into Машина(id, name) values (4, 'Chevrolet');

insert into Кузов(id, name, Машина_id) values (4, 'седан', 4);

insert into Двигатель(id, name, Машина_id) values (4, 'G54', 4);

insert into Коробка_передач(id, name, Машина_id) values (4, 'F14D3', 4);

insert into Машина(id, name) values (5, 'Audi');

insert into Кузов(id, name, Машина_id) values (5, 'купе', 5);

insert into Двигатель(id, name, Машина_id) values (5, 'b-26', 5);

insert into Коробка_передач(id, name, Машина_id) values (5, 'ZF', 5);

insert into Машина(id, name) values (6, 'Lada');

insert into Кузов(id, name, Машина_id) values (6, 'седан', 6);

insert into Двигатель(id, name, Машина_id) values (6, 'Mt424', 6);

insert into Коробка_передач(id, name, Машина_id) values (6, 'АМТ', 6);



select * from Машина