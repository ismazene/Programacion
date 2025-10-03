package org.example;

import java.util.Scanner;

public class Practica3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final double ALTURA_MINIMA = 140;
        final double ALTURA_MAXIMA = 230;
        final double PESO_MAXIMO = 120;
        int altura = 0;

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        System.out.println("Leyendo altura (cm)...");
        try {
            altura = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR DE FORMATO");
            return;
        }

        double calculo_altura = ALTURA_MINIMA - altura;

        if (altura > ALTURA_MAXIMA || altura < 0) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELVE A SUBIR...");
        } else if (altura < ALTURA_MINIMA) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCION. Te faltan " + calculo_altura + "cm de altura.");
        } else {
            System.out.println("Leyendo peso (kg)...");
            int peso = teclado.nextInt();
            double peso_minimo = (altura * 2) / 8.0;

            double sobrepasar = peso - PESO_MAXIMO;

            if (peso > PESO_MAXIMO) {
                System.out.println("LO SIENTO. Sobrepasas " + sobrepasar + "kg el límite de la atracción");
            }else if (peso_minimo > peso){
                System.out.println("LO SIENTO. Necesitas " + peso_minimo + "kg para subirte a la atracción");
            } else {
                System.out.println("Pesas " + peso + "kg Peso minimo calculado es de " + peso_minimo + " kg");
                System.out.println("!!SUBE A LA ATRACCIÖN!!");
            }
        }
    }
}
