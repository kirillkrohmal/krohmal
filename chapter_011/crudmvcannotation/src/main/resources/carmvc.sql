CREATE TABLE body
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT body_pkey PRIMARY KEY (id)
);

CREATE TABLE brand
(
  id serial NOT NULL,
  name character varying(45),
  CONSTRAINT brand_pkey PRIMARY KEY (id)
);


CREATE TABLE model
(
  id serial NOT NULL,
  name character varying(45),
  CONSTRAINT model_pkey PRIMARY KEY (id)
);


CREATE TABLE image
(
  id serial NOT NULL,
  url character varying(45),
  order_id int references orders(id) not null,
  CONSTRAINT image_pkey PRIMARY KEY (id)
);


CREATE TABLE orders
(
  id serial NOT NULL,
  description character varying(2000),
  price int,
  sold boolean,
  body character varying(2000),
  brand character varying(2000),
  engine character varying(2000),
  model character varying(2000),
  image mediumblob NULL,
  imageStr character varying(2000),
  CONSTRAINT orders_pkey PRIMARY KEY (id)
);

CREATE TABLE engine
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT engine_pkey PRIMARY KEY (id)
);

CREATE TABLE cars
(
  id serial NOT NULL,
  engine_power int,
  year int,
  color character varying(2000),
  milliage int,
  body_id int references body(id) not null,
  brand_id int references brand(id) not null,
  model_id int references model(id) not null,
  engine_id int references engine(id) not null,
  CONSTRAINT cars_pkey PRIMARY KEY (id)
);

CREATE TABLE users
(
  id serial NOT NULL,
  name character varying(45),
  CONSTRAINT users_pkey PRIMARY KEY (id)
);


--adding some value to tables.
insert into body values ('sedan');
insert into body values ('hatchback');
insert into body values ('crossover');
insert into body values ('jeep');

--adding some value to tables.
insert into color values ('black');
insert into color values ('gray');
insert into color values ('green');
insert into color values ('yellow');

--adding some value to tables.
insert into gearbox values ('mechanic');
insert into gearbox values ('automat');


--adding some value to table.
insert into producer values ('audi');
insert into producer values ('bmw');
insert into producer values ('mercesedes');
insert into producer values ('lada(VAZ');

--adding some value to the table.
insert into model values ('a4');
insert into model values ('x6');
insert into model values ('S63');
insert into model values ('Granta');


