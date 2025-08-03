package com.pintojuan.LiterAlura.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String language;
    private double countDownloads;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //Creamos una tabla intermedia para conectar las relaciones
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

    public Book() {}

    public Book(BookData bookData) {
        this.title = bookData.title();
        this.language = String.join(",", bookData.language());
        this.countDownloads = bookData.countDownloads();
        this.authors = bookData.authors().stream()
                .map(Author::new)
                .toList();
    }

    @Override
    public String toString() {
        return
                "Titulo: " + title + '\n' +
                "Idioma: " + language+ '\n' +
                "Numero de descargar: " + countDownloads + "\n" +
                "Autores: " + authors.getFirst().getName() + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getCountDownloads() {
        return countDownloads;
    }

    public void setCountDownloads(double countDownloads) {
        this.countDownloads = countDownloads;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
