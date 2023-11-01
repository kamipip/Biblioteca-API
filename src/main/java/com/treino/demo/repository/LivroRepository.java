package com.treino.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.treino.demo.entities.Livro;

@Repository
public interface LivroRepository extends AutorRepository<Autor, Long> {

    List<Livro> findAll();

    Object findById(Long id);

    Livro save(Livro livro);

    void deleteById(Long id);
}