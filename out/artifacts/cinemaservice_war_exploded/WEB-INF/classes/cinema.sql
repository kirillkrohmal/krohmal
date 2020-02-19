CREATE TABLE cinemauser
(
    id serial NOT NULL,
    username character varying(2000),
    phone character varying(2000),
    CONSTRAINT cinemauser_pkey PRIMARY KEY (id)
);
