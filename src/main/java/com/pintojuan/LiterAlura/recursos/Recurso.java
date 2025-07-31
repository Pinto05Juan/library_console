package com.pintojuan.LiterAlura.recursos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recurso {
    public static Scanner scanner = new Scanner(System.in);

    public static int ingresarEntero(int min, int max) {
        int valor = 0;
        boolean error;

        do {
            error = false;
            try {
                valor = scanner.nextInt();
                scanner.nextLine();
                if(valor < min || valor > max) {
                    System.out.println("El valor debe estar entre " + min + " y " + max);
                    error = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ingresa un valor Valido");
                error = true;
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido " + e);
                error = true;
            }
        } while (error);
        return valor;
    }
}
