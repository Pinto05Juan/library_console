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
    @ManyToMany
    private List<Author> authors;

    public Book() {}

    public Book(BookData bookData) {
        this.title = bookData.title();
        this.language = bookData.language();
        this.countDownloads = bookData.countDownloads();
        this.authors = bookData.authors();
    }

    @Override
    public String toString() {
        return
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", countDownloads=" + countDownloads +
                ", authors=" + authors;
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
