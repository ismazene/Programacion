package org.example.T2.RANDOM;

import java.util.Random;

public class Ejercicio_Random1 {
    static void main() {
        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6) + 1; // 1-6
        int dado2 = aleatorio.nextInt(6) + 1; // 1-6
        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma total: " + suma);
    }
}
1