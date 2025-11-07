package org.example.T3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bateria_ejer3 {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int vector [] = new int [25];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(101);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Numero a buscar...");
        int numero_buscar = teclado.nextInt();

        int contador = 0;
        for (int i = 0; i < vector.length; i++) {

            if (numero_buscar == vector[i]){
                contador++;
            }
        }
        System.out.println("El numero " + numero_buscar + " aparece " + contador + " veces en el vector");
    }
}
