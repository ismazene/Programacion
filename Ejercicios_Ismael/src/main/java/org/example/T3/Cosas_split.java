package org.example.T3;

import java.util.Arrays;

public class Cosas_split {
    static void main() {
        String cadena = "MADRID,BARÇA,VALENCIA,ELCHE,HECULES,MUTXAMEL";
        String equipos[] = cadena.split(",");

        System.out.println(Arrays.toString(equipos));
    }
}