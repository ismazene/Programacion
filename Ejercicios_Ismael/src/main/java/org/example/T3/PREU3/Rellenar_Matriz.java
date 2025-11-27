package org.example.T3.PREU3;

import java.util.Random;
import java.util.Scanner;

public class Rellenar_Matriz {

    static void main() {
        // Tamaño de la matriz (3x3 por ejemplo)
        int filas = 3;
        int columnas = 3;

        // 1. RELLENAR MATRIZ CON BUCLES FOR
        int[][] matriz2 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = (i + 1) * (j + 1);
            }
        }

        // 2. RELLENAR MATRIZ CON RANDOM
        int[][] matriz4 = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz4[i][j] = random.nextInt(100)+1; // valores 0-99
            }
        }

        // 3. RELLENAR MATRIZ PIDIENDO DATOS AL USUARIO
        int[][] matriz5 = new int[filas][columnas];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce valor para matriz5[" + i + "][" + j + "]: ");
                matriz5[i][j] = teclado.nextInt();
            }
        }

        // MOSTRAR TODAS LAS MATRICES
        System.out.println("--- RESULTADOS ---");

        // Mostrar matriz2
        System.out.println("Matriz con bucles for (matriz2):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + "");
            }
            System.out.println();
        }

        // Mostrar matriz4
        System.out.println("Matriz con valores aleatorios (matriz4):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz4[i][j] + "");
            }
            System.out.println();
        }

        // Mostrar matriz5
        System.out.println("Matriz ingresada por el usuario (matriz5):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz5[i][j] + "");
            }
            System.out.println();
        }
    }
}

