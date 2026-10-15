package com.loreto.library_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "livro")
@Setter
@Getter
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "titulo")
    private String title;

    @Column(name = "data_publicacao")
    private LocalDate publicationDate;

    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "preco", precision = 18, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Author author;

}
