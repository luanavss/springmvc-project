package br.com.fiap.spring_mvc.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_LIVRO")
@Data
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Title")
    private String titulo;
    @Column(name = "Author")
    private String autor;
    @Column(name = "Category")
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
}
