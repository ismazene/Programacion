package org.example.EjerciciosBUCLES;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una palabra o frase: ");
        String texto = teclado.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
}
