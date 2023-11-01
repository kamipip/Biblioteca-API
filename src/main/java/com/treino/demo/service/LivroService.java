package com.treino.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treino.demo.entities.Livro;
import com.treino.demo.repository.LivroRepository;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

     public Livro findById(Long id) {
        return ((Object) livroRepository.findById(id)).orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado"));
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }

}
