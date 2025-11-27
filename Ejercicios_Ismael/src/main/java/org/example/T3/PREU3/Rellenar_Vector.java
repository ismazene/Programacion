package org.example.T3.PREU3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Rellenar_Vector {

    static void main() {

        // 1. RELLENAR ELEMENTO POR ELEMENTO
        int[] vector1 = new int[5];
        vector1[0] = 10;
        vector1[1] = 20;
        vector1[2] = 30;
        vector1[3] = 40;
        vector1[4] = 50;

        // 2. RELLENAR CON UN BUCLE FOR
        int[] vector2 = new int[5];
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = i * 10; // ejemplo (0,10,20,30,40)
        }

        // 3. RELLENAR CON UN LITERAL (directo)
        int[] vector3 = {5, 10, 15, 20, 25};

        // 4. RELLENAR CON VALORES ALEATORIOS
        int[] vector4 = new int[5];
        Random random = new Random();

        for (int i = 0; i < vector4.length; i++) {
            vector4[i] = random.nextInt(100); // números del 0 al 99
        }

        System.out.print("Vector aleatorio: ");
        for (int num : vector4) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. RELLENAR PIDIENDO DATOS AL USUARIO
        Scanner teclado = new Scanner(System.in);
        int[] vector5 = new int[5];

        for (int i = 0; i < vector5.length; i++) {
            System.out.print("Introduce un número para vector5[" + i + "]: ");
            vector5[i] = teclado.nextInt();
        }

        teclado.nextLine(); // limpiar buffer después de nextInt()

        // Otra forma: guardar varios números de una línea
        System.out.print("Introduce los porcentajes de los 4 factores externos (compi-pista-pala-pelota) separados por espacio: ");
        String linea = teclado.nextLine();

        String[] partes = linea.split(" ");
        int[] porcentajes = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            porcentajes[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("Valores guardados en el vector porcentajes:");
        for (int num : porcentajes) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. COMPARAR VECTORES CON BUCLE FOR
        System.out.println("--- Comparación usando bucle for ---");
        int n1 = vector1.length;
        int n2 = vector2.length;

        for (int i = 0; i < n2; i++) {
            boolean encontrado = false;
            for (int j = 0; j < n1; j++) {
                if (vector2[i] == vector1[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println(vector2[i] + " está en vector1");
            } else {
                System.out.println(vector2[i] + " NO está en vector1");
            }
        }

        // 7. COMPARAR VECTORES CON Arrays.asList + contains
        System.out.println("--- Comparación usando Arrays.asList + contains ---");
        Integer[] vector1Obj = new Integer[n1];
        for (int i = 0; i < n1; i++) vector1Obj[i] = vector1[i];

        for (int i = 0; i < n2; i++) {
            if (Arrays.asList(vector1Obj).contains(vector2[i])) {
                System.out.println(vector2[i] + " está en vector1");
            } else {
                System.out.println(vector2[i] + " NO está en vector1");
            }
        }

        // 8. MOSTRAR TODOS LOS VECTORES
        System.out.println("--- RESULTADOS ---");
        System.out.println("vector1: " + Arrays.toString(vector1));
        System.out.println("vector2: " + Arrays.toString(vector2));
        System.out.println("vector3: " + Arrays.toString(vector3));
        System.out.println("vector4: " + Arrays.toString(vector4));
        System.out.println("vector5: " + Arrays.toString(vector5));
        System.out.println("porcentajes: " + Arrays.toString(porcentajes));

        teclado.close();
    }
}
