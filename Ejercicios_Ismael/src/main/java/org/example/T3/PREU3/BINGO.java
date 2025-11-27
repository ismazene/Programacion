package org.example.T3.PREU3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BINGO {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL BINGO CANTABRIA***");

        // Generar bolas del sorteo
        int numero_bolas = aleatorio.nextInt(30) + 10; // entre 10 y 39 bolas
        int[] vector = new int[numero_bolas];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(89) + 1; // números del 1 al 90
        }

        // Eliminar duplicados
        Arrays.sort(vector);
        boolean comprobar = true;
        while (comprobar) {
            comprobar = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] == vector[i + 1]) {
                    vector[i] = aleatorio.nextInt(89) + 1;
                    Arrays.sort(vector);
                    comprobar = true;
                }
            }
        }

        System.out.println(numero_bolas + " bolas extraídas hasta ahora: " + Arrays.toString(vector));
        System.out.println("");

        System.out.println("Introduce los datos de tu cartón (formato 1-2-3 para cada fila):");

        // Matriz 3x3 para el cartón
        int[][] carton = new int[3][3];

        // Pedir las 3 filas
        for (int i = 0; i < 3; i++) {
            String linea;
            do {
                System.out.println("Fila " + (i + 1) + ": ");
                linea = teclado.nextLine();

                if (!linea.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                    System.err.println("Formato incorrecto. Inténtalo de nuevo.");
                }

            } while (!linea.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}"));

            String[] partes = linea.split("-");
            for (int j = 0; j < 3; j++) {
                carton[i][j] = Integer.parseInt(partes[j]);
            }
        }

        // Mostrar cartón
        System.out.println("Cartón introducido:");
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(carton[i]));
        }

        // Comprobar premios usando contains
        boolean bingo = true;

        // Convertimos el vector de bolas a Integer[] para poder usar Arrays.asList
        Integer[] bolasExtraidas = new Integer[vector.length];
        for (int i = 0; i < vector.length; i++) {
            bolasExtraidas[i] = vector[i];
        }

        for (int i = 0; i < 3; i++) {          // filas
            for (int j = 0; j < 3; j++) {      // columnas
                if (!java.util.Arrays.asList(bolasExtraidas).contains(carton[i][j])) {
                    bingo = false;
                }
            }
        }

        // Mostrar resultado final
        if (bingo) {
            System.out.println("¡BINGO! Todos los números están entre las bolas extraídas");
        } else {
            System.out.println("NO HAY BINGO. Algunos números no salieron");
        }


    }
}
