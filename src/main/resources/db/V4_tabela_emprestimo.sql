CREATE TABLE Emprestimo (
  ID INT PRIMARY KEY,
  data_emprestimo DATE NOT NULL,
  data_devolucao DATE NOT NULL,
  livro_ID INT NOT NULL,
  usuario_ID INT NOT NULL,
  FOREIGN KEY (livro_emprestado) REFERENCES Livro(ID),
  FOREIGN KEY (usuario_emprestimo) REFERENCES Usuario(ID) );