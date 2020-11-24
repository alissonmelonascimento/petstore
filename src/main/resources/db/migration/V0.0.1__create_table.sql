CREATE TABLE public.audit (
	id int8 NOT NULL,
	service varchar(100) NOT NULL,
	insert_at date NOT NULL,
	success boolean NOT NULL
);

alter table public.audit add CONSTRAINT audit_pkey PRIMARY KEY(id);