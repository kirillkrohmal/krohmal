create table if not exist trackersql (
   id serial primary key not null,
   name varchar(255),
   description varchar(255)
);
