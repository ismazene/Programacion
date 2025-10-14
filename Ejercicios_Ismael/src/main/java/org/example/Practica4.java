package org.example;

import java.util.Scanner;

public class Practica4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        boolean repetir = false;
        int num2 = 0;
        boolean repetir_num2 = false;
        do{
            try{
                System.out.println("Introduce el multiplicando (3 cifras):");
                num1 = teclado.nextInt();
                repetir = false;
            }catch (Exception err){
                System.err.println("El formato introducido no es correcto.");
                repetir=true;
            }
            teclado.nextLine();
        }while (repetir==true);

        do{
            try{
                System.out.println("Introduce el multiplicador (3 cifras):");
                num2 = teclado.nextInt();
                repetir_num2 = false;
            }catch (Exception err){
                System.err.println("El formato introducido no es correcto.");
                repetir_num2=true;
            }
            teclado.nextLine();


        }while (repetir_num2==true);

        int producto = num1*num2;
        System.out.println("El producto de la multiplicación es: " + producto );

        String num1_string = Integer.toString(num1);

        String num1_Izquierda = num1_string.substring(0,1);
        String num1_Medio = num1_string.substring(1,2);
        String num1_Derecha = num1_string.substring(2,3);

        int num_1_Izquierda = Integer.parseInt(num1_Izquierda);
        int num_1_Medio = Integer.parseInt(num1_Medio);
        int num_1_Derecha = Integer.parseInt(num1_Derecha);



        String num2_string = Integer.toString(num2);

        String num2_Izquierda = num2_string.substring(0,1);
        String num2_Medio = num2_string.substring(1,2);
        String num2_Derecha = num2_string.substring(2,3);

        int num_2_Izquierda = Integer.parseInt(num2_Izquierda);
        int num_2_Medio = Integer.parseInt(num2_Medio);
        int num_2_Derecha = Integer.parseInt(num2_Derecha);

        System.out.println("   " + num1_Izquierda + num1_Medio + num1_Derecha);
        System.out.println("x" + "  " + num1_Izquierda + num1_Medio + num1_Derecha);
        System.out.println("--------");
    }
}
