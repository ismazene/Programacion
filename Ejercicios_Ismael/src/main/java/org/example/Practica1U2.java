package org.example;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Practica1U2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();

        final double ANYO_MINIMO = 1900;
        int ANYO_ACTUAL = hoy.getYear();
        final double MES_MINIMO = 1;
        final double MES_MAXIMO = 12;
        final double DIA_MINIMO = 1;
        final double DIA_MAXIMO = 31;


        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        try {
            String fecha = teclado.nextLine();

            if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                System.err.println("Error: El formato de la fecha debe ser (dd/mm/aaaa)");
                return;
            }
            String dia_String = fecha.substring(0, 2);
            String mesString = fecha.substring(3, 5);
            String anyoString = fecha.substring(6, 10);

            int dia = Integer.parseInt(dia_String);
            int mes = Integer.parseInt(mesString);
            int anyo = Integer.parseInt(anyoString);

            if (dia < DIA_MINIMO || dia > DIA_MAXIMO) {
                System.out.println("Error: El dia debe estar entre el 1 y 31.");
                return;
            }

            if (mes < MES_MINIMO || mes > MES_MAXIMO) {
                System.out.println("Error: El mes debe estar entre el 1 y 12.");
                return;
            }

            if (anyo < ANYO_MINIMO || anyo > ANYO_ACTUAL) {
                System.out.println("Error: El año debe estar entre 1900 y el año actual.");
                return;
            }

            int suma = dia + mes + anyo;
            System.out.println(dia_String + " + " + mesString + " + " + anyoString + " = " + suma);

            String sumaString = Integer.toString(suma);

            String numero1 = sumaString.substring(0, 1);
            String numero2 = sumaString.substring(1, 2);
            String numero3 = sumaString.substring(2, 3);
            String numero4 = sumaString.substring(3, 4);

            int num1 = Integer.parseInt(numero1);
            int num2 = Integer.parseInt(numero2);
            int num3 = Integer.parseInt(numero3);
            int num4 = Integer.parseInt(numero4);

            int suma_anyo = num1 + num2 + num3 + num4;
            System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + suma_anyo);

            int suma_Anyo = num1 + num2 + num3 + num4;
            System.out.println("Tu número de la suerte es " + suma_Anyo);

        } catch (Exception e) {
            System.err.println("Error: Introduce un número válido en la fecha.");
            teclado.nextLine();
        }
    }
}
