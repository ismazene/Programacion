package org.example;

import java.util.Scanner;

public class BateriaEjercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cual es el primer numero :)");
        int num1 = teclado.nextInt();
        System.out.println("Dime cual es el segundo numero :)");
        int num2 = teclado.nextInt();
        System.out.println("Dime cual es el tercer numero :)");
        int num3 = teclado.nextInt();

        if (num1 < num2 & num1 < num2) {
            System.out.println("El numero " + num1 + " es el numero menor de los tres");
        } else if (num1 == num2 || num1 == num2) {
            System.out.println("ERROR:Hay dos numeros iguales");
        }
        if (num2 < num1 & num2 < num3) {
            System.out.println("El numero " + num2 + " es el numero menor de los tres");
        } else if (num2 == num1 || num2 == num3) {
            System.out.println("ERROR:Hay dos numeros iguales");
        }
        if (num3 < num1 & num3 < num2) {
            System.out.println("El numero " + num3 + " es el numero menor de los tres");
        } else if (num3 == num1 || num3 == num2) {
            System.out.println("ERROR:Hay dos numeros iguales");
        }
    }
}
