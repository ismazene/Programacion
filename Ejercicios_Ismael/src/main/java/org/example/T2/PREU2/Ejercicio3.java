package org.example.T2.PREU2;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Por cuántos meses quieres financiar?");
        int meses = teclado.nextInt(); // lee la cantidad de meses

        int pagoMensual = 10;     // el primer mes se pagan 10 €
        int total = 0;            // acumulador del total a pagar

        // bucle que recorre todos los meses
        for (int i = 1; i <= meses; i++) {

            System.out.println("Mes " + i + ": " + pagoMensual + "€");

            total += pagoMensual;   // suma el pago de este mes al total
            pagoMensual *= 2;       // el siguiente mes se duplica el pago
        }

        System.out.println("Total a pagar: " + total + "€");

    }
}
