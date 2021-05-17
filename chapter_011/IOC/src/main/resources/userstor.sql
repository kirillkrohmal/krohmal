CREATE TABLE userstor
(
  id serial NOT NULL,
  first_name character varying(45),
  last_name character varying(45),
  email character varying(45),
  CONSTRAINT user_pkey PRIMARY KEY (id)
);