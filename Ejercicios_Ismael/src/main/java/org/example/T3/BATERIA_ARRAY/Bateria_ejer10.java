package org.example.T3.BATERIA_ARRAY;

import java.util.Scanner;

//Ejercicio 10. Identificar primera letra y contar
//Crea un array de tipo String que guarde palabras y pide una letra (char) al usuario.
// El programa deberá mostrar todas las palabras cuya primera letra sea el valor del char que ha introducido el usuario.

public class Bateria_ejer10 {
    static void main() {

        String[] palabras = {"casa", "coche", "perro", "gato", "cama", "pantalla", "cable"};

        Scanner teclado = new Scanner (System.in);

        // Pedimos una letra al usuario
        System.out.print("Introduce una letra: ");
        char letra = teclado.next().toLowerCase().charAt(0); // nos quedamos con la primera letra y la pasamos a minúscula

        System.out.println("Palabras que comienzan por '" + letra + "':");

        // Recorremos el array y comprobamos la primera letra
        for (String palabra : palabras) {
            if (palabra.toLowerCase().charAt(0) == letra) {
                System.out.println(palabra);
            }
        }
    }
}

