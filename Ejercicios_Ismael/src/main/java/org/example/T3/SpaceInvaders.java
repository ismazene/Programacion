package org.example.T3;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceInvaders {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce filas");
        int filas = teclado.nextInt();

        String matriz[][] = new String[filas][3];

        for (int i = 0; i < filas; i++) {
            String linea = teclado.next();

            if (linea.length() == 3) {
                matriz[i] = linea.split("");
            } else {
                System.out.println("La entrada NO tiene 3 elementos. Repite:");
                i--;
            }
        }

        // Mostrar matriz
        for (String[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        for (int col = 0; col < 3; col++) {
            for (int fila = 0; fila < filas; fila++) {
                System.out.println(matriz[fila][col]);
            }
        }
    }
}
