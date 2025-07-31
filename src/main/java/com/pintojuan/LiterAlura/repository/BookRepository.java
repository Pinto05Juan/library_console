package com.pintojuan.LiterAlura.repository;

import com.pintojuan.LiterAlura.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
