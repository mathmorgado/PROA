CREATE DATABASE DB_CDS;
USE DB_CDS;
DROP DATABASE db_cds;

CREATE TABLE tb_Artista(
	Cod_Art INT NOT NULL AUTO_INCREMENT,
    Nome_Art VARCHAR(100) NOT NULL UNIQUE,
    PRIMARY KEY(Cod_Art)
    );

DESCRIBE tb_Artista;

CREATE TABLE tb_Gravadora(
	Cod_Grav INT NOT NULL AUTO_INCREMENT,
    Nome_Grav VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY(Cod_Grav)
    );
    
DESCRIBE tb_Gravadora;

CREATE TABLE tb_Categoria(
	Cod_Cat INT NOT NULL AUTO_INCREMENT,
    Nome_Cat VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY(Cod_Cat)
    );
    
DESCRIBE tb_Categoria;

CREATE TABLE tb_Estado(
	Sigla_Est VARCHAR(2) NOT NULL,
    Nome_Est VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY(Sigla_Est)
    );
    
DESCRIBE tb_Estado;

CREATE TABLE tb_Cidade(
	Cod_Cid INT NOT NULL AUTO_INCREMENT,
    Sigla_Est CHAR(2) NOT NULL,
    Nome_Cid VARCHAR(100) NOT NULL,
    PRIMARY KEY(Cod_Cid),
    CONSTRAINT FK_Cidade_Estado FOREIGN KEY (Sigla_Est) REFERENCES tb_Estado(Sigla_Est)
    );

DESCRIBE tb_Cidade;

CREATE TABLE tb_Cliente(
	Cod_Cli INT NOT NULL AUTO_INCREMENT,
    Cod_Cid INT NOT NULL,
    Nome_Cli VARCHAR(100) NOT NULL,
    End_Cli VARCHAR(200) NOT NULL,
    Renda_Cli DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    Sexo_Cli ENUM("f", "m") NOT NULL,
    PRIMARY KEY(Cod_Cli),
    CONSTRAINT FK_Cidade_Cliente FOREIGN KEY (Cod_Cid) REFERENCES tb_Cidade(Cod_Cid),
    CONSTRAINT CK_Renda_Cliente_Maior_Igual_Zero CHECK (Renda_Cli >= 0)
    );
    
DESCRIBE tb_Cliente;

CREATE TABLE tb_Conjuge(
	Cod_Cli INT NOT NULL,
    Nome_Conj VARCHAR(100) NOT NULL,
    Renda_Conj DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    Sexo_Conj ENUM("f", "m") NOT NULL,
    PRIMARY KEY(Cod_Cli),
    CONSTRAINT FK_Cliente_Conjuge FOREIGN KEY (Cod_Cli) REFERENCES tb_Cliente(Cod_Cli),
    CONSTRAINT CK_Renda_Conjuge_Maior_Igual_Zero CHECK (Renda_Conj >= 0)
    );
    
DESCRIBE tb_Conjuge;

CREATE TABLE tb_Funcionario(
	Cod_Func INT NOT NULL AUTO_INCREMENT,
    Nome_Func VARCHAR(100) NOT NULL,
    End_Func VARCHAR(100) NOT NULL,
    Sal_Func DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    Sexo_Func ENUM('f', 'm') NOT NULL,
    PRIMARY KEY(Cod_Func),
    CONSTRAINT CK_Salario_Maior_Igual_Zero CHECK (Sal_Func >= 0)
    );
    
DESCRIBE tb_Funcionario;

CREATE TABLE tb_Dependente(
	Cod_Dep INT NOT NULL AUTO_INCREMENT,
    Cod_Func INT NOT NULL,
    Nome_Dep VARCHAR(100) NOT NULL,
    Sexo_Dep ENUM("f", "m") NOT NULL,
    PRIMARY KEY(Cod_Dep),
    CONSTRAINT FK_Funcionario_Dependente FOREIGN KEY (Cod_Func) REFERENCES tb_Funcionario(Cod_Func)
    );
    
DESCRIBE tb_Dependente;

CREATE TABLE tb_Titulo(
	Cod_Tit INT NOT NULL AUTO_INCREMENT,
    Cod_Cat INT NOT NULL,
    Cod_Grav INT NOT NULL,
    Nome_CD VARCHAR(100) NOT NULL UNIQUE,
    Val_CD DECIMAL(10,2) NOT NULL,
    Qtd_Estq INT NOT NULL,
    PRIMARY KEY(Cod_Tit),
    CONSTRAINT FK_Titulo_Categoria FOREIGN KEY (Cod_Cat) REFERENCES tb_Categoria(Cod_Cat),
    CONSTRAINT FK_Titulo_Gravadora FOREIGN KEY (Cod_Grav) REFERENCES tb_Gravadora(Cod_Grav),
    CONSTRAINT CK_ValorCD_Maior_Zero CHECK (Val_CD > 0)
    );
    
DESCRIBE tb_Titulo;

CREATE TABLE tb_Pedido(
	Num_Ped INT NOT NULL AUTO_INCREMENT,
    Cod_CLi INT NOT NULL,
    Cod_Func INT NOT NULL,
    Data_Ped DATETIME NOT NULL,
    Val_Ped DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    PRIMARY KEY(Num_Ped),
    CONSTRAINT FK_Pedido_Cliente FOREIGN KEY (Cod_Cli) REFERENCES tb_Cliente(Cod_Cli),
    CONSTRAINT FK_Pedido_Funcionario FOREIGN KEY (Cod_Func) REFERENCES tb_Funcionario(Cod_Func),
    CONSTRAINT CK_ValorPedido_Maior_Igual_Zero CHECK (Val_Ped >= 0)
    );
    
DESCRIBE tb_Pedido;

CREATE TABLE tb_Titulo_Pedido(
	Num_Ped INT NOT NULL,
    Cod_Tit INT NOT NULL,
    Qtd_CD INT NOT NULL,
    Val_CD DECIMAL(10,2) NOT NULL,
    PRIMARY KEY(Num_Ped, Cod_Tit),
    CONSTRAINT FK_TituloPedido_NumPed FOREIGN KEY (Num_Ped) REFERENCES tb_Pedido(Num_Ped),
    CONSTRAINT FK_TituloPedido_Cod_Tit FOREIGN KEY (Cod_Tit) REFERENCES tb_Titulo(Cod_Tit),
    CONSTRAINT CK_QuantidadeCd_Maior_Igual_1 CHECK (Qtd_CD >= 1),
    CONSTRAINT CK_TituloPedido_ValorCD_Maior_Zero CHECK (Val_CD > 0)
    );
    
DESCRIBE tb_Titulo_Pedido;

CREATE TABLE tb_Titulo_Artista(
	Cod_Tit INT NOT NULL,
    Cod_Art INT NOT NULL,
    CONSTRAINT FK_TituloArtista_Titulo FOREIGN KEY (Cod_Tit) REFERENCES tb_Titulo(Cod_Tit),
    CONSTRAINT FK_TituloArtista_Artista FOREIGN KEY (Cod_Art) REFERENCES tb_Artista(Cod_Art)
    );
    
DESCRIBE tb_Titulo_Artista;