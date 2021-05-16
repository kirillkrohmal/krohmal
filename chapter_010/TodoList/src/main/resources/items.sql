CREATE TABLE items
(
  id serial NOT NULL,
  description character varying(2000),
  create_date timestamp without time zone,
  done boolean NOT NULL,
  CONSTRAINT items_pkey PRIMARY KEY (id)
);
