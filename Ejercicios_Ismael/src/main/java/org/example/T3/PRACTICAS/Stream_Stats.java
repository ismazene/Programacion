package org.example.T3.PRACTICAS;

import java.util.Arrays;
import java.util.Scanner;

public class Stream_Stats {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** ESTADÍSTICAS PREMIOS ESLAND ***");
        System.out.println("-----------------------------------");

        String nombre_Streamer;
        do {
            System.out.print("Inserta el Streamer a analizar: ");
            nombre_Streamer = teclado.nextLine();
            if (nombre_Streamer == "") {
                System.out.println("Debes introducir algun streamer");
                System.out.println(" ");
            }
        } while (nombre_Streamer == "");

        boolean correcto;
        String[] espectadores_String;
        int[] espectadores = new int[5];

        do {
            correcto = true;
            System.out.print("Inserta los espectadores medidos: ");
            espectadores_String = teclado.nextLine().split(" ");

            if (espectadores_String.length != 5) {
                System.out.println("Debes introducir exactamente 5 numeros solo separados por espacios");
                System.out.println(" ");

                correcto = false;
                continue;
            }

            for (int i = 0; i < 5; i++) {
                try {
                    espectadores[i] = Integer.parseInt(espectadores_String[i]);
                    if (espectadores[i] <= 0) {
                        System.out.println("Cada numero tiene que ser mayor que 0.");
                        correcto = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debes introducir solo numeros enteros.");
                    System.out.println(" ");
                    correcto = false;
                    break;
                }
            }
        } while (!correcto);

        String[] comentarios_String;
        int[] comentarios = new int[5];
        do {
            correcto = true;
            System.out.print("Inserta el numero de comentarios: ");
            comentarios_String = teclado.nextLine().split(" ");

            if (comentarios_String.length != 5) {
                System.out.println("Debes introducir exactamente 5 numeros solo separados por espacios");
                System.out.println(" ");
                correcto = false;
                continue;
            }

            for (int i = 0; i < 5; i++) {
                try {
                    comentarios[i] = Integer.parseInt(comentarios_String[i]);
                    if (comentarios[i] < 0) {
                        System.out.println("Cada valor de comentarios debe ser 0 o mayor.");
                        System.out.println(" ");
                        correcto = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debes introducir solo numeros enteros.");
                    System.out.println(" ");
                    correcto = false;
                    break;
                }
            }

        } while (!correcto);

        int max = espectadores[0];
        for (int i = 1; i < 5; i++) {
            if (espectadores[i] > max) {
                max = espectadores[i];
            }
        }

        int min = espectadores[0];
        for (int i = 1; i < 5; i++) {
            if (espectadores[i] < min) {
                min = espectadores[i];
            }
        }

        double mejor_Ratio = 0;
        int momento_Hype = 1;

        for (int i = 0; i < 5; i++) {
            double ratio = comentarios[i] / espectadores[i];
            if (ratio > mejor_Ratio) {
                mejor_Ratio = ratio;
                momento_Hype = i + 1;
            }
        }

        double racha = ((max - min) * 100) / max;

        System.out.println("-----------------------------------");
        System.out.println("@ " + nombre_Streamer);
        System.out.println("MAX = " + max);
        System.out.println("HYPE = " + momento_Hype + " (" + mejor_Ratio + ")");
        System.out.println("RACHA = " + racha);
    }
}
