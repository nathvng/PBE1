CREATE DATABASE IF NOT EXISTS db_faculdadesesi;

USE db_faculdadesesi;

CREATE TABLE Cursos (
    id_curso BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    carga_horaria DOUBLE,
    nivel_dificuldade VARCHAR(50)
);


CREATE TABLE Disciplinas (
    id_disciplina BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    carga_horaria DOUBLE
);

INSERT INTO Cursos (titulo, descricao, carga_horaria, nivel_dificuldade)
VALUES
('Engenharia de Software', 'Curso focado em desenvolvimento de sistemas e software.', 3200, 'Avançado'),
('Sistemas de Informação', 'Curso focado em gestão de tecnologia da informação.', 3000, 'Intermediário');

INSERT INTO Disciplinas (nome, descricao, carga_horaria)
VALUES
('Algoritmos', 'Disciplina que ensina as principais técnicas de algoritmos.', 80),
('Banco de Dados', 'Disciplina que aborda o uso e criação de bancos de dados.', 60);