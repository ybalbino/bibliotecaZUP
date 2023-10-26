package com.example.bibliotecaZUP.controller;

import com.example.bibliotecaZUP.model.Livros;
import com.example.bibliotecaZUP.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivrosController {
    @Autowired
    LivroService livroService;

    @GetMapping(path = "/cadastro")
    public List<Livros> buscarTodosLivros(){
        return livroService.buscarTodos();
    }

    @GetMapping(path = "/cadastro/{id}")
    public Optional<Livros> buscarLivrosPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }

    @PostMapping(path = "/cadastro")
    @ResponseStatus(HttpStatus.CREATED)
    public Livros cadastrarNovoLivro(@RequestBody Livros livros){
        return livroService.cadastrar(livros);
    }

    @PutMapping(path = "/cadastro/{id}")
    public Livros alterarLivro (@PathVariable Long id, @RequestBody Livros livros){
        return livroService.alterar(id, livros);
    }

    @DeleteMapping(path = "/cadastro/{id}")
    public void deletarLivro(@PathVariable Long id){
        livroService.deletar(id);
    }
}
