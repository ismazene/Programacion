package org.example;


import java.util.Scanner;

public class Actividad {
    static void main (){
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Como te llamas?");
        String nombre = teclado.nextLine();

        System.out.println("¿¿A que curso vas??");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Introduce un numero..");
        int numero1 = teclado.nextInt();

        System.out.println("Introduce un numero..");
        int numero2 = teclado.nextInt();

        int resultado = numero1 + numero2;
        System.out.println("El resultado es " + resultado);


        adfafasf
    }
}
