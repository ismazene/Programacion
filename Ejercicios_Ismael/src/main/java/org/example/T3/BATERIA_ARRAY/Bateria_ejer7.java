package org.example.T3.BATERIA_ARRAY;

import java.util.Arrays;

//Ejercicio 7. Combina dos arrays en uno
//Crea dos arrays de enteros y combina sus elementos en un solo array más grande. Luego, muestra el nuevo array.

public class Bateria_ejer7 {
    static void main() {
        int[] vector1 = {1, 2, 3};
        int[] vector2 = {4, 5, 6};

        int largo = vector1.length + vector2.length;
        int largoV1 = vector1.length;

        int[] vector3 = new int[largo];

        for (int i = 0; i < largo; i++) {
            if (i < largoV1) {
                vector3[i] = vector1[i];
            } else {
                vector3[i] = vector2[i - largoV1];
            }
        }

        System.out.println("Array 1: " + Arrays.toString(vector1));
        System.out.println("Array 2: " + Arrays.toString(vector2));
        System.out.println("Array combinado: " + Arrays.toString(vector3));
    }
}
