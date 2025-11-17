package org.example.T3;

public class Etiquetado {
    static void main() {

        bucle_fuera:
        for (int i = 0; i < 10; i++) {
            bucle_dentro:
            System.out.println("Bucle fuera: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Bucle dentro " + j);
                if (j==4){
                    continue bucle_fuera;
                }
            }
        }
    }
}
