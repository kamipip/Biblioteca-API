package com.treino.demo.entities;

public class Usuario {
    
    private Long id;
    private String nome;
    private String data;    
    private String emprestimos;

    public String getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(String emprestimos) {
        this.emprestimos = emprestimos;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
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
