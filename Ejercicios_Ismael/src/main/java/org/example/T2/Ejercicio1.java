package org.example.T2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String contraseñaCorrecta = "1234";
        String contraseña;

        do {
            System.out.print("Introduce la contraseña: ");
            contraseña = teclado.nextLine();

            if (!contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            }

        } while (!contraseña.equals(contraseñaCorrecta));

        System.out.println("¡Contraseña correcta!");

    }
}
