package org.example.PREU2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir?: ");
        int n = teclado.nextInt();
        int mayores = 0;
        int menores = 0;
        int iguales = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Mayores que 0: " + mayores);
        System.out.println("Menores que 0: " + menores);
        System.out.println("Iguales a 0: " + iguales);
    }
}
//Acordarse de uqe hay que ir introduciendo valores a las variables para contabilizar
