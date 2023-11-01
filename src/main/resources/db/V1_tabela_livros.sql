CREATE TABLE Livro (
  id INT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL,
  ISBN VARCHAR(13) NOT NULL,
  ano_publicacao INT NOT NULL,
  quantidade_copias INT NOT NULL,
  autor_ID INT NOT NULL,
  FOREIGN KEY (autor_ID) REFERENCES Autor(ID)
);