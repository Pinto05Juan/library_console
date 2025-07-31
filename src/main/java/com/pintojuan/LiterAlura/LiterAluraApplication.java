package com.pintojuan.LiterAlura;

import com.pintojuan.LiterAlura.principal.Principal;
import com.pintojuan.LiterAlura.repository.AuthorRepository;
import com.pintojuan.LiterAlura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	@Autowired
	private BookRepository repositoryBook;
	@Autowired
	private AuthorRepository repositoryAuthor;
	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Principal principal = new Principal(repositoryBook, repositoryAuthor);
		principal.showMenu();
	}
}
