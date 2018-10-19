
create table product(id serial primary key, name varchar(2000), type_id int, expired_date varchar(2000), price varchar(2000))

create table type(id serial primary key, name varchar(2000))