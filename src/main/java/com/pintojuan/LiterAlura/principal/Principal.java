package com.pintojuan.LiterAlura.principal;

import com.pintojuan.LiterAlura.client.Client;
import com.pintojuan.LiterAlura.models.Author;
import com.pintojuan.LiterAlura.models.Book;
import com.pintojuan.LiterAlura.models.BookData;
import com.pintojuan.LiterAlura.models.BookResponse;
import com.pintojuan.LiterAlura.recursos.Recurso;
import com.pintojuan.LiterAlura.repository.AuthorRepository;
import com.pintojuan.LiterAlura.repository.BookRepository;
import com.pintojuan.LiterAlura.service.ConversionData;

import java.util.List;
import java.util.Scanner;

public class Principal {
    private ConversionData conversionData = new ConversionData();
    private Scanner scanner = new Scanner(System.in);
    private Client client = new Client();
    private BookRepository repositoryBook;
    private AuthorRepository repositoryAuthor;

    public Principal(BookRepository repositoryBook, AuthorRepository repositoryAuthor) {
        this.repositoryBook = repositoryBook;
        this.repositoryAuthor = repositoryAuthor;
    }
    public void showMenu() {
        System.out.println("Bienvenido al LiterAlura");
        var opcion = -1;
        while(opcion != 0) {
            System.out.println("""
                1 - Buscar libro por titulo
                2 - Mostrar libros registrados
                3 - Mostrar autores registrados
                4 - Mostrar autores vivos en un determinado año
                5 - Mostrar libros por idioma
                0 - Salir
                """);
            System.out.println("Ingrese una opcion: ");
            opcion = Recurso.ingresarEntero(0,6);
            switch (opcion) {
                case 1:
                    getBookByTitle();
                    break;
                case 2:
                    getBooks();
                    break;
                case 3:
                    getAuthors();
                    break;
                case 4:
                    //getAuthorsByYear();
                    break;
                case 5:
                    //7getBookByLanguage();
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    private void getBookByLanguage() {
    }

    private void getAuthorsByYear() {
    }

    private void getAuthors() {
        List<Author> authors = repositoryAuthor.findAll();
        authors.forEach(System.out::println);
    }

    private void getBooks() {
        List<Book> books = repositoryBook.findAll();
        books.forEach(System.out::println);
    }

    private void getBookByTitle() {
        System.out.println("Ingrese el nombre de un libro a consultar: ");
        String nameBook = scanner.nextLine();
        String json = client.request(nameBook);
//        System.out.println(json);
        BookResponse bookResponse = conversionData.getData(json, BookResponse.class);
        if (!bookResponse.results().isEmpty()) {
            BookData bookData = bookResponse.results().getFirst();
            Book bookBuscado = new Book(bookData);
            //si este libro ya esta registrado, no es necesario guardarlo de nuevo
            repositoryBook.save(bookBuscado);
            System.out.println("Libro regitrado");
        } else {
            System.out.println("Libro no encontrado");
        }
    }
}
