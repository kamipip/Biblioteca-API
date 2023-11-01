package com.treino.demo.entities;

import java.util.List;

public class Livro {
    
    private Long id;
    private String titulo;
    private String isbn;
    private String ano;
    private String copias;
    private String autor;
    
    public Livro(long l, String string, String string2, String string3, String string4) {
    }
    public Livro(long l, String string) {
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getCopias() {
        return copias;
    }
    public void setCopias(String copias) {
        this.copias = copias;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Livro> findAll() {
        return null;
    }
    public Livro findById(Long id2) {
        return null;
    }
    
    
    
    
    
}

