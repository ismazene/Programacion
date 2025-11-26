package org.example.T3.PRACTICAS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class la_primitiva {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeros_random[] = new int[6];
        int numero_complementario;

        System.out.println("Introduce los datos de tu boleto:");
        String numeros_Boleto = teclado.nextLine();

        // Validar el formato de entrada
        if (numeros_Boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")) {
            String[] numeros_split = numeros_Boleto.split("[-/]");

            System.out.println(Arrays.toString(numeros_split));

            for (int i = 0; i < 6; i++) {
                int numero = Integer.parseInt(numeros_split[i]);

                if (numero < 1 || numero > 49) {
                    System.err.println("El numero " + numero + " no es valido.");
                    return;
                }
hola
            }

            int reintegro = Integer.parseInt(numeros_split[6]);

            if (reintegro < 0 || reintegro > 9) {
                System.err.println("El reintegro debe estar entre el 0 y el 9 .");
                return;
            }

        } else {
            System.err.println("ERROR: Has introducido mal el formato");
            return;
        }

        System.out.println("Ha salido: ");

        //While para que se repita cada vez que este mal
        boolean repetidos;
        do {
            repetidos = false;

            for (int i = 0; i < numeros_random.length; i++) {
                numeros_random[i] = aleatorio.nextInt(49) + 1;
            }
            int[] numeros_sinDuplicados = Arrays.stream(numeros_random).distinct().toArray();

            if (numeros_sinDuplicados.length != numeros_random.length) {
                repetidos = true;
            }

            Arrays.sort(numeros_random);

        } while (repetidos);
        System.out.println(Arrays.toString(numeros_random));

        //Bucle casi igual que el de arriba
        boolean numero_coincide;
        do {
            numero_complementario = aleatorio.nextInt(49) + 1;

            // Comprobar si coincide con los ganadores
            numero_coincide = false;
            for (int i = 0; i < numeros_random.length; i++) {
                if (numero_complementario == numeros_random[i]) {
                    numero_coincide = true;
                }
            }

            if (!numero_coincide) {
                //Si no coincide sale del bucle, si pongo return me voy de todo...
                break;
            }


        } while (true);

        System.out.println("Complementario: " + numero_complementario);
        int reintegro = aleatorio.nextInt(9) + 1;
        System.out.println("Reintegro: " + reintegro);

        // Convertir los números del boleto a enteros
        int[] numeros_usuario = new int[6];
        String[] numeros_split = numeros_Boleto.split("[-/]");
        for (int i = 0; i < 6; i++) {
            numeros_usuario[i] = Integer.parseInt(numeros_split[i]);
        }

        // Contar aciertos
        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros_usuario[i] == numeros_random[j]) {
                    aciertos++;
                }
            }
        }
        // Comprobar reintegro coincide
        boolean reintegroCoincide = (reintegro == Integer.parseInt(numeros_split[6]));

        // Comprobar numero coincide
        boolean complementarioCoincide = false;
        for (int i = 0; i < 6; i++) {
            if (numeros_usuario[i] == numero_complementario) {
                complementarioCoincide = true;
                break;
            }
        }

        // Mostramos categoria
        switch (aciertos) {
            case 6:
                if (reintegroCoincide) {
                    System.out.println("¡Categoría Especial! (6 aciertos + reintegro)");
                } else {
                    System.out.println("¡Primera categoría! (6 aciertos)");
                }
                break;
            case 5:
                if (complementarioCoincide) {
                    System.out.println("");
                    System.out.println("¡Segunda categoría! (5 aciertos + complementario)");
                } else {
                    System.out.println("");
                    System.out.println("¡Tercera categoría! (5 aciertos)");
                }
                break;
            case 4:
                System.out.println("");
                System.out.println("¡Cuarta categoría! (4 aciertos)");
                break;
            case 3:
                System.out.println("");
                System.out.println("¡Quinta categoría! (3 aciertos)");
                break;
            default:
                System.out.println("");
                    System.out.println("No premiado");
                break;
        }


    }

}
