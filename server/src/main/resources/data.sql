-- Inserindo 20 registros na tabela empresa
INSERT INTO empresa (razaosocial, cnpj, logradouro, municipio, numero, bairro, cep, telefone, email, usuario, senha)
VALUES 
  ('Empresa 1', '12345678000123', 'Rua 1', 'Cidade 1', '1', 'Bairro 1', '12345678', '12345678', 'email1@empresa1.com', 'usuario1', 'senha1'),
  ('Empresa 2', '12345678000456', 'Rua 2', 'Cidade 2', '2', 'Bairro 2', '23456789', '23456789', 'email2@empresa2.com', 'usuario2', 'senha2'),
  ('Empresa 3', '12345678000789', 'Rua 3', 'Cidade 3', '3', 'Bairro 3', '34567890', '34567890', 'email3@empresa3.com', 'usuario3', 'senha3'),
  ('Empresa 4', '12345678000321', 'Rua 4', 'Cidade 4', '4', 'Bairro 4', '45678901', '45678901', 'email4@empresa4.com', 'usuario4', 'senha4'),
  ('Empresa 5', '12345678000654', 'Rua 5', 'Cidade 5', '5', 'Bairro 5', '56789012', '56789012', 'email5@empresa5.com', 'usuario5', 'senha5'),
  ('Empresa 6', '12345678000987', 'Rua 6', 'Cidade 6', '6', 'Bairro 6', '67890123', '67890123', 'email6@empresa6.com', 'usuario6', 'senha6'),
  ('Empresa 7', '12345678000111', 'Rua 7', 'Cidade 7', '7', 'Bairro 7', '78901234', '78901234', 'email7@empresa7.com', 'usuario7', 'senha7'),
  ('Empresa 8', '12345678000122', 'Rua 8', 'Cidade 8', '8', 'Bairro 8', '89012345', '89012345', 'email8@empresa8.com', 'usuario8', 'senha8'),
  ('Empresa 9', '12345678000133', 'Rua 9', 'Cidade 9', '9', 'Bairro 9', '90123456', '90123456', 'email9@empresa9.com', 'usuario9', 'senha9'),
  ('Empresa 10', '12345678000144', 'Rua 10', 'Cidade 10', '10', 'Bairro 10', '90123456', '90123456', 'email10@empresa10.com', 'usuario10', 'senha10'),
  ('Empresa 11', '12345678000155', 'Rua 11', 'Cidade 11', '11', 'Bairro 11', '01234567', '01234567', 'email11@empresa11.com', 'usuario11', 'senha11'),
  ('Empresa 12', '12345678000166', 'Rua 12', 'Cidade 12', '12', 'Bairro 12', '12345678', '12345678', 'email12@empresa12.com', 'usuario12', 'senha12'),
  ('Empresa 13', '12345678000177', 'Rua 13', 'Cidade 13', '13', 'Bairro 13', '23456789', '23456789', 'email13@empresa13.com', 'usuario13', 'senha13'),
  ('Empresa 14', '12345678000188', 'Rua 14', 'Cidade 14', '14', 'Bairro 14', '34567890', '34567890', 'email14@empresa14.com', 'usuario14', 'senha14'),
  ('Empresa 15', '12345678000199', 'Rua 15', 'Cidade 15', '15', 'Bairro 15', '45678901', '45678901', 'email15@empresa15.com', 'usuario15', 'senha15'),
  ('Empresa 16', '12345678000200', 'Rua 16', 'Cidade 16', '16', 'Bairro 16', '56789012', '56789012', 'email16@empresa16.com', 'usuario16', 'senha16'),
  ('Empresa 17', '12345678000211', 'Rua 17', 'Cidade 17', '17', 'Bairro 17', '67890123', '67890123', 'email17@empresa17.com', 'usuario17', 'senha17'),
  ('Empresa 18', '12345678000222', 'Rua 18', 'Cidade 18', '18', 'Bairro 18', '78901234', '78901234', 'email18@empresa18.com', 'usuario18', 'senha18'),
  ('Empresa 19', '12345678000233', 'Rua 19', 'Cidade 19', '19', 'Bairro 19', '89012345', '89012345', 'email19@empresa19.com', 'usuario19', 'senha19'),
  ('Empresa 20', '12345678000244', 'Rua 20', 'Cidade 20', '20', 'Bairro 20', '90123456', '90123456', 'email20@empresa20.com', 'usuario20', 'senha20');

-- Inserindo 20 registros na tabela leilao
INSERT INTO leilao (codigo, descricao, vendedor, inicioprevisto)
VALUES 
  (1, 'Leilao 1', 1, '2022-01-01 10:00:00'),
  (2, 'Leilao 2', 2, '2022-02-01 10:00:00'),
  (3, 'Leilao 3', 3, '2022-03-01 10:00:00'),
  (4, 'Leilao 4', 4, '2022-04-01 10:00:00'),
  (5, 'Leilao 5', 5, '2022-05-01 10:00:00'),
  (6, 'Leilao 6', 6, '2022-06-01 10:00:00'),
  (7, 'Leilao 7', 7, '2022-07-01 10:00:00'),
  (8, 'Leilao 8', 8, '2022-08-01 10:00:00'),
  (9, 'Leilao 9', 9, '2022-09-01 10:00:00'),
  (10, 'Leilao 10', 10, '2022-10-01 10:00:00'),
  (11, 'Leilao 11', 11, '2022-11-01 10:00:00'),
  (12, 'Leilao 12', 12, '2022-12-01 10:00:00'),
  (13, 'Leilao 13', 13, '2022-12-31 10:00:00'),
  (14, 'Leilao 14', 14, '2022-12-25 10:00:00'),
  (15, 'Leilao 15', 15, '2022-12-24 10:00:00'),
  (16, 'Leilao 16', 16, '2022-12-23 10:00:00'),
  (17, 'Leilao 17', 17, '2022-12-22 10:00:00'),
  (18, 'Leilao 18', 18, '2022-12-21 10:00:00'),
  (19, 'Leilao 19', 19, '2022-12-20 10:00:00'),
  (20, 'Leilao 20', 20, '2022-12-19 10:00:00');

-- Inserindo 20 registros na tabela Lote
INSERT INTO Lote (numerolote, descricao, quantidade, valorinicial, unidade, leilao)
VALUES 
  (1, 'Lote 1', 100, 10, 'unidade', 1),
  (2, 'Lote 2', 200, 20, 'unidade', 2),
  (3, 'Lote 3', 300, 30, 'unidade', 3),
  (4, 'Lote 4', 400, 40, 'unidade', 4),
  (5, 'Lote 5', 500, 50, 'unidade', 5),
  (6, 'Lote 6', 600, 60, 'unidade', 6),
  (7, 'Lote 7', 700, 70, 'unidade', 7),
  (8, 'Lote 8', 800, 80, 'unidade', 8),
  (9, 'Lote 9', 900, 90, 'unidade', 9),
  (10, 'Lote 10', 1000, 100, 'unidade', 10),
  (11, 'Lote 11', 1100, 110, 'unidade', 11),
  (12, 'Lote 12', 1200, 120, 'unidade', 12),
  (13, 'Lote 13', 1300, 130, 'unidade', 13),
  (14, 'Lote 14', 1400, 140, 'unidade', 14),
  (15, 'Lote 15', 1500, 150, 'unidade', 15),
  (16, 'Lote 16', 1600, 160, 'unidade', 16),
  (17, 'Lote 17', 1700, 170, 'unidade', 17),
  (18, 'Lote 18', 1800, 180, 'unidade', 18),
  (19, 'Lote 19', 1900, 190, 'unidade', 19),
  (20, 'Lote 20', 2000, 200, 'unidade', 20);

-- Inserindo 20 registros na tabela unidade
INSERT INTO unidade (nome)
VALUES 
  ('unidade 1'),
  ('unidade 2'),
  ('unidade 3'),
  ('unidade 4'),
  ('unidade 5'),
  ('unidade 6'),
  ('unidade 7'),
  ('unidade 8'),
  ('unidade 9'),
  ('unidade 10'),
  ('unidade 11'),
  ('unidade 12'),
  ('unidade 13'),
  ('unidade 14'),
  ('unidade 15'),
  ('unidade 16'),
  ('unidade 17'),
  ('unidade 18'),
  ('unidade 19'),
  ('unidade 20');

-- Inserindo 20 registros na tabela comprador
INSERT INTO comprador (empresa, leilao)
VALUES
  (1, 1),
  (1, 2),
  (2, 1),
  (2, 2),
  (3, 1),
  (3, 2),
  (4, 1),
  (4, 2),
  (5, 1),
  (5, 2),
  (6, 1),
  (6, 2),
  (7, 1),
  (7, 2),
  (8, 1),
  (8, 2),
  (9, 1),
  (9, 2),
  (10, 1),
  (10, 2);

SELECT setval('empresa_id_seq', 21);
SELECT setval('leilao_id_seq', 21);
SELECT setval('lote_id_seq', 21);
SELECT setval('unidade_id_seq', 21);
