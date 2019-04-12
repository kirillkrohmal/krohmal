create table user (
id serial primary key,
name varchar (2000)

)

create table role (
id serial primary key,
name varchar (2000)
item_id int references item(id)
)


create table role (
id serial primary key,
name varchar (2000)
)

create table rules (
rules _id int references rules(id)
id serial primary key,
rules_id int references role_rules(id)
rules_id int references rules(id)
)



create table item (
id serial primary key,
name varchar (2000)

)

create table category (
id serial primary key,
name varchar (2000)
item_id in references item(id)
)

create table item (
id serial primary key,
name varchar (2000)

)

create table state (
id serial primary key,
name varchar (2000)
item_id in references item(id)
)




create table item (
id serial primary key,
name varchar (2000)

)

create table comments (
id serial primary key,
name varchar (2000)
item_id in references item(id)
)

create table item (
id serial primary key,
name varchar (2000)

)

create table attachs (
id serial primary key,
name varchar (2000)
item_id in references item(id)
)


create table item (
id serial primary key,
name varchar (2000)

)

create table user (
id serial primary key,
name varchar (2000)
item_id in references item(id)
)