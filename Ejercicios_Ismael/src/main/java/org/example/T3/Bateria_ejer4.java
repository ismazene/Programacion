package org.example.T3;

import java.util.Arrays;
import java.util.Scanner;

//Crea un array de enteros y permite al usuario
//ingresar una posición. Luego, crea un nuevo array sin el elemento en esa posición.

public class Bateria_ejer4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Array original: " + Arrays.toString(numeros));

        System.out.print("Introduce la posición a eliminar (0 - " + (numeros.length - 1) + "): ");
        int pos = teclado.nextInt();

        // Crear un nuevo array con un elemento menos
        int[] nuevo = new int[numeros.length - 1];

        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i != pos) {
                nuevo[j] = numeros[i];
                j++;
            }
        }

        System.out.println("Array sin el elemento en la posición " + pos + ": " + Arrays.toString(nuevo));
    }
}


