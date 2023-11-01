package com.treino.demo.entities;

public class Emprestimo {
    
    private Long id;
    private String dataemprestimo;
    private String datadevolucao;
    private String livro;
    private String usuario;

    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getDatadevolucao() {
        return datadevolucao;
    }
    public void setDatadevolucao(String datadevolucao) {
        this.datadevolucao = datadevolucao;
    }
    public String getDataemprestimo() {
        return dataemprestimo;
    }
    public void setDataemprestimo(String dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    

}
