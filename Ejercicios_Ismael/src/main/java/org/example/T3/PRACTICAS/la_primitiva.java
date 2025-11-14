package org.example.T3.PRACTICAS;

import java.util.Arrays;
import java.util.Scanner;

public class la_primitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los datos de tu boleto:");
        String numeros_Boleto = teclado.nextLine();

        // Validar el formato de entrada
        if (numeros_Boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")) {
            String[] numeros_split = numeros_Boleto.split("[-/]");

            System.out.println(Arrays.toString(numeros_split));

            //ESTO ESTA MAL (REVISAR)
            int numeros_mal = 0;
            for (int i = 0; i < numeros_split.length; i++) {
                if (numeros_split.length < 1 || numeros_split.length > 49){
                    System.out.println("Porfavor, introduce numeros validos");
                }
                numeros_mal++;
            }

        } else {
            System.err.println("ERROR: Has introducido mal el formato");
        }
    }
}
