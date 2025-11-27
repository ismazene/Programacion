package org.example.T3.BATERIA_ARRAY;

import java.util.Random;

//Ejercicio 1. Suma de todos los elementos de un array
//Crea un array de 8 números enteros e inicialízalo con números aleatorios [0,500]. Calcula y muestra la suma de todos los elementos del array.

public class Bateria_ejer1 {
    static void main() {
        int[] numeros = new int[8];
        Random aleatorio = new Random();

        // Rellenar el array con números aleatorios [0,500]
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(501);
        }

        // Calcular la suma
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Mostrar resultados
        System.out.print("Array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("Suma total: " + suma);
    }
}
