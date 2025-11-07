package org.example.T3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bateria_ejer8 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[] vector = {1, 2, 3, 5};
        int[] newVector = new int[vector.length + 1];

        System.out.print("Introduce el número a añadir: ");
        int num = teclado.nextInt();

        System.out.print("Introduce la posición: ");
        int pos = teclado.nextInt();

        for (int i = 0; i < newVector.length; i++) {
            if (i < pos) {
                newVector[i] = vector[i];
            } else if (i == pos) {
                newVector[i] = num;
            } else {
                newVector[i] = vector[i - 1];
            }
        }

        System.out.println(Arrays.toString(newVector));
    }
}
