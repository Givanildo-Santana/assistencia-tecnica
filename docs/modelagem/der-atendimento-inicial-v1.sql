CREATE TABLE "Cliente" (
  "id" integer PRIMARY KEY,
  "nome" varchar(50),
  "telefone" varchar(12),
  "email" varchar(75),
  "endereco" varchar(150)
);

CREATE TABLE "Produto" (
  "id" integer PRIMARY KEY,
  "marca" varchar(50),
  "tipo" varchar(50),
  "modelo" varchar(50),
  "numero_serie" varchar(50),
  "tensao_eletrica" varchar(10)
);

CREATE TABLE "Contato" (
  "id" integer PRIMARY KEY,
  "telefone" varchar(12),
  "descricao" text,
  "data_hora" datetime
);

CREATE TABLE "Atendimento" (
  "id" integer PRIMARY KEY,
  "id_cliente" int,
  "id_produto" int,
  "id_contato" int
);

CREATE TABLE "Agendamento" (
  "id" integer PRIMARY KEY,
  "id_atendimento" int,
  "data" date,
  "periodo" varchar(10)
);

ALTER TABLE "Atendimento" ADD FOREIGN KEY ("id_cliente") REFERENCES "Cliente" ("id") DEFERRABLE INITIALLY IMMEDIATE;

ALTER TABLE "Atendimento" ADD FOREIGN KEY ("id_produto") REFERENCES "Produto" ("id") DEFERRABLE INITIALLY IMMEDIATE;

ALTER TABLE "Contato" ADD FOREIGN KEY ("id") REFERENCES "Atendimento" ("id_contato") DEFERRABLE INITIALLY IMMEDIATE;

ALTER TABLE "Agendamento" ADD FOREIGN KEY ("id_atendimento") REFERENCES "Atendimento" ("id") DEFERRABLE INITIALLY IMMEDIATE;
