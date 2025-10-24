package org.example.T1;

import java.util.Scanner;

public class BateriaEjercicio3 {
    static void main() {
        final int CERO = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero porfavor. :)");
        int num = teclado.nextInt();

        if (num > CERO) {
            System.out.println("El numero introducido es mayor que cero");
        } else if (num == CERO) {
            System.out.println("El numero introducido es igual que cero");
        } else {
            System.out.println("El numero introducido es menor que cero");
        }
    }
}
