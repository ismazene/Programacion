package org.example.T2.PREU2;

public class Cadenas {

    static void main() {
        // Creamos una cadena de texto (String)
        String frase = "Netanyahu oro le regala una paloma de oro a Trump";

        // Devuelve el tamaño (número de caracteres) de la cadena
        int tamanyo = frase.length();
        System.out.println(tamanyo); // Imprime la longitud de la frase

        // Muestra el carácter que está en la posición 34
        System.out.println(frase.charAt(34));

        // Extrae una subcadena desde la posición 38 hasta la 43 (el índice final no se incluye)
        String trozo = frase.substring(38, 44);
        System.out.println(trozo);

        // Extrae una subcadena desde la posición 38 hasta el final de la cadena
        String trozo2 = frase.substring(38);
        System.out.println(trozo2);

        // Devuelve la posición de la primera aparición de la palabra "oro"
        int posicion_oro = frase.indexOf("oro");
        System.out.println(posicion_oro);

        // Devuelve la posición de la siguiente aparición de "oro", empezando desde el carácter 13
        int posicion_oro2 = frase.indexOf("oro", 13);
        System.out.println(posicion_oro2);

        // Devuelve la posición de la última aparición de "oro" en la cadena
        int posicion_oro_ultima = frase.lastIndexOf("oro");
        System.out.println(posicion_oro_ultima);

        // Convierte toda la frase a mayúsculas
        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        // Convierte toda la frase a minúsculas
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        // Cadena con espacios a la derecha
        String nombre = "IváN                       ";

        // trim() elimina los espacios al inicio y final de la cadena
        System.out.println(nombre.trim() + " - " + nombre + "#");
        // ↑ se imprime la versión recortada, la original (con espacios) y el carácter "#" para mostrar los espacios

        // Convierte el nombre a mayúsculas
        String nombre_mayus = nombre.toUpperCase();

        // Compara si, al pasar a mayúsculas y quitar espacios, es igual a "IVÁN"
        boolean iguales = nombre_mayus.trim().equals("IVÁN");
        System.out.println(iguales); // true si son iguales exactamente (respetando acentos y mayúsculas)

        // Compara ignorando mayúsculas/minúsculas
        boolean iguales2 = nombre.trim().equalsIgnoreCase("Iván");
        System.out.println(iguales2); // true si son iguales sin importar las mayúsculas

        // Reemplaza la palabra "paloma" por "palOma"
        String cambiada = frase.replace("paloma", "palOma");
        System.out.println(cambiada);

        // Concatena otra cadena al final usando concat()
        String frase_concatenada = frase.concat(" de EEUU");
        System.out.println(frase_concatenada);

        // Otra forma de concatenar usando el operador +
        System.out.println(frase + " de EEUU");

        // === Métodos adicionales opcionales ===

        // Ejemplo de compareTo(): compara dos cadenas lexicográficamente
        String texto1 = "Java";
        String texto2 = "java";
        int comparacion = texto1.compareTo(texto2);
        System.out.println("Resultado compareTo: " + comparacion);
        // Retorna un número negativo porque 'J' tiene un valor Unicode menor que 'j'

        // Ejemplo de equalsIgnoreCase con palabras distintas
        boolean mismoTexto = "hola".equalsIgnoreCase("HOLA");
        System.out.println("¿Son iguales ignorando mayúsculas?: " + mismoTexto);

        // Ejemplo de replace con caracteres
        String saludo = "H0la Mund0";
        String saludoReemplazado = saludo.replace('0', 'o');
        System.out.println(saludoReemplazado); // "Hola Mundo"

    }

}

