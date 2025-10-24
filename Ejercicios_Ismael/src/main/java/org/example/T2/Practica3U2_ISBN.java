package org.example.T2;

import java.util.Scanner;

public class Practica3U2_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("****VALIDAR ISBN****");

        System.out.println("---------------------");

        System.out.println("[1] - Validar ISBN");
        System.out.println("[2] - Reparar ISBN");
        System.out.println("[X] - SALIR");

        System.out.println("---------------------");

        System.out.print("Elige una opcion: ");
        String opcion = teclado.nextLine();


        switch (opcion) {
            case "1":
                System.out.println("Introduce el ISBN a validar");
                try {
                    String ISBN = teclado.nextLine();
                } catch (Exception e) {
                    System.err.println("ERROR:Introduce un formao correcto");
                }

                

                break;

            case "2":
                System.out.println("Introduce el ISBN a reparar");
                String ISBN_reparar = teclado.nextLine();

                break;

            case "x":
            case "X":

                break;

            default:
                System.err.println("Solo puedes poner opciones validas :/");
        }
    }
}