package org.example.T2.PREU2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int max = 0;
        int contadorMayor1000 = 0;

        System.out.println("Introduce 5 sueldos:");

        for (int i = 0; i < 5; i++) {
            int sueldo = teclado.nextInt();
            if (sueldo > max) {
                max = sueldo;
            }
            if (sueldo > 1000) {
                contadorMayor1000++;
            }
        }
        System.out.println("Sueldo máximo: " + max);
        System.out.println("Cantidad que ganan más de 1000€: " + contadorMayor1000);
    }
}
