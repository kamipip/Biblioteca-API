package com.treino.demo.entities;

public class Autor {
    
    private Long id;
    private String nome;
    private String livros;

    
    public String getLivros() {
        return livros;
    }
    public void setLivros(String livros) {
        this.livros = livros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    

}
