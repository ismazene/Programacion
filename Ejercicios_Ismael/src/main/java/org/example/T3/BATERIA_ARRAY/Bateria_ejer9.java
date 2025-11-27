package org.example.T3.BATERIA_ARRAY;

import java.util.Scanner;

//Crea un array de tipo String y muestra la palabra más larga que contenga.

public class Bateria_ejer9 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        System.out.println(frase);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
    }
}
