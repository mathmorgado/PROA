CREATE DATABASE bd_ConsultorioMedico;
USE bd_ConsultorioMedico;
/* DROP DATABASE bd_ConsultorioMedico; */


/* CONFIGURANDO TABELA PACIENTE!*/
CREATE TABLE tb_Paciente(
	pk_id_Paciente INT NOT NULL AUTO_INCREMENT,
    Nome_Paciente VARCHAR(100) NOT NULL,
    Data_Nascimento_Paciente DATE,
    Genero_Paciente ENUM("masculino", "feminino", "nao-binario", "transsexual"), /*Campo que aceita valores pré-definidos*/
    CPF_Paciente VARCHAR(14),
    PRIMARY KEY (pk_id_Paciente)
);

INSERT INTO tb_Paciente(Nome_Paciente, Data_Nascimento_Paciente, Genero_Paciente, CPF_Paciente)
	VALUES 
		("Gabriel Ribeiro Morgado", "2016-10-10", "masculino", "156.143.567-6");

INSERT INTO tb_Paciente(Nome_Paciente, Data_Nascimento_Paciente, Genero_Paciente, CPF_Paciente) VALUES ("Matheus Ribeiro Morgado", "2005-08-18", "masculino", "256.123.478-9");

SELECT * FROM tb_Paciente;
DESCRIBE tb_Paciente; /*Exibe a estrutura da tabela*/

SELECT Nome_Paciente FROM tb_Paciente;

ALTER TABLE tb_Paciente
	ADD COLUMN Convenio_Paciente VARCHAR(50);

UPDATE tb_Paciente 
SET Convenio_Paciente = "UNIMED" 
WHERE Nome_Paciente = "Gabriel Ribeiro Morgado";

DROP TABLE tb_Paciente;


/* CONFIGURANDO TABELA MEDICO!*/
CREATE TABLE tb_Medico(
	pk_id_Medico INT NOT NULL AUTO_INCREMENT UNIQUE,
    Nome_Medico VARCHAR(100) NOT NULL,
    Data_Nascimento_Medico DATE,
    Genero_Medico ENUM("masculino", "feminino", "nao-binario", "transsexual"), /*Campo que aceita valores pré-definidos*/
    CPF_Medico VARCHAR(14) NOT NULL,
    Especialidade_Medico VARCHAR(30) NOT NULL,
    CRM_Medico VARCHAR(13) NOT NULL,
    Turno_Medico ENUM("matutino", "vespertino", "Noturno") NOT NULL,
    PRIMARY KEY (pk_id_Medico)
);

SELECT * FROM tb_Medico;

INSERT INTO tb_Medico(Nome_Medico, Data_Nascimento_Medico, Genero_Medico, CPF_Medico, Especialidade_Medico, CRM_Medico, Turno_Medico) VALUES (
	"Matthew",
    "2024-10-12",
    "masculino",
    "11111111111",
    "Ortopedia",
    "CRM/sp23131",
    "matutino"
	);

DROP TABLE tb_Medico;

/* CONFIGURANDO TABELA CONSULTA!*/
CREATE TABLE tb_Consulta(
	pk_id_Consulta INT NOT NULL AUTO_INCREMENT UNIQUE,
    Data_Consulta DATETIME NOT NULL,
    fk_id_Medico INT NOT NULL,
    fk_id_Paciente INT NOT NULL,
    PRIMARY KEY (pk_id_Consulta),
    CONSTRAINT fk_id_Medico FOREIGN KEY (fk_id_Medico) REFERENCES tb_Medico (pk_id_Medico),
    CONSTRAINT fk_id_Paciente FOREIGN KEY (fk_id_Paciente) REFERENCES tb_Paciente (pk_id_Paciente)
);

DESCRIBE tb_Consulta;

/*INSERINDO DADOS DE FORMA DIRETA!*/
INSERT INTO tb_Consulta (Data_Consulta, fk_id_Medico, fk_id_Paciente)
VALUES 
	/*É necessário passar todos os valores, inclusive os FK para podermos dizer Qual médico atendeu Qual paciente*/
	('2024-06-01 10:00:00', 1, 1), /*Médico com id = 1 atendeu o paciente com id = 1*/
    ('2024-06-01 10:00:00', 1, 2) /*Médico com id = 1 atendeu o paciente com id = 2*/
;

/*INSERINDO MULTIPLAS LINHAS DE DADOS DE FORMA DINAMICA USANDO 'JOIN'*/
INSERT INTO tb_Consulta (Data_Consulta, fk_id_Medico, fk_id_Paciente)
	/*O SELECT ESTÁ SELECIONANDO TODOS OS VALORES QUE DESEJAMOS INSERIR. EX: VALUES (...) == SELECT (...) */
	(SELECT '2024-06-01 10:00:00', medico.pk_id_Medico, paciente.pk_id_Paciente
		
        /*Aqui estamos selecionando as tabelas que vamos SELECIONAR os dados, no caso vamos mexer em duas tabelas, 
        então usamos FROM pra chamar a primeira e JOIN para chamar a outra tabela */
        FROM tb_Medico AS medico /*SELECIONA A TABELA MÉDICO E NOMEIA ELA APENAS COMO 'medico' */
		JOIN tb_Paciente AS paciente /*SELECIONA MAIS UMA TABELA, NO CASO 'PACIENTE', E NOMEIA ELA COMO 'paciente' */
        
        /*Aqui faz uma validação para selecionar apenas os dados onde o nome do médico é tal e o nome do paciente é tal*/
		WHERE medico.Nome_Medico = 'Matthew' AND paciente.Nome_Paciente = 'Gabriel Ribeiro Morgado')
        
UNION ALL /* QUANDO FOR INSERIR DADOS DE FORMA DINÂMICA, NÃO USAMOS ',' MAS SIM 'UNION ALL' PARA UNIOR OS DOIS 'SELECTS' */

	(SELECT '2024-06-01 10:00:00', medico.pk_id_Medico, paciente.pk_id_Paciente
		FROM tb_Medico AS medico
		JOIN tb_Paciente AS paciente
		WHERE medico.Nome_Medico = 'Matthew' AND paciente.Nome_Paciente = 'Matheus Ribeiro Morgado')
;


SELECT * FROM tb_Consulta;

DROP TABLE tb_Consulta;