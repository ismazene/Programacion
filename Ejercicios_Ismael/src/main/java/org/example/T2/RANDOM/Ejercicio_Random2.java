package org.example.T2.RANDOM;

import java.util.Random;

public class Ejercicio_Random2 {
    static void main() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random aleatorio = new Random();

        String contra = "";
        for (int i = 0; i < 12; i++) {
            contra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }

        System.out.println("Contraseña generada: " + contra);
    }
}
