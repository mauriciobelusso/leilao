CREATE TABLE EMPRESA (
    ID SERIAL NOT NULL,
    RAZAOSOCIAL VARCHAR(64) NOT NULL,
    CNPJ VARCHAR(32) NOT NULL,
    LOGRADOURO VARCHAR(64),
    MUNICIPIO VARCHAR(64),
    NUMERO VARCHAR(10),
    COMPLEMENTO VARCHAR(64),
    BAIRRO VARCHAR(64),
    CEP VARCHAR(16),
    TELEFONE VARCHAR(32),
    EMAIL VARCHAR(254) NOT NULL,
    SITE VARCHAR(254),
    USUARIO VARCHAR(10) NOT NULL,
    SENHA VARCHAR(128),
    CREATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    UPDATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    CONSTRAINT EMPRESA_PK PRIMARY KEY (ID),
    CONSTRAINT EMPRESA_CNPJ_UK UNIQUE (CNPJ)
);

ALTER TABLE EMPRESA ADD CONSTRAINT EMPRESA_USUARIO_UK UNIQUE (USUARIO);

CREATE TABLE LEILAO (
    ID SERIAL NOT NULL,
    CODIGO INTEGER,
    DESCRICAO VARCHAR(60) NOT NULL,
    VENDEDOR INTEGER NOT NULL,
    INICIOPREVISTO TIMESTAMP NOT NULL,
    CREATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    UPDATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    CONSTRAINT LEILAO_PK PRIMARY KEY (ID)
);

CREATE TABLE LOTE (
    ID SERIAL NOT NULL,
    NUMEROLOTE INTEGER,
    DESCRICAO VARCHAR(60) NOT NULL,
    QUANTIDADE NUMERIC NOT NULL,
    VALORINICIAL NUMERIC,
    UNIDADE VARCHAR(128) NOT NULL,
    LEILAO SERIAL NOT NULL,
    CREATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    UPDATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    CONSTRAINT LOTE_PK PRIMARY KEY (ID),
    CONSTRAINT LEILAO_LOTE_FK FOREIGN KEY (LEILAO) REFERENCES LEILAO(ID)
);

CREATE TABLE UNIDADE (
    ID SERIAL NOT NULL,
    NOME VARCHAR(128) NOT NULL,
    CREATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    UPDATEDAT TIMESTAMP NOT NULL DEFAULT now(),
    CONSTRAINT UNIDADE_PK PRIMARY KEY (ID)
);

CREATE TABLE COMPRADOR (
    EMPRESA INTEGER NOT NULL,
    LEILAO INTEGER NOT NULL,
    CONSTRAINT COMPRADOR_PK PRIMARY KEY (EMPRESA, LEILAO),
    CONSTRAINT EMPRESA_COMP_FK FOREIGN KEY (EMPRESA) REFERENCES EMPRESA(ID),
    CONSTRAINT LEILAO_COMP_FK FOREIGN KEY (LEILAO) REFERENCES LEILAO(ID)
);