package org.example.EjerciciosBUCLES;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int N = teclado.nextInt();

        System.out.println("Tabla del " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
