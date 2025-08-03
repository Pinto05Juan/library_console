package com.pintojuan.LiterAlura.repository;

import com.pintojuan.LiterAlura.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(value = "SELECT a FROM Author a WHERE a.deathYear > :year")
    List<Author> getAuthorByYear(int year);
}
