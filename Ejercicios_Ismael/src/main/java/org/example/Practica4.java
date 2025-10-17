package org.example;

import java.util.Scanner;

public class Practica4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        boolean repetir = false;
        int num2 = 0;
        boolean repetir_num2 = false;

        do {
            try {
                System.out.println("Introduce el multiplicando (3 cifras):");
                num1 = teclado.nextInt();

                if ((num1 >= 100 && num1 <= 999) || (num1 <= -100 && num1 >= -999)) {
                    repetir = false;
                } else {
                    System.err.println("Debe ser un número de 3 cifras.");
                    repetir = true;
                }
            } catch (Exception err) {
                System.err.println("El formato introducido no es correcto.");
                repetir = true;
                teclado.nextLine();
            }
        } while (repetir);

        do {
            try {
                System.out.println("Introduce el multiplicador (3 cifras):");
                num2 = teclado.nextInt();

                if ((num2 >= 100 && num2 <= 999) || (num2 <= -100 && num2 >= -999)) {
                    repetir_num2 = false;
                } else {
                    System.err.println("Debe ser un número de 3 cifras.");
                    repetir_num2 = true;
                }
            } catch (Exception err) {
                System.err.println("El formato introducido no es correcto.");
                repetir_num2 = true;
                teclado.nextLine();
            }
        } while (repetir_num2);

        int producto = num1 * num2;
        System.out.println("El producto de la multiplicación es: " + producto);

        String num2_string = Integer.toString(num2);
        String num2_Izquierda;
        String num2_Medio;
        String num2_Derecha;

        if (num2 > 0) {
            num2_Izquierda = num2_string.substring(0, 1);
            num2_Medio = num2_string.substring(1, 2);
            num2_Derecha = num2_string.substring(2, 3);
        } else {
            num2_Izquierda = num2_string.substring(1, 2);
            num2_Medio = num2_string.substring(2, 3);
            num2_Derecha = num2_string.substring(3, 4);
        }

        int num_2_Izquierda = Integer.parseInt(num2_Izquierda);
        int num_2_Medio = Integer.parseInt(num2_Medio);
        int num_2_Derecha = Integer.parseInt(num2_Derecha);

        System.out.println("   " + num1);
        System.out.println("x  " + num2);
        System.out.println("--------");

        int n1 = num1 * num_2_Derecha;
        int n2 = num1 * num_2_Medio;
        int n3 = num1 * num_2_Izquierda;

        System.out.println("   " + n1);
        System.out.println("  " + n2);
        System.out.println(" " + n3);
        System.out.println("--------");
        System.out.println(" " + producto);
    }
}