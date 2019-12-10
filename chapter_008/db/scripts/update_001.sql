create table if not exist trackersql (
   id serial primary key not null,
   key varchar(255),
   name varchar(255),
   creat int(255),
   description varchar(255)
);
