package com.treino.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treino.demo.entities.Autor;
import com.treino.demo.repository.AutorRepository;

@Service
public class AutorService {

   @Autowired
   private AutorRepository autorRepository;

   public List<Autor> findAll() {
       return autorRepository.findAll();
   }

   public Autor findById(Long id) {
       return autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado"));
   }

   public Autor save(Autor autor) {
       return autorRepository.save(autor);
   }

   public void deleteById(Long id) {
       autorRepository.deleteById(id);
   }

}
