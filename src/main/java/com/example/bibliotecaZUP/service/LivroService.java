package com.example.bibliotecaZUP.service;

import com.example.bibliotecaZUP.model.Livros;
import com.example.bibliotecaZUP.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    LivrosRepository livrosRepository;

    public List<Livros> buscarTodos(){
        return livrosRepository.findAll();
    }

    //buscar pelo id
    public Optional<Livros> buscarPorId(Long id){
        return livrosRepository.findById(id);
    }

    //cadastrar Livro
    public Livros cadastrar(Livros livros){
        return livrosRepository.save(livros);
    }

    //alterar Livro
    public Livros alterar(Long id, Livros livros){
        Livros cadastro = buscarPorId(id).get();
        if (livros.getNome() != null){
            cadastro.setNome(livros.getNome());
        }
        if (livros.getAutor() != null){
            cadastro.setAutor(livros.getAutor());
        }
        if (livros.getDataLancamento() != null){
            cadastro.setDataLancamento(livros.getDataLancamento());
        }
        if (livros.getCodigoLivro() != null){
            cadastro.setCodigoLivro(livros.getCodigoLivro());
        }
        return livrosRepository.save(cadastro);
    }

    //deletar
    public void deletar(Long id){
        livrosRepository.deleteById(id);
    }
}
