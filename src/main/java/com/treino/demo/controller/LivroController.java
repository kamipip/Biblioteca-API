package com.treino.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treino.demo.entities.Livro;
import java.util.List;  
import java.util.Arrays;

@RestController
@RequestMapping(value = "/livros")
public class LivroController<LivroService> {

  @Autowired
  private LivroService livroService;

  @GetMapping
  public ResponseEntity<Object> getAll() {
      return ResponseEntity.ok(((Livro) livroService).findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getById(@PathVariable Long id) {
      return ResponseEntity.ok(LivroService.findById(id));
  }

  @PostMapping
  public ResponseEntity<Object> create(@RequestBody Livro livro) {
      return ResponseEntity.status(HttpStatus.CREATED).body(LivroService.save(livro));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody Livro livro) {
      livro.setId(id);
      return ResponseEntity.ok(LivroService.save(livro));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
      LivroService.deleteById(id);
      return ResponseEntity.noContent().build();
  }

}