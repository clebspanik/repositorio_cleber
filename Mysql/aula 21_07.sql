USE db_agregacao;

INSERT INTO classe (cod_clas, nome_clas) VALUES (100, 'Padaria'), (102, 'Açougue'), (103, 'Bazar'), (104, 'Frutas e Verduras'), (105, 'Grãos'), (106, 'Frios'), (107, 'Bebidas');

INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (200, 'Perecível', 'Pão de Trigo', 20, 1.99, 100);
INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (201, 'Perecível', 'Bife Bovino', '300 kg', '30.00', 102);
INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (202, 'Brinquedo', 'Boneco Bob Esponja', '10', '10.00', 103);
INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (203, 'Frutas', 'Kiwi', '30 kg', '8.99 Kg', 104);
INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (204, 'Básico', 'Feijão', '100 kg', '8.99', 105);
INSERT INTO produto (cod_prod, tip_prod, nome_prod, qtn_prod, val_prod, classe_cod_clas) VALUES (205, 'Congelados', 'Empanado', '200 kg', '3.99', 106);

