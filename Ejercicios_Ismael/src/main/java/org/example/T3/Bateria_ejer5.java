package org.example.T3;

import java.util.Arrays;

public class Bateria_ejer5 {
    static void main() {

        int[] vector = {1, 2, 3, 4, 5};
        int numAux = vector[0];

        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }

        vector[vector.length - 1] = numAux;

        System.out.println(Arrays.toString(vector));
    }

}

