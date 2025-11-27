package org.example.T3.BATERIA_ARRAY;

import java.util.Arrays;

//Ejercicio 2. Invierte un array
//Crea un array de números enteros (los que quieras) y luego invierte sus elementos. Imprime el array invertido.

public class Bateria_ejer2 {
    static void main() {
        int vector[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Array original: " + Arrays.toString(vector));

        int aux = 0;

        for (int i = 0; i < vector.length/2; i++) {
            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }
        System.out.println(Arrays.toString(vector));

    }
}
