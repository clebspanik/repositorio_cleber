USE mydb;

SELECT * FROM mydb.aluno;

INSERT INTO aluno (id, nome, celular, email, github_usuario) VALUES (1, 'Cleber', 48913323, 'Cleberpanik@gmail.com', 'Clebspanik');
INSERT INTO aluno (id, nome, celular, email, github_usuario) VALUES (2, 'Matheus M.', 49984228799, 'Matheusmoreiradossantos45@gmail.com', 'MatheusMoreiraSantos');

SELECT * FROM mydb.aluno_prova;

INSERT INTO aluno_prova (aluno_id, prova_id) VALUES (1, 784);
INSERT INTO aluno_prova (aluno_id, prova_id) VALUES (2, 784);

SELECT * FROM mydb.pergunta;

INSERT INTO pergunta (id, pergunta, prova_id) VALUES (2, 'O que é um banco de dados?', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (3, 'Explique o que é um SGBD e cite exemplos', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (4, 'O que são DML, DCL, DDL e DQL?', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (5, 'O que é uma Entidade?', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (6, 'Descreva o que é uma chave primária', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (7, 'Descreva o que é chave estrangeira', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (8, 'Cite a diferença entre chave primaria e chave estrangeira', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (9, 'Um campo do tipo char armazena quais valores? E do tipo int, varchar, date, datetime?', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (10, 'Explique a(s) diferenças entre os tipos Time, Year, DateTime e Date?', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (11, 'Explique p/ que serve a instrução DELETE', 784);

SELECT * FROM mydb.prova;

INSERT INTO prova (id, disciplina) VALUES (784, 'Banco de Dados Relacionais e SQL'); 

SELECT * FROM mydb.resposta;

INSERT INTO resposta (id, resposta, pergunta_id) VALUES (101, 'É um conjunto de informações (dados), orgamizadas, estruturadas e sistematizadas, as quais são armazenadas eletronigamente em um sistema computacional', 2);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (102, 'O sistema gernciador de bancos de dados (SGBD), corresponde a um programa/software que atua como uma interface entre o BD e os usuários ou programas que utilizam suas informações. 
Ele possibilita o gerenciamento e a manutenção das informações e estruturas contidas no BD (criação de bancos e tabelas, definição, alteração e exclusão de campos, registros e tabelas, dentre outras operações) bem como a administração e a avaliação do desempenhio do mesmo.
Como exemplos temos o MySQL, Oracle Database, Microsoft Acess, dBASE, dentre outros.', 3);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (103, 'DML: A linguagem de manipulação de dados corresponde a um subconjunto da linguagem SQL, responsável pelas operações/comandos de manipulação e consulta dos dados contidos nas tabelas. Como exemplos desses comandos temos o SELECT, INSERT e o UPDATE;
DCL: Subconjunto da linguagem SQL que utiliza-se dos comandos GRANT e REVOKE para conceder ou remover permissões aos usuários do banco de dados. Dessa forma, gerencia e controla o acesso as informações contidas nos registros das tabelas, bem como as ações que podem ser realizadas nelas e no banco como um todo;
DDL: Corresponde a linguagem de definição de dados, utilizada para criar e modificar as estruturas contidas no banco de dados. Seus comandos são: CREATE, ALTER e DROP;
DQL: Refere-se ao subconjunto da linguagem responsável pelas operações de consulta dos dados armazenados nas estruturas (tabelas) do banco de dados. Contém a instrução SELECT;', 4);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (104, 'As entidades correspondem à representação de objetos "do mundo real", da realidade a ser modelada e com a qual estamos trabalhando, sobre os quais deseja-se conhecer as informações e relacionamentos existentes. 
Também podem ser entendidas como as tabelas que compõem o Banco de Dados.', 5);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (105, 'A chave primária corresponde a coluna da tabela que é responsável por identificar os registros. Ela pode ser composta por um único campo (chave simples) ou pela combinação de dois ou mais campos (chave composta).', 6);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (106, 'É o campo utilizado para relacionar os registros entre tabelas. Identifica em uma tabela uma coluna que possa armazenar somente valores de chave primária de uma outra tabela. Juntamente com a chave primária, a chave estrangeira estabelece relacionamentos entre tabelas.', 7);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (107, 'A chave primária corresponde a um ou mais campos utilizados para identificar os registros de uma tabela, enquanto a chave estrangeira é utilizada para referenciar a chave primária de outra tabela e, assim, estabelecer uma relação entre duas ou mais tabelas.', 8);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (108, 'O tipo char armazena valores/dados textuais de tamanho fixo, de 0 a 255 caracteres; O tipo int valores/dados numéricos, de 21474836448 a 2147483647; O tipo VARCHAR valores/dados textuais de tamanho variável, de 0 a 65535 caracteres; date informações referentes a data, no formato YYYY-MM-DD e o tipo datetime a combinação de data e hora no mesmo campo.', 9);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (109, 'O tipo Time armazena valores/dados referentes a hora; O tipo Year ao ano; Datetime hora e data e o tipo Date apenas a data;', 10);
INSERT INTO resposta (id, resposta, pergunta_id) VALUES (110, 'A instrução DELETE pode apagar todos os registros de uma tabela ou as informações contidas em campos específicos, por meio do uso da cláusula WHERE;', 11);



