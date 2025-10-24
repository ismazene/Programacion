package org.example.T2;

import java.util.Scanner;

public class Embuclar {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        boolean repetir = false;

        do{
            try{
                System.out.println("Introduce un número...");
                num = teclado.nextInt();
                repetir = false;
            }catch (Exception err){
                System.out.println("El formato introducido no es correcto.");
                repetir=true;
            }
            teclado.nextLine();
        }while (repetir==true);

        System.out.println(num);





    }
}