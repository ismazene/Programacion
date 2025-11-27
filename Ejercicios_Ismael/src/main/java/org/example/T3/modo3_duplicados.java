package org.example.T3;

import java.util.Arrays;
import java.util.Random;

public class modo3_duplicados {
    static void main() {

        Random aleatorio = new Random();
        int numeros[] = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        boolean comprobar = true;

        while (comprobar) {
            comprobar = false; // asumimos que no hay duplicados
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] == numeros[i + 1]) {
                    System.out.println("Duplicado: " + numeros[i]);
                    numeros[i] = aleatorio.nextInt(50) + 1;
                    Arrays.sort(numeros);
                    comprobar = true; // marcar que se encontró un duplicado
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
