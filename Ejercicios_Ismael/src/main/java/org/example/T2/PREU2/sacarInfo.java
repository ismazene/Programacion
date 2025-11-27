package org.example.T2.PREU2;

import java.util.Scanner;

public class sacarInfo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        System.out.println("Dígitos por separado:");

        // Pasamos el número a String para facilitar el bucle
        String numeroStr = String.valueOf(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }
    }
}

//Siempre que queramos sacar info de un int debemos prmero pasarlo a String,
//si ya es un String o hace falta.