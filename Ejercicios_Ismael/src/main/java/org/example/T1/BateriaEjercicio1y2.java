package org.example.T1;

import java.util.Scanner;

public class BateriaEjercicio1y2 {
    static void main() {

        final int JORNADA = 40;
        final double TARIFA = 1.5;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, dime cuantas horas has trabajado :)");
        double horas_trabajo = teclado.nextDouble();

        System.out.println("Y cual es la tarifa/h");
        double tarifa_h = teclado.nextDouble();

        double resultado = horas_trabajo * tarifa_h;


        if (horas_trabajo >= JORNADA){

            double resultado2 = horas_trabajo*TARIFA;
            double resultado_total = resultado+resultado2;

            System.out.println("Hola tu sueldo es de..." + resultado_total + "euros ");
        } else {
            System.out.println("Hola tu sueldo es de..." + resultado + "euros ");

        }

    }


}
