package org.example.T2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres sumar?: ");
        int cantidad = teclado.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Inserta nº" + i + ": ");
            int numero = teclado.nextInt();
            suma += numero;
        }

        System.out.println("El resultado es: " + suma);
    }
}
