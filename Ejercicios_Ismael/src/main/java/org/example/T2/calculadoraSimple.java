package org.example.T2;

import java.util.Scanner;

public class calculadoraSimple {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**** BIENVENIDO A LA CALCULADORA SIMPLE ****");

        double num1 = 0;
        double num2 = 0;

        try {
            System.out.print("Introduce  operando: ");
            num1 = teclado.nextDouble();
        } catch (Exception e) {
            System.err.println("ERROR: El formato es incorrecto");
            return;
        }

        System.out.println("---------------------");

        System.out.println("[+] -> Sumar");
        System.out.println("[-] -> Restar");
        System.out.println("[*] -> Multiplicar");
        System.out.println("[/] -> Dividir");
        System.out.println("[R] -> Raíz Cuadrada");

        System.out.println("---------------------");

        teclado.nextLine();
        System.out.print("Elige una operación: ");
        String opcion = teclado.nextLine();

        if (!opcion.equalsIgnoreCase("R")) {
            System.out.print("Introduce el segundo numero: ");
            try {
                num2 = teclado.nextDouble();
            } catch (Exception e) {
                System.err.println("ERROR: El formato es incorrecto");
                return;
            }
        }

        double resultado;

        switch (opcion) {
            case "+":
                resultado = num1 + num2;
                System.out.println("El esultado de " + num1 + " + " + num2 + " = " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado de " + num1 + " - " + num2 + " = " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado de " + num1 + " * " + num2 + " = " + resultado);
                break;

            case "/":
                if (num2 == 0) {
                    System.err.println("No se puede dividir entre 0");
                } else {
                    resultado = num1 / num2;
                    System.out.println("El resultado de " + num1 + " / " + num2 + " = " + resultado);
                }
                break;

            case "R":
            case "r":
                if (num1 < 0) {
                    System.err.println("No se puede hacer la raiz cuadrada de un numero negativo");
                } else {
                    resultado = Math.sqrt(num1);
                    System.out.println("El resultado de la raíz cuadrada de " + num1 + " = " + resultado);
                }
                break;

            default:
                System.err.println("Solo puedes poner opciones validas :/");
        }
    }
}