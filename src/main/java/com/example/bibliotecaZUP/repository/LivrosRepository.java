package com.example.bibliotecaZUP.repository;

import com.example.bibliotecaZUP.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
}
