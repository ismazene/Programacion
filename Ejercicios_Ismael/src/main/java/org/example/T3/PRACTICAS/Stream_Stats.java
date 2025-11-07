package org.example.T3.PRACTICAS;

import java.util.Arrays;
import java.util.Scanner;

public class Stream_Stats {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("*** ESTADÍSTICAS PREMIOS ESLAND ***");
        System.out.println("------------------------------------");

        System.out.print("Inserta streamer a analizar: ");
        String streamer = teclado.nextLine();

        System.out.print("Inserta los espectadores medios: ");
        String espectadores_medios = teclado.nextLine();
        String[] vector_espectadores = espectadores_medios.split(" ");

        for (int i = 0; i < vector_espectadores.length; i++) {
            int espectadores_int = Integer.parseInt(Arrays.toString(vector_espectadores));
            
            }

        System.out.println(Arrays.toString(vector_espectadores));

        System.out.print("Inserta el número de comentarios ");
        String cometarios = teclado.nextLine();
        String[] vector_comentarios = espectadores_medios.split(" ");

        System.out.println(Arrays.toString(vector_comentarios));


        System.out.println("Resultados para el streamer:");
        System.out.println(streamer);

        //Aqui ya es logica...

    }
}
