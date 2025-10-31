package org.example.PREU2;

import java.util.Random;
import java.util.Scanner;

public class examen2024 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final double MAX = 10;
        int num = aleatorio.nextInt(101);
        System.out.println("Tienes 10 intentos para acertar el numero");

        int numero = 0;
        for (int i = 10; i > 0; i--) {
            System.out.println("Escribe un numero.");
            numero = teclado.nextInt();

            System.out.println("Te quedan: " + (i-1) + " intentos");

            if (i-1 == 0){
                System.out.println("Has perdido");
            }
            if (numero == num){
                System.out.println("HAS acertado OLEEE");
                break;
            } else if (numero > num) {
                System.out.println("Estas cerca pero por encima");
            } else {
                System.out.println("Estas por debajo");
            }
            System.out.println(num);

        }

        }
}
