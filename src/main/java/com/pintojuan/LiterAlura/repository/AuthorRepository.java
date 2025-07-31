package com.pintojuan.LiterAlura.repository;

import com.pintojuan.LiterAlura.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
