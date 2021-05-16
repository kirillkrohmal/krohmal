CREATE TABLE userhiber
(
  id serial NOT NULL,
  name character varying(255),
  expired date,
  CONSTRAINT userhiber_pkey PRIMARY KEY (id)
);