CREATE TABLE body
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT body_pkey PRIMARY KEY (id)
);

CREATE TABLE engine
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT engine_pkey PRIMARY KEY (id)
);

CREATE TABLE model
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT model_pkey PRIMARY KEY (id)
);

CREATE TABLE brand
(
  id serial NOT NULL,
  name character varying(2000),
  CONSTRAINT brand_pkey PRIMARY KEY (id)
);



CREATE TABLE orders
(
  id serial NOT NULL,
  description character varying(2000),
  price int,
  sold boolean,
  body_name int references body(id),
  brand_name int references brand(id),
  engine_name int references engine(id),
  model_name int references model(id),
  image mediumblob NULL,
  str character varying(2000),
  CONSTRAINT orders_pkey PRIMARY KEY (id)
);

insert into body values (1, 'sedan');
insert into body values (2, 'hatchback');
insert into body values (3, 'crossover');
insert into body values (4, 'jeep');

insert into brand values (1, 'BMW');
insert into brand values (2, 'Mercedes');
insert into brand values (3, 'Opel');
insert into brand values (4, 'Volvo');

insert into engine values (1, 'M500');
insert into engine values (2, 'S20');
insert into engine values (3, '340i');
insert into engine values (4, 'mp800');

insert into model values (1, 'i30');
insert into model values (2, 'W140');
insert into model values (3, '365');
insert into model values (4, 'cherokee');