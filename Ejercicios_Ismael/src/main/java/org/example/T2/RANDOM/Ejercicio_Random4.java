package org.example.T2.RANDOM;

import java.util.Random;

public class Ejercicio_Random4 {
    static void main() {

        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = mayus + minus + numeros;

        Random aleatorio = new Random();

        int longitud = aleatorio.nextInt(5) + 8;

        String contra = "";
        contra += mayus.charAt(aleatorio.nextInt(mayus.length()));
        contra += minus.charAt(aleatorio.nextInt(minus.length()));
        contra += numeros.charAt(aleatorio.nextInt(numeros.length()));

        for (int i = 3; i < longitud; i++) {
            contra += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
        }

        System.out.println("Contraseña generada: " + contra);
    }
}
