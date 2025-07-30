package com.pintojuan.LiterAlura.principal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pintojuan.LiterAlura.client.Client;
import com.pintojuan.LiterAlura.models.Book;
import com.pintojuan.LiterAlura.models.BookData;
import com.pintojuan.LiterAlura.service.ConversionData;

import java.util.Scanner;

public class Principal {
    private ConversionData conversionData = new ConversionData();
    private Scanner scanner = new Scanner(System.in);
    private Client client = new Client();
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
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    getBookByTitle();
                    break;
                case 2:
                    //getBooks();
                    break;
                case 3:
                    //getAuthors();
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
    }

    private void getBooks() {
    }

    private void getBookByTitle() {
        System.out.println("Ingrese el nombre de un libro a consultar: ");
        var nameBook = scanner.nextLine();
        var json = client.request(nameBook);
//        System.out.println(json + "Hola");
        //return conversionData.getData(json, BookData.class);
    }
}
