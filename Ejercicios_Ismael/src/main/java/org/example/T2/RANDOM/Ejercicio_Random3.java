package org.example.T2.RANDOM;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Random3 {
    static void main() {
        Random aleatorio = new Random();
1
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introudce un numero minimo");
        int num_min = teclado.nextInt();

        System.out.println("Introduce el numero maximo");
        int num_max = teclado.nextInt();

        if (num_min > num_max) {
            System.out.println("Por dios ponme los numeros bien anda");
        }

        System.out.println("Cuantos numeros aleatorios quieres???");
        int numeros = teclado.nextInt();

        System.out.println("Estos son lo numeros...");
        for (int i = 0; i < numeros; i++) {
            int num = aleatorio.nextInt(num_max - num_min + 1) + num_min;
            System.out.println(num);
        }

    }
}

