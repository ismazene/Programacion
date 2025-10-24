package org.example.T2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = teclado.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
