package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ProgramaGeneraciones {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();

        final int anyoMinimo = 1900;
        int anyoActual = hoy.getYear();
        int anyoNacimiento = 0;


        System.out.println("MODOS DISPONIBLES");
        System.out.println("-----------------");
        System.out.println("[1] Año válido");
        System.out.println("[2] Año de nacimiento");
        System.out.print("Que modo quieres: ");

        int modo;

        if (!teclado.hasNextInt()) {
            System.err.println("ERROR. Introduce un modo válido.");
            return;
        }

        modo = teclado.nextInt();
        teclado.nextLine();

        if (modo == 1) {
            System.out.print("Introduzca tu año de nacimiento (XXXX): ");
            String anyoNacimientoStr = teclado.nextLine();

            anyoNacimiento = Integer.parseInt(anyoNacimientoStr);

            if (anyoNacimiento <= anyoMinimo && anyoNacimiento >= anyoActual) {
                System.err.println("Año NO válido");
            }
        } else if (modo == 2) {
            System.out.print("Introduce tu edad: ");
            int edad = teclado.nextInt();

            anyoNacimiento = anyoActual - edad;
            teclado.nextLine();
ye
            System.out.println("El usuario tiene " + edad + " años. Nació en el " + anyoNacimiento);
        } else {
            System.err.println("ERROR. El modo introducido no es válido.");
        }

        System.out.println("\nCalculando a qué generacion perteneces...");
        if (anyoNacimiento >= 1900 && anyoNacimiento <= 1927) {
            System.out.println("Eres de la generación sin bautizar.");
        } else if (anyoNacimiento >= 1928 && anyoNacimiento <= 1944) {
            System.out.println("Eres de la generación Silent.");
        } else if (anyoNacimiento >= 1945 && anyoNacimiento <= 1964) {
            System.out.println("Eres de la genración Baby Boomers");
        } else if (anyoNacimiento >= 1965 && anyoNacimiento <= 1981) {
            System.out.println("Eres de la generación X");
        } else if (anyoNacimiento >= 1982 && anyoNacimiento <= 1994) {
            System.out.println("Eres de la mejor generación, MILLENIAL!! :)");
        } else if (anyoNacimiento >= 1995 && anyoNacimiento <= anyoActual) {
            System.out.println("Eres de la generación Centenial");
        } else {
            System.out.println("No tienes generación.");
        }
    }
}