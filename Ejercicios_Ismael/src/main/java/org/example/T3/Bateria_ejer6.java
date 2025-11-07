package org.example.T3;

import java.util.Arrays;

public class Bateria_ejer6 {
    static void main() {
        int[] vector = {1, 2, 3, 2, 1};
        System.out.println("Array: " + Arrays.toString(vector));

        int numAux;
        int contador = 0;

        for (int i = 0; i < vector.length / 2; i++) {
            numAux = vector[i];
            vector[i] = vector[vector.length - 1 - i];
            vector[vector.length - 1 - i] = numAux;
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == vector[vector.length - i - 1]) {
                contador++;
            }
        }

        System.out.print("Es símetrico: ");

        if (contador == 5) {
            System.out.print("SI");
        } else {
            System.out.print("NO");
        }
    }
}