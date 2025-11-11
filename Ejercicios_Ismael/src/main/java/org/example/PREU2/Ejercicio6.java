package org.example.PREU2;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos hay?");
        int n = teclado.nextInt();
        int sumaEdades = 0;
        int sumaAlturas = 0;
        int mayores18 = 0;
        int mas175cm = 0;
        for (int i = 0; i < n; i++) {

            System.out.println("Introduce edad y altura (cm) del alumno " + (i+1) + ":");
            int edad = teclado.nextInt();
            int altura = teclado.nextInt();

            sumaEdades += edad;
            sumaAlturas += altura;
            if (edad > 18) {
                mayores18++;
            }
            if (altura > 175) {
                mas175cm++;
            }
        }
        System.out.println("Edad media: " + (sumaEdades / (double)n));
        System.out.println("Altura media: " + (sumaAlturas / (double)n));
        System.out.println("Alumnos mayores de 18: " + mayores18);
        System.out.println("Alumnos que miden más de 175 cm: " + mas175cm);
    }
}
