package com.alejandropobes.tema05.strings;

public class Ejercicio10 {
    /**
     * Comprueba si el texto es palíndromo (se lee igual de izquierda a derecha y de derecha a izquierda)
     * @param texto la frase o palabra a comprobar
     * @return true si es palíndromo, false en caso contrario
     */
    public static boolean esPalindromo(String texto) {
        // Eliminar espacios y pasar a minúsculas para una comparación precisa
        String textoSinEspacios = texto.replaceAll("\\s", "").toLowerCase();

        // Crear el reverso de la cadena y compararlo con el original
        String reverso = new StringBuilder(textoSinEspacios).reverse().toString();
        return textoSinEspacios.equals(reverso);
    }

    public static void main(String[] args) {
        String s1 = "Hola Mundo";
        String s2 = "Ana";
        String s3 = "ab";
        String s4 = "asi mario oira misa";

        System.out.println("¿Es palíndromo? " + esPalindromo(s1)); // false
        System.out.println("¿Es palíndromo? " + esPalindromo(s2)); // true
        System.out.println("¿Es palíndromo? " + esPalindromo(s3)); // false
        System.out.println("¿Es palíndromo? " + esPalindromo(s4)); // true
    }
}

