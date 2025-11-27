package org.example.T3.PREU3;
import java.util.Arrays;
import java.util.Scanner;

public class porquePierdoAlPadel {
    static void main() {
        final double MAXIMO = 100;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el porcentaje de los 4 factores externos (compi-pista-pala-pelota):");
        String Linea = teclado.nextLine(); //Esto es para leer toda la linea

        // Con esto se dividen los numeros por el espacio y creamos un array de int con todos los numeros
        String[] partes = Linea.split(" ");
        int[] vector_padel = new int[partes.length];


        // Validar mayor a 1 y menor a 90
        // Cada uno de los elementos se convierten en un INT

        for (int i = 0; i < partes.length; i++) {
            vector_padel[i] = Integer.parseInt(partes[i]);

            if (vector_padel[i] >= 1 && vector_padel[i] <= 90) {
            } else {
                System.out.println("Error: Los numeros deben de estar entre el 1 y el 90");
                return;
            }
        }

        int suma = 0;
        for (int i = 0; i < vector_padel.length; i++) {
            suma += vector_padel[i]; // sumar cada elemento
        }
        int resultado = (int) (MAXIMO - suma);
        System.out.println("==============================================================================");
        System.out.println("Tienes un " + resultado + "% de culpa.");

    }
}
