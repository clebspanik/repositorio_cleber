USE mydb;


SELECT id, pergunta
FROM pergunta
WHERE pergunta LIKE 'O que%';


SELECT * FROM aluno;

SELECT celular, email FROM aluno;


SELECT id,
pergunta
FROM pergunta
WHERE pergunta REGEXP '^ O que' 
ORDER BY pergunta DESC;

SELECT nome, celular FROM aluno
WHERE nome LIKE ('%son');

SELECT nome, celular FROM aluno
WHERE nome LIKE ('%tia');

SELECT id, nome, celular
from aluno
WHERE nome REGEXP '[tia^-sonç^]'
ORDER BY nome asc;

SELECT nome, celular FROM aluno
WHERE nome REGEXP COUNT ('%ma');