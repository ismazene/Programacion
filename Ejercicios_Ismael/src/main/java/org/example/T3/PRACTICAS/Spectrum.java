package org.example.T3.PRACTICAS;

import java.util.Scanner;

public class Spectrum {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int ancho = 0;
        int alto = 0;

        System.out.println("*****VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM*****");
        System.out.println("Introduce la resolucion de tu pantalla (ancho x alto): ");

        do {
            System.out.println("Ancho:");
            ancho = teclado.nextInt();
            if (ancho > 48 || ancho % 8 != 0) {
                System.err.println("Debe ser multiplo de 8 y menor o igual a 48");
            }
        } while (ancho > 48 || ancho % 8 != 0);

        do {
            System.out.println("Alto:");
            alto = teclado.nextInt();
            if (alto > 48 || alto % 8 != 0) {
                System.err.println("Debe ser multiplo de 8 y menor o igual a 48");
            }
        } while (alto > 48 || alto % 8 != 0);
        teclado.nextLine();

        String matriz[][] = new String[alto][ancho];

        System.out.println("Introduce (linea por linea) los colores de tu imagen para cada pixel: ");

        for (int i = 0; i < alto; i++) {

            String linea = teclado.nextLine();

            if (!linea.matches("[a-oA-O]+")) {
                System.err.println("Error: Solo puedes letras de la A-O");
            }

            //validar tamanyo
            while (linea.length() != ancho) {
                System.err.println("La linea debe tener exactamente " + ancho + " caracteres.");
                linea = teclado.nextLine();
            }

            // guardar matriz
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = String.valueOf(linea.charAt(j));
            }
        }

        // Mostrar matriz
        System.out.println("Matriz guardada:");
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        String letras = "";

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (!letras.contains(matriz[i][j])) {
                    letras += matriz[i][j];
                }
            }
        }

        System.out.println("");
        System.out.println("Numero de letras diferentes: " + letras.length());


    }
}

