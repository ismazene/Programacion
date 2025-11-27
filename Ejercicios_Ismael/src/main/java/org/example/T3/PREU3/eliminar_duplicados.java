package org.example.T3.PREU3;

import java.util.Arrays;

public class eliminar_duplicados {
    static void main() {

        int numeritos[] = {1, 2, 3, 4, 5, 6, 6};
        int numeritos2[] = Arrays.stream(numeritos).distinct().toArray();
        System.out.println(Arrays.toString(numeritos));
        System.out.println(Arrays.toString(numeritos2));
    }

}
