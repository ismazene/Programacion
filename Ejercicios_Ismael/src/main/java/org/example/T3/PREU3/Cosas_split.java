package org.example.T3.PREU3;

import java.util.Arrays;

public class Cosas_split {

    static void main() {

        // Cadena de texto que contiene varios equipos separados por comas
        String cadena = "MADRID,BARÇA,VALENCIA,ELCHE,HECULES,MUTXAMEL";

        // Divide la cadena en partes usando la coma como separador.
        // El resultado es un array de String con cada equipo como elemento.
        String equipos[] = cadena.split(",");

        // Se imprime el array completo con todos los equipos separados por comas.
        System.out.println(Arrays.toString(equipos));
    }
}
