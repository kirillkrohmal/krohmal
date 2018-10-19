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