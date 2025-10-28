package org.example.PREU2;

import java.util.Scanner;

//Multiplicar la base tantas veces diga el exponente
//*= es para actualizar la variable por algo

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero (BASE)");
        int base = teclado.nextInt();

        System.out.println("Introduce el segundo numero (EXPONENTE)");
        int exponente = teclado.nextInt();

        if (exponente < 0) {
            System.err.println("NO puedes hacer nada con esto");
        }

        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
             resultado *= base;
        }
        System.out.println("El resultado es: " + resultado);

    }
}
