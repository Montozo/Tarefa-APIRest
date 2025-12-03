SHOW WARNINGS;

USE empresa;

CREATE TABLE funcionarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cargo VARCHAR(100)
);

CREATE TABLE salarios(
	id_salario INT AUTO_INCREMENT PRIMARY KEY, 
    funcionario_id INT,
    FOREIGN KEY(funcionario_id) REFERENCES funcionarios(id)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
    salario DECIMAL(10,2),
    data_pagamento DATE
);

DELETE FROM funcionarios
WHERE id = 4;
 
UPDATE funcionarios 
SET id = 4 
WHERE id = 8; 
SELECT * FROM funcionarios;

INSERT INTO funcionarios(
	nome,
    cargo
    
) values (
	'pao',
    'cozinheiro'
);

INSERT INTO salarios(
	funcionario_id,
    salario,
    data_pagamento
) values (
	4,
    2000.00,
    '2004/12/11'
);

SELECT AVG(salario) FROM salarios;

SELECT * FROM funcionarios
LEFT JOIN salarios 
ON funcionarios.id = salarios.funcionario_id
;