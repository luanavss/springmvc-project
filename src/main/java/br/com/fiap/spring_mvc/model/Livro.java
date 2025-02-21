package br.com.fiap.spring_mvc.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

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
    @Column(name = "Price")
    private BigDecimal preco;
    @Column(name = "isbn")
    private String isbn;
}
