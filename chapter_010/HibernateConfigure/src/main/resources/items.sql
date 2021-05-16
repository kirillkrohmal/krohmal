CREATE TABLE items
(
    id serial NOT NULL,
    name varchar(2000),
    CONSTRAINT items_pkey PRIMARY KEY (id)
);