package org.example;

import java.util.Scanner;

public class Embuclar {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        boolean repetir = false;

        do {
            try {
                System.out.println("Dime un numero");
                num = teclado.nextInt();
                repetir = false;
            } catch (Exception err) {
                System.out.println("El formato introducido no es correcto");
                repetir = true;
            }
        } while (repetir == true) ;
        System.out.println(num);
    }
}
