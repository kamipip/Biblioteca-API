package com.treino.demo.repository;

import java.util.List;

import com.treino.demo.entities.Autor;

public interface AutorRepository {

    List<Autor> findAll();

    Object findById(Long id);

    com.treino.demo.entities.Autor save(com.treino.demo.entities.Autor autor);

    void deleteById(Long id);

}
