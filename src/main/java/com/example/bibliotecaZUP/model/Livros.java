package com.example.bibliotecaZUP.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TBL_LIVROS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60, nullable = false)
    private String nome;
    @Column(length = 60, nullable = false)
    private String autor;
    @Column(length = 10, nullable = false)
    private String dataLancamento;
    @Column(length = 50, nullable = false)
    private String codigoLivro;
}
